package w6_2277;

import java.util.Scanner;
/**
 * 입력한 수보다 작거나 같은 "최대 정수의 제곱수"르 찾아주는 프로그램.
 * 음수를 입력하면 프로그램이 종료된다.
 * @author 조성혁
 *
 */
public class MaxSquareTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;

		System.out.println("어떤 수보다 작거나 같은 \"최대 정수의 제곱수\"를 찾을까요?");
		System.out.println("음이 아닌 정수를 입력하시오.");
		System.out.println("음수를 입력하면 프로그램이 종료됩니다.");
		System.out.println();

		while (!done) {
			System.out.print("입력 : ");
			int in = input.nextInt();

			if (in<0) {		//음수를 입력하면 프로그램이 종료된다.
				System.out.println("프로그램이 끝났습니다.");
				done = true;
			}
			else {			//음이 아닌 정수를 입력하면 maxSq	uare 메소드를 이용하여 입력한 정수보다 작거나 같은 최대 "정수의 제곱수"를 구한다.
				System.out.println(in + "보다 작거나 같은 최대\"정수의 제곱수\"는 " + maxSquare(in) + "입니다.");
			}
			System.out.println();

		}
		input.close();
	}

	/**
	 * 주어진 음이 아닌 정수보다
	 * 작거나 같은 "정수의 제곱수"들 중 최대값을 구한다.
	 * @param bound 주어진 정수. (음이 아닌 정수이어야 한다.)
	 * @return 최대 "정수의 제곱수"
	 */

	public static int maxSquare(int bound) {
		int max = 0;
		for (int i=0; i*i<=bound ;i++) {	//주어진 정수보다 작거나 같은 최대 "정수의 제곱수"를 구한다.
			max = i * i;					//해당 최대 "정수의 제곱수"를 max에 저장하여 반환한다.
		}

		return max;
	}

}
