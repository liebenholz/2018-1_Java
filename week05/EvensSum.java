package w5_2277;

import java.util.Scanner;

/**
 * 두 수를 입력하면 그 사이의 짝수들의 합을 구하는 프로그램.
 * 주어진 수가 짝수이면 그 수도 함께 포함시킨다.
 * 
 * 입력받은 두 수가 같을 때까지 반복한다.
 * 
 * @author 조성혁
 *
 */
public class EvensSum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int from;	//구간의 시작값
		int to;		//구간의 끝값
		boolean done = false;

		while (!done) {

			System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
			System.out.print("두 개의 정수를 입력하시오 : ");
			from = input.nextInt();
			to = input.nextInt();

			if (from==to) {		//구간의 시작값과 끝값이 같으면 종료
				done = true;	
				System.out.println("감사합니다. 프로그램을 마치겠습니다.");
			}
			else {
				if (from>to) {	//처음으로 입력한 값이 나중에 입력한 값보다 크면 두 값의 위치를 바꿔준다.
					int temp = from;
					from = to;
					to = temp;
				}
				int sum = getEvenSum(from, to);
				System.out.println(from + "부터 " + to + "까지의 짝수의 합 = " + sum);
				System.out.println();

			}
		}

		input.close();

	}
	/**
	 * 주어진 두 수 사이의 짝수의 합을 구한다.
	 * 주어진 수가 짝수이면 그 수도 합에 포함시킨다.
	 * 전제조건 : from <= to
	 * 
	 * @param from 주어진 수
	 * @param to 주어진 수
	 * @return 주어진 구간의 짝수의 합
	 */
	public static int getEvenSum(int from, int to) {
		int sum = 0;

		for (int i=from; i<=to; i++) {
			if (i%2==0)
				sum = sum + i;
		}

		return sum;
	}
}








