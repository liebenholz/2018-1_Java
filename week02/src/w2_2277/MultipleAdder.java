package w2_2277;

import java.util.Scanner;

public class MultipleAdder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("정수를 몇 개 더하시겠습니까? ");
		int n = input.nextInt();

		System.out.print(n + "개의 정수를 차례대로 입혁하시오: ");

		int a;
		int sum = 0;
		for (a=0; a<n; a++)
			sum = sum + input.nextInt();

		System.out.println("정수의 합  = " + sum);

		input.close();

	}

}