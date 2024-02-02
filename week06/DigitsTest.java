package w6_2277;

import java.util.Scanner;

/**
 * 사용자가 입력한 정수의 자리 수를 알려주는 프로그램.
 * @author 조성혁
 *
 */
public class DigitsTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("정수의 자리 수를 알려줍니다.");
		System.out.println("정수를 입력하시오.");
		System.out.println("int 타입 수이어야 하고, 0이 아니어야 합니다.");

		int num = input.nextInt();		//사용자가 정수를 입력한다.

		System.out.println(digits(num) + "자리 수입니다.");

		input.close();
	}

	/**
	 * 10의 거듭제곱을 만들어준다.
	 * 10의 0거듭제곱은 1이다.
	 * @param n 거듭제곱을 할 것인지를 지정한다. n은 0이상의 정수이어야 한다.
	 * @return 10의 n거듭제곱수
	 */
	public static int powersOfTen(int n) {
		int tens = 1;
		for(int i=0; i<n; i++) 
			tens = tens*10;

		return tens;
	}

	/**
	 * 주어진 수가 몇자리 수인지 알아낸다.
	 * @param n 주어진 정수. 0이 아니어여 한다.
	 * @return 주어진 수의 자릿수
	 */
	public static int digits(int n) {
		int i = 10;
		while (true) {
			if ((n/powersOfTen(i)) != 0)
				return i + 1;
			i--;
		}

	}

}
