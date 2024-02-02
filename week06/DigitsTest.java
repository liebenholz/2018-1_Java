package w6_2277;

import java.util.Scanner;

/**
 * ����ڰ� �Է��� ������ �ڸ� ���� �˷��ִ� ���α׷�.
 * @author ������
 *
 */
public class DigitsTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("������ �ڸ� ���� �˷��ݴϴ�.");
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.println("int Ÿ�� ���̾�� �ϰ�, 0�� �ƴϾ�� �մϴ�.");

		int num = input.nextInt();		//����ڰ� ������ �Է��Ѵ�.

		System.out.println(digits(num) + "�ڸ� ���Դϴ�.");

		input.close();
	}

	/**
	 * 10�� �ŵ������� ������ش�.
	 * 10�� 0�ŵ������� 1�̴�.
	 * @param n �ŵ������� �� �������� �����Ѵ�. n�� 0�̻��� �����̾�� �Ѵ�.
	 * @return 10�� n�ŵ�������
	 */
	public static int powersOfTen(int n) {
		int tens = 1;
		for(int i=0; i<n; i++) 
			tens = tens*10;

		return tens;
	}

	/**
	 * �־��� ���� ���ڸ� ������ �˾Ƴ���.
	 * @param n �־��� ����. 0�� �ƴϾ �Ѵ�.
	 * @return �־��� ���� �ڸ���
	 */
	public static int digits(int n) {
		int i = 10;
		while (true) {
			if ((n/powersOfTen(i)) != 0)
				return i + 1;
			i--;
		}

	}

}
