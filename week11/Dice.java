package w11_2277;

/**
 * 주사위 n개를 던졌을 때 나온 눈의 수를 관찰하는 프로그램.
 * 사용자가 주사위의 개수와 시도 횟수를 조정할 수 있다.
 * @author 조성혁
 *
 */
public class Dice {

	public static void main(String[] args) {

		final int NUM_DICE = 2;		//매 시행마다 던질 주사위 수
		final int TRIALS = 1000;	//주사위 던지기를 몇 번 시행할 것인가?

		int[] occurence;			//각 수가 나온 횟수를 저장하기 위한 배열

		//occurence 배열 구성
		//배열의 크기는 NUM_DICE에 따라 달라진다
		//
		//(예)
		//NUM_DICE가 2일때는 13개의 방(0번부터 12번)을 만들어
		//0,1번은 사용하지 않고 2번부터 12번 방까지 사용한다.
		//(주사위 합이 0,1인 경우는 없기 때문에)
		//주사위 합이 2인 횟수는 2번 방에, 3인 횟수는 3번 방에,
		//..., 12인 횟수는 12번 방에 저장한다.
		//
		//NUM_DICE가 3일때는 19개의 방(0번부터 18번)을 만들어
		//0,1,2번은 사용하지 않고 3번부터 18번 방까지 사용한다.

		occurence = new int [6 * NUM_DICE + 1];
		int number;
		for (int i = 0; i < TRIALS; i++) {
			number = castDice(NUM_DICE);
			occurence[number]++; 
		}

		for (int i=0; i<6 * NUM_DICE + 1; i++) {
			System.out.println(i + "가 나온 횟수 : " + occurence[i]);
		}


	}

	/**
	 * n개의 주사위를 던져 나온 수를 반환한다.
	 * 주사위는 정육면체 주사위이다.
	 * @param n 주사위 수
	 * @return n개의 주사위를 던져 나온 수
	 */
	public static int castDice(int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += (int) (1 + Math.random()*6);
		}
		return sum;
	}
}
