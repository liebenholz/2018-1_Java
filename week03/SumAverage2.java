package w3_2277;

import java.util.Scanner;

public class SumAverage2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("평균을 구하는 프로그램");
		System.out.println("양의 정수를 여러 개 입력하시오.");
		System.out.println("입력을 마치려면 0 이하의 정수를 입력하시오.");

		int count = 0;
		int sum = 0;
		boolean done = false;

		while (!done) {
			int insert = input.nextInt();

			if (insert>0) {
				sum = sum + insert;
				count++;
			}
			else {
				System.out.println("양의 정수 갯수 = " + count);
				System.out.println("정수의 합 = " + sum);
				System.out.printf("평균 = %.2f" ,((double)sum/count));
				done = true;
			}

		}

		input.close();

	}

}
