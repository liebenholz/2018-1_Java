package w4_2277;

import java.util.Scanner;

/**
 * 사칙연산을 하는 프로그램
 * 두 수를 입력한 다음에 연산기호를 작성한다.
 * 두 수는 항상 소수로 출력된다.
 * 적절한 연산기호가 입력되지 않으면 "지원하지 않는 연산자입니다."라고 출력한다.
 * 
 * @author 조성혁
 *
 */
public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.println("사칙 연산을 하는 프로그램입니다.");
		System.out.print("두 수를 차례대로 입력하시오: ");

		double a = input.nextDouble();		//첫번째 실수 입력
		double b = input.nextDouble();		//두번째 실수 입력

		System.out.println("두 수에 어떤 연산을 하시겠습니까?");
		System.out.print("+ - * / 중 하나를 입력하시오: ");

		String operator = input.next();		//연산자 입력하기

		double result = 0.0;

		switch (operator) {
		case "+":
			result = a + b;		//더하기
			break;
		case "-":
			result = a - b;		//빼기
			break;
		case "*":
			result = a * b;		//곱하기
			break;
		case "/":
			result = a / b;		//나누기
			break;
		default:				
			System.out.println("지원하지 않는 연산자입니다.");	//이외의 문자는 다음을 출력
			System.exit(-1);
		}

		System.out.printf("%.1f %s %.1f = %.2f", a, operator, b, result); //연산자가 제대로 입력되면 연산결과를 출력
		System.out.println();

		input.close();
	}

}
