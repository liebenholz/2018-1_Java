package w3_2277;

import java.util.Scanner;

public class SumAverage {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("������ �� �� ���Ͻðڽ��ϱ�? ");
		int a = input.nextInt();

		System.out.print(a + "���� ������ ���ʴ�� �Է��Ͻÿ�: ");

		int i;
		int sum=0;
		for (i=0; i<a; i++)
			sum = sum + input.nextInt();

		System.out.println("������ �� = " + sum);
		System.out.printf("��� = %.2f" ,((double)sum/a));
		input.close();
	}

}