package w2_2277;

import java.util.Scanner;

public class BinaryOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("�Ǽ��� �� �� �Է��Ͻÿ�: ");
		double a = input.nextDouble();
		double b = input.nextDouble();

		System.out.println(a + "+" + b + "=" + (a+b));
		System.out.println(a + "-" + b + "=" + (a-b));
		System.out.println(a + "*" + b + "=" + (a*b));
		System.out.println(a + "/" + b + "=" + (a/b));

		input.close();
	}

}