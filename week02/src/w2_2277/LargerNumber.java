package w2_2277;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("������ �� �� �Է��Ͻÿ�: ");
		int a = input.nextInt();
		int b = input.nextInt();

		if (a>b)
			System.out.println("�� ū ���� " + a + "�Դϴ�.");
		else if (a<b)
			System.out.println("�� ū ���� " + b + "�Դϴ�.");
		else
			System.out.println("�� ���� �����ϴ�.");

		input.close();
	}

}