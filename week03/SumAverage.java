package w3_2277;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 몇 개 더하시겠습니까? ");
		int a = input.nextInt();

		System.out.print(a + "개의 정수를 차례대로 입력하시오: ");

		int i;
		int sum=0;
		for (i=0; i<a; i++)
			sum = sum + input.nextInt();

		System.out.println("정수의 합 = " + sum);
		System.out.printf("평균 = %.2f" ,((double)sum/a));
		input.close();
	}

}