package w5_2277;

import java.util.Scanner;

/**
 * ���̽�ũ��, Ŀ��, ���� ���Ǳ� ���α׷�.
 * �������� �ŷ��� �����ϴ�.
 * �޴��� �����ִ� ��ɸ� ������.
 * �� ��� ����� ���� ����
 * 
 * main �޼ҵ� �ϳ��� ������.
 * @author ������
 *
 */
public class VendingMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int command = 0;		//��� ��ȣ ����
		int ice_cream = 0;
		int coffee = 0;
		int drink = 0;

		System.out.println("���̽�ũ��, Ŀ��, ���Ḧ �Ĵ� ���Ǳ��Դϴ�.");

		while (command!=4) {	//��� ��ȣ�� 4�϶����� �Ʒ��� �ݺ�

			System.out.println("� ������ ���Ͻʴϱ�?");

			System.out.println("���̽�ũ��:" + "\t" + "1");
			System.out.println("Ŀ��:" + "\t\t" + "2");
			System.out.println("����:" + "\t\t" + "3");
			System.out.println("����:" + "\t\t" + "4");

			System.out.print("��ȣ ����: ");
			command = input.nextInt();	//��� ��ȣ �Է�

			switch (command) {

			case 1 :			//���̽�ũ�� �޴�
				System.out.println();
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�ٴҶ� ���̽�ũ��(1000��):" + "\t" + "1");
				System.out.println("�Ƹ�� ���̽�ũ��(1400��):" + "\t" + "2");
				System.out.println("���� ���̽�ũ��(1400��):" + "\t" + "3");
				System.out.println("ȣ�� ���̽�ũ��(1400��):" + "\t" + "4");

				System.out.print("��ȣ ����: ");
				ice_cream = input.nextInt();

				if (ice_cream<=4 && ice_cream>=1)
					System.out.println(ice_cream + "����, �����մϴ�.");
				else
					System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");

				break;

			case 2 :			//Ŀ�� �޴�
				System.out.println();
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("�Ƹ޸�ĭ(1000��):" + "\t" + "1");
				System.out.println("ī���(1400��):" + "\t" + "2");
				System.out.println("����������(1400��):" + "\t" + "3");

				System.out.print("��ȣ ����: ");
				coffee = input.nextInt();

				if (coffee<=3 && coffee>=1)
					System.out.println(coffee + "����, �����մϴ�.");
				else
					System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");

				break;

			case 3 : 			//���� �޴�
				System.out.println();
				System.out.println("������ ��ðڽ��ϱ�?");
				System.out.println("����(1000��):" + "\t" + "1");
				System.out.println("�������꽺(1400��):" + "\t" + "2");
				System.out.println("�����꽺(1400��):" + "\t" + "3");
				System.out.println("����(1400��):" + "\t" + "4");

				System.out.print("��ȣ ����: ");
				drink = input.nextInt();

				if (drink<=4 && drink>=1)
					System.out.println(drink + "����, �����մϴ�.");
				else
					System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");

				break;

			case 4 :
				System.out.println("�����մϴ� �ŷ��� �����մϴ�.");			//����
				break;

			default :
				System.out.println("�ùٸ��� ���� ��ȣ�Դϴ�.");		//�̿��� ��ȣ�� �Է¹����� ������ ���
				break;
			}

			System.out.println();
		}

		input.close();		
	}

}
