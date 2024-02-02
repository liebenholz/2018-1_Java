package w13_2277;

import java.util.Random;

public class Die {
	public final int MAX = 6;
	Random random;

	/**
	 * ������
	 */
	public Die() {
		random = new Random();
	}

	/**
	 * �ֻ����� ������
	 * �ֻ����� ���� ������ ���ڴ� 1 �̻� 6 ���ϴ�.
	 * @return 1���� 6 ������ ����
	 */
	public int roll() {
		return random.nextInt(MAX) + 1;
	}
}
