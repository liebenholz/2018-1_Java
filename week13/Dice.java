package w13_2277;

/**
 * �ֻ��� �� ��
 * @author ������
 */
public class Dice {

	private Die die1;
	private Die die2;

	/**
	 * ������
	 */
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	/**
	 * �� ���� �ֻ����� ������
	 * @return �� �ֻ����� ���� ���� ������ ��
	 */
	public int roll() {
		return die1.roll() + die2.roll();
	}
}
