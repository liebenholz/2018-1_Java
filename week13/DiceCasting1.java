package w13_2277;

/**
 * 주사위 한 쌍을 20번 굴려 화면에 결과를 출력하는 프로그램.
 * @author 조성혁
 */
public class DiceCasting1 {

	public static void main(String[] args) {

		final int TRIAL = 20;	//주사위 던지는 횟수
		
		Dice dice = new Dice();
		
		for (int i=0; i<TRIAL; i++) {
			System.out.println(dice.roll());
		}

	}

}
