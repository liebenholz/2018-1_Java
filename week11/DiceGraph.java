package w11_2277;

/**
 * 주사위 n개를 던졌을 때 나온 눈의 수를 관찰하는 프로그램.
 * 사용자가 주사위의 개수와 시도 횟수를 조정할 수 있다.
 * 마지막엔 그래프로 횟수의 확률분포표를 출력한다. 
 * @author 조성혁
 *
 */
public class DiceGraph {

	public static void main(String[] args) {

		final int NUM_DICE = 5;		//매 시행마다 던질 주사위 수
		final int TRIALS = 10000;	//주사위 던지기를 몇 번 시행할 것인가?
		final int HEIGHT = 50;

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
			System.out.println(i + "가 나온 횟수 : " + occurence[i] + " ");	//횟수출력
		}
		System.out.println();
		graph(occurence, HEIGHT);	//그래프출력

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

	/**
	 * 배열 a의 원소 중 최대값을 찾아 반환한다.
	 * @param a 배열을 가리키는 참조변수
	 * @return 최대값
	 */
	public static int max(int[] a) {
		int max = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	/**
	 * 배열 a를 그래프로 그린다.
	 * 그래프는 별문자 '*'를 인쇄하여 그린다.
	 * 
	 * 별 문자 하나가 단순히 1을 의미하도록 하면
	 * 배열에 들어 있는 숫자들이 큰 값일 때
	 * 별 문자를 너무 많이 그려야 하므로 (그래프가 너무 커지므로)
	 * 배열에 들ㅇ 있는 숫자가 얼마나 큰 수인지에 따라
	 * 별 문자 하나가 의미하는 크기가 조정되도록 한다.
	 * 
	 * height는 배열에 들어 있는 숫자들 중 가장 큰 수를
	 * 별 문자 몇 개로 표현할 것인지를 지정해준다.
	 * 배열에 들어 있는 수 중 가장 큰 수가 910이고
	 * height가 50이면
	 * 별 문자 하나는 910/50 = 18.2를 의미하게 된다.
	 * 
	 * @param a 배열
	 * @param height 그래프의 최대 높이
	 * 				 가장 큰 수를 별 문자 몇 개로 그릴 것인가를 나타냄.
	 */
	public static void graph(int[] a, int height) {

		int maximum;		//배열에서 가장 큰 수
		maximum = max(a);
		float quantum;		//별 문자 하나가 숫자 얼마에 해당하나?
		quantum = (float) maximum/height;

		//star로 배열의 그래프를 그린다.
		for (int i=0; i<a.length; i++) {
			System.out.printf("%-10s", i + " : " + a[i]);
			for (int j = 0; j < a[i]/quantum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
