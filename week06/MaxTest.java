package w6_2277;

import java.util.Scanner;

/**
 * ���� �� ���� �Է¹޾� �׵� �� ���� ū ���� �˷��ִ� ���α׷�.
 * 
 * @author ������
 *
 */
public class MaxTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("�� ���� �� ���� ū ���� ã���ݴϴ�.");
		System.out.println("�� ���� ������ ���ʴ�� �Է��ϼ���: ");

		int a = input.nextInt();	//���� a �Է�
		int b = input.nextInt();	//���� b �Է�
		int c = input.nextInt();	//���� c �Է�

		System.out.println("�� ���� �� ���� ū ���� " + max(a,b,c) + "�Դϴ�.");		//max�޼ҵ带 �ҷ��� �� ���� �� ���� ū ���� ����Ѵ�.

		input.close();
	}

	/**
	 * �־��� �� ���� ������ �� ���� ū ���� ã���ش�/\.
	 * @param i ù ����
	 * @param j �ι��� ����
	 * @param k ����° ����
	 * @return i, j, k �O ���� ū ��.
	 */
	public static int max(int i, int j, int k)
	{
		int temp;
		if (i>j) {					//a�� b���� ũ�� ��ġ �ٲٱ� 
			temp = i;
			i = j;
			j= temp;
		}
		if (j>k) {					//b�� c���� ũ�� ��ġ �ٲٱ�
			temp = j;
			j = k;
			k = temp;
		}
		return k;					//���� ���� ������ ��ġ�� c�� ���� ū ���� ��Ÿ����.
	}
}
