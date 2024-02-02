package w4_2277;

import java.util.Scanner;

/**
 * ATM���� �۵��ϴ� ���α׷�
 * ������� ���¿� �ִ� �ʱ�ݾ��� 5000���̴�.
 * �ܾ� Ȯ���� 1��, ���� ������ 2��, �Ա��� 3��, ����� 4���� �Է��ϸ� �ȴ�.
 * �̿��� ���� �Է��ϸ� "�ùٸ��� ���� ��ȣ�Դϴ�."�� ����Ѵ�.
 * 
 * ��, �����Ϸ��� �ݾ��� �ܰ��� Ŭ ������ ������ ����Ѵ�.
 * 
 * @author ������
 *
 */
public class ATMMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int money;				//�Ա� �Ǵ� �����Ϸ��� ��
		double remain = 5000;	//�ܰ�

		System.out.println("ATM ���α׷��Դϴ�. ��ȣ�� �Է��ϼ���");
		System.out.println("�ܾ� Ȯ��:" + "\t" + "1");
		System.out.println("���� ����:" + "\t" + "2");
		System.out.println("�Ա�:" + "\t" + "3");
		System.out.println("����:" + "\t" + "4");

		System.out.print("��ȣ ����: ");
		int command = input.nextInt();	//��� ��ȣ �Է�

		switch (command) {

		case 1 :
			System.out.println("�ܾ��� " + remain + "���Դϴ�.");	//�ܰ� Ȯ��
			break;

		case 2 :
			System.out.print("�ݾ���? ");
			money = input.nextInt();				//���� �ݾ� �Է�

			if (remain<money) 						//�����Ϸ��� �ݾ��� �ܾ׺��� ũ��
				System.out.println("���� ���ڸ��ϴ�.");	//������ ���
			else {
				remain = remain - money;			//����
				System.out.println("���� ��������.");	
			}

			System.out.println("�ܾ��� " + remain + "���Դϴ�.");		
			break;

		case 3 : 
			System.out.print("�ݾ���? ");
			money = input.nextInt();				//�Ա� �ݾ� �Է�

			remain = remain + money;				//�Ա�
			System.out.println("�ܾ��� " + remain + "���� �Ǿ����ϴ�.");
			break;

		case 4 :
			System.out.println("�����մϴ�.");			//����
			break;

		default :
			System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");		//�̿��� ��ȣ�� �Է¹����� ������ ���
			break;
		}

		input.close();
	}

}
