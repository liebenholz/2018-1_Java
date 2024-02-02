package w5_2277;

/**
 * 1부터 100까지의 자연수를 더한 값,
 * 2부터 101까지의 자연수를 더한 값,
 * 3부터 102까지의 자연수를 더한 값,
 * ...
 * 20부터 119까지의 자연수를 더한 값을 출력하는 프로그램.
 * 자연수는 1 이상의 정수로 정의한다.
 * 
 * @author 조성혁
 *
 */
public class Summations2 {

	public static void main(String[] args) {

		int from = 1;	//구간 시작 값을 1로 시작
		int to = 100;	//구간 끝 값을 100으로 시작

		while (from<=20) {		//구간 시작 값이 20이 될 때가지
			System.out.printf("Summation of natural numbers form " + from + " to " + to + " = ");
			System.out.println(sumResult(from, to));
			from++;		//구간 시작 값에 +1
			to++;		//구간 끝 값에 +1

		}

	}

	/**
	 * 주어진 구간의 자연수의 합을 구한다.
	 * @param from 구간의 시작 값
	 * @param to 구간의 끝 값
	 * @return 주어진 구간의 자연수의 합
	 */
	public static int sumResult(int from, int to) {
		int sum = 0;
		for (int i=from; i<=to; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
