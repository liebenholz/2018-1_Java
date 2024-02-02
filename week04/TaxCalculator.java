package w4_2277;

import java.util.Scanner;

/**
 * 소득을 입력하면 누진세가 적용된 소득세를 계산해주는 프로그램
 * 연소득이 3000만원 이하는 세율 10%, 7000만원 이하는 18%, 이를 초과하면 30%다.
 * 
 * 예를 들어 연소득이 8000만원일 때, 소득세는 다음과 같다. 
 * 3000만원*10/100 + (7000만원-3000만원)*18/100 + (8000만원-7000만원)*30/100 = 1320만원
 * 
 * @author 조성혁
 *
 */
public class TaxCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double tax = 0;		//소득세 기본값은 0

		final double TAX_RATE_LOW = 10.0/100.0; //3000만원 이하의 금액에서의 세율
		final double TAX_RATE_MID= 18.0/100.0;	//7000만원 이하의 금액에서의 세율
		final double TAX_RATE_HIGH= 30.0/100.0;	//7000만원 초과의 금액에서의 세율


		System.out.print("소득은? ");
		double salary = input.nextDouble();		//소득 입력

		if (salary>70000000) 					//7000만원 초과일 때
			tax = 30000000 * TAX_RATE_LOW + (70000000 - 30000000) * TAX_RATE_MID + (salary - 70000000) * TAX_RATE_HIGH;

		else if (salary>30000000)				//7000만원 이하일 때
			tax = 30000000 * TAX_RATE_LOW + (salary - 30000000) * TAX_RATE_MID;

		else if (salary>0)						//3000만원 이하일 때
			tax = salary * TAX_RATE_LOW;

		System.out.println("소득세 = " + tax);		//소득세를 소득에 따라 알맞게 출력

		input.close();
	}

}
