package w6_2277;

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

		boolean done = false;

		while (!done) {

			System.out.println("정해진 구간의 짝수들의 합을 구합니다.");
			System.out.print("두 개의 정수를 입력하시오 : ");
			int num1 = input.nextInt();
			int num2 = input.nextInt();

			if (num1==num2) {		//구간의 시작값과 끝값이 같으면 종료
				done = true;	
				System.out.println("감사합니다. 프로그램을 마치겠습니다.");
			}
			else {
				int sum = getEvensSum(num1, num2);		//getEvensSum 메소드 불러오기.
				System.out.println(num1 + "부터 " + num2 + "까지의 짝수의 합 = " + sum);
				System.out.println();
			}
		}

		input.close();

	}
	/**
	 * 주어진 두 수 사이의 짝수의 합을 구한다.
	 * 주어진 수가 짝수이면 그 수도 합에 포함시킨다.
	 * 
	 * @param from 주어진 수
	 * @param to 주어진 수
	 * @return 주어진 구간의 짝수의 합
	 */
	public static int getEvensSum(int from, int to) {
		int sum = 0;
		if (from>to) {	//처음으로 입력한 값이 나중에 입력한 값보다 크면 두 값의 위치를 바꿔준다.
			int temp = from;
			from = to;
			to = temp;
		}
		for (int i=from; i<=to; i++) {		//해당 구간에서 짝수만 sum에 더해준다.
			if (i%2==0)
				sum = sum + i;
		}

		return sum;
	}
}