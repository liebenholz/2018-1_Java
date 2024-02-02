package w13_2277;

/**
 * 주사위 한 쌍
 * @author 조성혁
 */
public class Dice {

	private Die die1;
	private Die die2;

	/**
	 * 구성자
	 */
	public Dice() {
		die1 = new Die();
		die2 = new Die();
	}

	/**
	 * 두 개의 주사위를 굴린다
	 * @return 두 주사위를 굴려 나온 숫자의 합
	 */
	public int roll() {
		return die1.roll() + die2.roll();
	}
}
