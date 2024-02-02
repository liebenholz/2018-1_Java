package w4_2277;

import java.util.Scanner;

/**
 * Ű����κ��� ������� �޾Ƶ鿩 �� ������ ����� ���ϴ� ���α׷�
 * �Ҽ��� �� �ڸ����� ����ϰ�, ����� �ƴ� ���� �ԷµǸ� �Է��� ��ģ��.
 * ������ �Է��� �� �ְ�, �Ҽ��� �Է��� �����ϴ�.
 * ����� �ϳ��� �Էµ��� ������ "����� �ϳ��� �Էµ��� �ʾҽ��ϴ�."��� ����Ѵ�.
 * 
 * @author ������
 *
 */
public class Average {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		double in;				//�Է��ϴ� ��
		double sum = 0.0;		//���ݱ��� �Է��� ����� ��
		int count = 0;			//���ݱ��� �Է��� ����� ����
		boolean done = false;	

		System.out.println("������� ����� ���ϴ� ���α׷��Դϴ�.");
		System.out.println("�Է��� ��ġ���� 0 ������ ���� �Է��Ͻÿ�.");

		while (!done) {			//done�� true�� �� ������ �ݺ�
			System.out.print("���ڸ� �Է��Ͻÿ�: ");
			in = input.nextDouble();	//�� �Է�
			if (in>0) {
				sum = sum + in;			//����� �ԷµǸ� ����� ���� ��� ������ ���ϱ�
				count++;				//�Է��� ����� ������ +1
			}
			else						//�Էµ� ���� ����� �ƴϸ�
				done = true;			//done�� true�� �ٲٰ� �ݺ� ����
		}

		if (count>0)					//�Էµ� �� �߿� ����� �ϳ� �̻� �����ϸ�
			System.out.printf("��� = %.2f\n",(double) sum/count);	//����� �Ҽ��� 2�ڸ��� ǥ��

		else							//�Էµ� �� �߿� ����� �ϳ��� ������
			System.out.println("����� �ϳ��� �Էµ��� �ʾҽ��ϴ�.");			//�� ���� ���

		input.close();
	}

}
