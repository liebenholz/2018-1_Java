package w3_2277;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("어떤 수의 배수들을 출력할까요? ");
		int a = input.nextInt();

		System.out.println("1 이상 100 이하 수 중 " + a + "의 배수들");
		for (int i=1; i<=100; i++)
			if (i%a==0)
				System.out.printf(i + " ");

		input.close();

	}

}