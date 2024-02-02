package w13_2277;

import java.util.Random;

public class Die {
	public final int MAX = 6;
	Random random;

	/**
	 * 구성자
	 */
	public Die() {
		random = new Random();
	}

	/**
	 * 주사위를 굴린다
	 * 주사위를 굴려 나오는 숫자는 1 이상 6 이하다.
	 * @return 1부터 6 사이의 난수
	 */
	public int roll() {
		return random.nextInt(MAX) + 1;
	}
}
