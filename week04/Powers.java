package w4_2277;

import java.util.Scanner;

/**
 * 밑을 입력하고 원하는 지수를 입력하여 그 지수까지의 거듭제곱표를 작성하는 프로그램.
 * 밑은 정수를 입력하며, 지수는 자연수로 입력받는다.
 * 
 * @author 조성혁
 *
 */
public class Powers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int result = 1;						//제곱수를 입력할 변수 선언

		System.out.println("거듭제곱 표를 출력하는 프로그램입니다.");
		System.out.print("어떤 수의 거듭제곱 표를 출력하시겠습니까? 정수를 입력하세요: ");
		int index = input.nextInt();		//밑 입력

		System.out.print("몇 제곱까지 출력하시겠습니까? 자연수를 입력하세요: ");
		int exponent = input.nextInt();		//지수 입력

		for (int i=1; i<=exponent; i++) {
			result = result * index;
			System.out.println(index + " ^ " + i + " = " + result);		//제곱수 출력
		}
		input.close();
	}

}
