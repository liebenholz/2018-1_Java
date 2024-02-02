package w13_2277;

import java.util.Random;

/**
 * 로또번호 6개 생성하는 프로그램.
 * @author 조성혁
 */
public class LottoNumber {

	public static void main(String[] args) {

		Random random = new Random();

		//50미만의 난수 6개를 생성한다.
		for (int i=0; i<6; i++) {
			int lotto = random.nextInt(50);
			System.out.print(lotto + " ");
		}

	}

}
