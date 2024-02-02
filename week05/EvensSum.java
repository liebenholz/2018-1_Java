package w5_2277;

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

		int from;	//������ ���۰�
		int to;		//������ ����
		boolean done = false;

		while (!done) {

			System.out.println("������ ������ ¦������ ���� ���մϴ�.");
			System.out.print("�� ���� ������ �Է��Ͻÿ� : ");
			from = input.nextInt();
			to = input.nextInt();

			if (from==to) {		//������ ���۰��� ������ ������ ����
				done = true;	
				System.out.println("�����մϴ�. ���α׷��� ��ġ�ڽ��ϴ�.");
			}
			else {
				if (from>to) {	//ó������ �Է��� ���� ���߿� �Է��� ������ ũ�� �� ���� ��ġ�� �ٲ��ش�.
					int temp = from;
					from = to;
					to = temp;
				}
				int sum = getEvenSum(from, to);
				System.out.println(from + "���� " + to + "������ ¦���� �� = " + sum);
				System.out.println();

			}
		}

		input.close();

	}
	/**
	 * �־��� �� �� ������ ¦���� ���� ���Ѵ�.
	 * �־��� ���� ¦���̸� �� ���� �տ� ���Խ�Ų��.
	 * �������� : from <= to
	 * 
	 * @param from �־��� ��
	 * @param to �־��� ��
	 * @return �־��� ������ ¦���� ��
	 */
	public static int getEvenSum(int from, int to) {
		int sum = 0;

		for (int i=from; i<=to; i++) {
			if (i%2==0)
				sum = sum + i;
		}

		return sum;
	}
}








