package w4_2277;

import java.util.Scanner;

/**
 * ��Ģ������ �ϴ� ���α׷�
 * �� ���� �Է��� ������ �����ȣ�� �ۼ��Ѵ�.
 * �� ���� �׻� �Ҽ��� ��µȴ�.
 * ������ �����ȣ�� �Էµ��� ������ "�������� �ʴ� �������Դϴ�."��� ����Ѵ�.
 * 
 * @author ������
 *
 */
public class Calculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.println("��Ģ ������ �ϴ� ���α׷��Դϴ�.");
		System.out.print("�� ���� ���ʴ�� �Է��Ͻÿ�: ");

		double a = input.nextDouble();		//ù��° �Ǽ� �Է�
		double b = input.nextDouble();		//�ι�° �Ǽ� �Է�

		System.out.println("�� ���� � ������ �Ͻðڽ��ϱ�?");
		System.out.print("+ - * / �� �ϳ��� �Է��Ͻÿ�: ");

		String operator = input.next();		//������ �Է��ϱ�

		double result = 0.0;

		switch (operator) {
		case "+":
			result = a + b;		//���ϱ�
			break;
		case "-":
			result = a - b;		//����
			break;
		case "*":
			result = a * b;		//���ϱ�
			break;
		case "/":
			result = a / b;		//������
			break;
		default:				
			System.out.println("�������� �ʴ� �������Դϴ�.");	//�̿��� ���ڴ� ������ ���
			System.exit(-1);
		}

		System.out.printf("%.1f %s %.1f = %.2f", a, operator, b, result); //�����ڰ� ����� �ԷµǸ� �������� ���
		System.out.println();

		input.close();
	}

}
