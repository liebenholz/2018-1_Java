package w6_2277;

import java.util.Scanner;

/**
 * 정수 세 개를 입력받아 그들 중 가장 큰 수를 알려주는 프로그램.
 * 
 * @author 조성혁
 *
 */
public class MaxTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("세 정수 중 가장 큰 수를 찾아줍니다.");
		System.out.println("세 개의 정수를 차례대로 입력하세요: ");

		int a = input.nextInt();	//정수 a 입력
		int b = input.nextInt();	//정수 b 입력
		int c = input.nextInt();	//정수 c 입력

		System.out.println("세 정수 중 가장 큰 수는 " + max(a,b,c) + "입니다.");		//max메소드를 불러와 세 정수 중 가장 큰 값을 출력한다.

		input.close();
	}

	/**
	 * 주어진 세 개의 정수들 중 가장 큰 수를 찾아준다/\.
	 * @param i 첫 정수
	 * @param j 두번재 정수
	 * @param k 세번째 정수
	 * @return i, j, k 즁 가증 큰 수.
	 */
	public static int max(int i, int j, int k)
	{
		int temp;
		if (i>j) {					//a가 b보다 크면 위치 바꾸기 
			temp = i;
			i = j;
			j= temp;
		}
		if (j>k) {					//b가 c보다 크면 위치 바꾸기
			temp = j;
			j = k;
			k = temp;
		}
		return k;					//위와 같은 과정을 거치면 c가 가장 큰 수로 나타난다.
	}
}
