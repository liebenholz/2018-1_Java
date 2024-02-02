package w5_2277;

import java.util.Scanner;

/**
 * 아래와 같은 삼각형을 그리는 프로그램. 
 * 
 * *****
 *  ****
 *   ***
 *    **
 *     *    
 * @author 조성혁
 *
 */
public class Triangle3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("삼각형을 그리는 프로그램입니다.");
		System.out.print("삼각형의 크기를 얼마로 할까요? ");

		int height = input.nextInt();	//삼각형의 크기를 사용자가 입력한다.

		for (int x=1; x<=height; x++) {
			for (int y=1; y<x; y++) {
				System.out.print(" ");
			}
			for (int z=height; (z-x)>=0; z--) {
				System.out.print("*");
			}
			System.out.println();

		}
		input.close();

	}

}
