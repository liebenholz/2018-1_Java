package w4_2277;

import java.util.Scanner;

/**
 * ���� �Է��ϰ� ���ϴ� ������ �Է��Ͽ� �� ���������� �ŵ�����ǥ�� �ۼ��ϴ� ���α׷�.
 * ���� ������ �Է��ϸ�, ������ �ڿ����� �Է¹޴´�.
 * 
 * @author ������
 *
 */
public class Powers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int result = 1;						//�������� �Է��� ���� ����

		System.out.println("�ŵ����� ǥ�� ����ϴ� ���α׷��Դϴ�.");
		System.out.print("� ���� �ŵ����� ǥ�� ����Ͻðڽ��ϱ�? ������ �Է��ϼ���: ");
		int index = input.nextInt();		//�� �Է�

		System.out.print("�� �������� ����Ͻðڽ��ϱ�? �ڿ����� �Է��ϼ���: ");
		int exponent = input.nextInt();		//���� �Է�

		for (int i=1; i<=exponent; i++) {
			result = result * index;
			System.out.println(index + " ^ " + i + " = " + result);		//������ ���
		}
		input.close();
	}

}
