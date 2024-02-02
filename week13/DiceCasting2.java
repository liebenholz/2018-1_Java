package w13_2277;

/**
 * 주사위 한 쌍을 1000번 굴려 각 수가 몇 번 나왔는지 표시하는 프로그램.
 * @author 조성혁
 */
public class DiceCasting2 {

	public static void main(String[] args) {

		final int TRIAL = 1000;	//주사위 던지는 횟수

		Dice dice = new Dice();

		//결과값을 저장
		int[] occurence = new int [13];
		int number;
		for (int i = 0; i < TRIAL; i++) {
			number = dice.roll();
			occurence[number]++; 
		}

		//결과 출력
		for (int i=1; i<13; i++) {
			System.out.println(i + ": \t" + occurence[i]);
		}

	}

}
