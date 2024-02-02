package w5_2277;

/**
 * 100까지의 자연수를 더한 값,
 * 101까지의 자연수를 더한 값,
 * 102까지의 자연수를 더한 값,
 * ...
 * 120까지의 자연수를 더한 값을 출력하는 프로그램.
 * 자연수는 1 이상의 정수로 정의한다.
 * 
 * @author 조성혁
 *
 */
public class Summations {

	public static void main(String[] args) {

		int upto = 100;			//구간의 끝 값을 100부터 시작하여
		while (upto<=120) {		//120까지 출력한다.

			System.out.printf("Summation of natural numbers upto " + upto + " = ");
			System.out.println(sum(upto));		//자연수들의 합을 출력하는 메소드로 연결한다.
			upto++;

		}

	}

	/**
	 * 
	 * @param upto 자연수들의 합의 끝 값
	 * @return 해당 값까지의 자연수들의 합
	 */
	public static int sum(int upto) {
		int sum = 0;
		for (int i=1; i<=upto; i++) {
			sum = sum + i;
		}

		return sum;
	}

}