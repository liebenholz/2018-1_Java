package w3_2277;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("� ���� ������� ����ұ��? ");
		int a = input.nextInt();

		System.out.println("1 �̻� 100 ���� �� �� " + a + "�� �����");
		for (int i=1; i<=100; i++)
			if (i%a==0)
				System.out.printf(i + " ");

		input.close();

	}

}