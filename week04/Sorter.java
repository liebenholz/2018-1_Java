package w4_2277;

import java.util.Scanner;

/**
 * ���� �� ���� �Է¹޾� �̵��� ������������ �ۼ��ϴ� ���α׷�
 * 
 * @author ������
 *
 */
public class Sorter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("�� ���� ������ �Է��ϼ���: ");

		int a = input.nextInt();	//���� a �Է�
		int b = input.nextInt();	//���� b �Է�
		int c = input.nextInt();	//���� c �Է�
		int storage;

		if (a>b) {					//a�� b���� ũ�� ��ġ �ٲٱ� 
			storage = a;
			a = b;
			b = storage;
		}
		if (a>c) {					//a�� c���� ũ�� ��ġ �ٲٱ�
			storage = a;
			a = c;
			c = storage;
		}
		if (b>c) {					//b�� c���� ũ�� ��ġ �ٲٱ�
			storage = b;
			b = c;
			c = storage;
		}

		System.out.println(a + " " + b + " " + c);		//���� ���� ������ ��ġ�� a,b,c�� ������������ ������. �̸� ������� ���.

		input.close();
	}

}
