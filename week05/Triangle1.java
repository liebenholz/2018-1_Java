package w5_2277;

import java.util.Scanner;

/**
 * 삼각형을 그리는 프로그램.
 * 
 * @author 조성혁
 *
 */
public class Triangle1 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");
		int height = input.nextInt(); 	//삼각형의 크기를 사용자가 입력한다.

		for (int i = height; i >=1; i--) {
			for (int j = 1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}

		input.close();

	}

}
