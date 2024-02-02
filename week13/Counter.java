package w13_2277;

import java.util.Scanner;

/**
 * ���º��� value�� �̿��� Counter Ŭ������ ����
 * @author ������
 */
public class Counter {

	private int value;	//�ʵ�

	/**
	 * ������
	 */
	public Counter() {
		value = 0;
	}

	/**
	 * ������
	 * @param n value�� �ʱⰪ.
	 */
	public Counter(int n) {
		value = n;
	}

	/**
	 * value�� ����
	 */
	public void countUp() {
		value++;
	}

	/**
	 * value�� ����
	 */
	public void countDown() {
		value--;
	}

	/**
	 * value�� 0���� ����
	 */
	public void clear() {
		value = 0;
	}

	/**
	 * ���� value�� ��ȯ
	 * @return
	 */
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Counter count = new Counter();
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("0�� �Ϻ��ϸ� �����մϴ�.");
			System.out.print("������ �Է��ϼ���: ");
			int command = input.nextInt();

			if(command > 0) {
				count.countUp();
			}
			else if(command < 0) {
				count.countDown();
			}
			else {
				System.out.println(count.getValue());
				break;
			}
		}

		input.close();
	}
}

