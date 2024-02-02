package w6_2277;

import java.util.Scanner;
/**
 * �Է��� ������ �۰ų� ���� "�ִ� ������ ������"�� ã���ִ� ���α׷�.
 * ������ �Է��ϸ� ���α׷��� ����ȴ�.
 * @author ������
 *
 */
public class MaxSquareTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		boolean done = false;

		System.out.println("� ������ �۰ų� ���� \"�ִ� ������ ������\"�� ã�����?");
		System.out.println("���� �ƴ� ������ �Է��Ͻÿ�.");
		System.out.println("������ �Է��ϸ� ���α׷��� ����˴ϴ�.");
		System.out.println();

		while (!done) {
			System.out.print("�Է� : ");
			int in = input.nextInt();

			if (in<0) {		//������ �Է��ϸ� ���α׷��� ����ȴ�.
				System.out.println("���α׷��� �������ϴ�.");
				done = true;
			}
			else {			//���� �ƴ� ������ �Է��ϸ� maxSq	uare �޼ҵ带 �̿��Ͽ� �Է��� �������� �۰ų� ���� �ִ� "������ ������"�� ���Ѵ�.
				System.out.println(in + "���� �۰ų� ���� �ִ�\"������ ������\"�� " + maxSquare(in) + "�Դϴ�.");
			}
			System.out.println();

		}
		input.close();
	}

	/**
	 * �־��� ���� �ƴ� ��������
	 * �۰ų� ���� "������ ������"�� �� �ִ밪�� ���Ѵ�.
	 * @param bound �־��� ����. (���� �ƴ� �����̾�� �Ѵ�.)
	 * @return �ִ� "������ ������"
	 */

	public static int maxSquare(int bound) {
		int max = 0;
		for (int i=0; i*i<=bound ;i++) {	//�־��� �������� �۰ų� ���� �ִ� "������ ������"�� ���Ѵ�.
			max = i * i;					//�ش� �ִ� "������ ������"�� max�� �����Ͽ� ��ȯ�Ѵ�.
		}

		return max;
	}

}
