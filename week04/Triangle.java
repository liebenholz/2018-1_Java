package w4_2277;

import java.util.Scanner;

/** 
 * 아래와 같은 삼각형을 그리는 프로그램.
 * 삼각형의 크기는 사용자가 지정해준다.
 * 
 * *
 * **
 * ***
 * ****
 * *****
 * 
 * @author 조성혁 
 *  
 *  */
public class Triangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? 1 이상의 정수를 입력하세요.");

		int size = input.nextInt();   // 사옹자가 삼각형의 크기를 지정

		for (int i=0; i<=size; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		input.close();
	}

}
