package w3_2277;

import java.util.Scanner;

public class SumAverage2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("����� ���ϴ� ���α׷�");
		System.out.println("���� ������ ���� �� �Է��Ͻÿ�.");
		System.out.println("�Է��� ��ġ���� 0 ������ ������ �Է��Ͻÿ�.");

		int count = 0;
		int sum = 0;
		boolean done = false;

		while (!done) {
			int insert = input.nextInt();

			if (insert>0) {
				sum = sum + insert;
				count++;
			}
			else {
				System.out.println("���� ���� ���� = " + count);
				System.out.println("������ �� = " + sum);
				System.out.printf("��� = %.2f" ,((double)sum/count));
				done = true;
			}

		}

		input.close();

	}

}
