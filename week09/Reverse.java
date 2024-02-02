package w9_2277;

import java.util.Scanner;

/**
 * 키보드로부터 10개의 정수를 차례로 읽어 역순으로 출력하는 프로그램
 * @author 조성혁
 *
 */
public class Reverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] list  = new int[10];

		System.out.println("정수 10개를 차례로 입력하시오:");
		//사용자가 입력한 정수를 numbers[0], numbers[1], ... ,numbers[9]에 차례로 저장한다.
		for(int i=0; i<list.length; i++) {
			list[i] = input.nextInt();
		}

		System.out.println("배열을 역순으로 출력:");
		//numbers[9], numbers[8], ... ,numbers[0]를 출력.
		for(int j=list.length-1; j>=0; j--) {
			System.out.print(list[j] + " ");
		}

		input.close();


	}

}
