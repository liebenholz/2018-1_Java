package w6_2277;

import java.util.Scanner;

/**
 * �� ���� �Է��ϸ� �� ������ ¦������ ���� ���ϴ� ���α׷�.
 * �־��� ���� ¦���̸� �� ���� �Բ� ���Խ�Ų��.
 * 
 * �Է¹��� �� ���� ���� ������ �ݺ��Ѵ�.
 * 
 * @author ������
 *
 */
public class EvensSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;

		while (!done) {

			System.out.println("������ ������ ¦������ ���� ���մϴ�.");
			System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if (num1==num2) {		//������ ���۰��� ������ ������ ����
				done = true;	
				System.out.println("�����մϴ�. ���α׷��� ��ġ�ڽ��ϴ�.");
			}
			else {
				int sum = getEvensSum(num1, num2);		//getEvensSum �޼ҵ� �ҷ�����.
				System.out.println(num1 + "���� " + num2 + "������ ¦���� �� = " + sum);
				System.out.println();
			}
		}

		input.close();

	}
	/**
	 * �־��� �� �� ������ ¦���� ���� ���Ѵ�.
	 * �־��� ���� ¦���̸� �� ���� �տ� ���Խ�Ų��.
	 * 
	 * @param from �־��� ��
	 * @param to �־��� ��
	 * @return �־��� ������ ¦���� ��
	 */
	public static int getEvensSum(int from, int to) {
		int sum = 0;
		if (from>to) {	//ó������ �Է��� ���� ���߿� �Է��� ������ ũ�� �� ���� ��ġ�� �ٲ��ش�.
			int temp = from;
			from = to;
			to = temp;
		}
		for (int i=from; i<=to; i++) {		//�ش� �������� ¦���� sum�� �����ش�.
			if (i%2==0)
				sum = sum + i;
		}

		return sum;
	}
}