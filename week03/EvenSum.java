package w3_2277;

import java.util.Scanner;

public class EvenSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("������ ������ ¦������ ���� ���մϴ�.");

		System.out.print("���� �� ���� ���� ����? ");
		int lowerBound = input.nextInt();

		System.out.print("���� �� ���� ū ����? ");
		int upperBound = input.nextInt();

		int sum = 0;

		for	(int i=lowerBound; i<=upperBound; i++)
			if (i%2==0) 
				sum = sum + i;

		System.out.println(lowerBound + "����" + upperBound + "������ ¦���� �� = " + sum);

		input.close();

	}

}
