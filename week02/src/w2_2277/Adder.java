package w2_2277;

import java.util.Scanner;

public class Adder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("������ �� �� �Է��Ͻÿ�: ");
		int a = input.nextInt();
		int b = input.nextInt();

		System.out.println(a + "+" + b + "=" + (a+b));

		input.close();
	}

}