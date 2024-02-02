package w2_2277;

import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("정수를 두 개 입력하시오: ");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(a + "+" + b + "=" + (a+b));

		input.close();
	}

}