package w2_2277;

import java.util.Scanner;

public class MultipleAdder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("������ �� �� ���Ͻðڽ��ϱ�? ");
		int n = input.nextInt();

		System.out.print(n + "���� ������ ���ʴ�� �����Ͻÿ�: ");

		int a;
		int sum = 0;
		for (a=0; a<n; a++)
			sum = sum + input.nextInt();

		System.out.println("������ ��  = " + sum);

		input.close();

	}

}