package w9_2277;

import java.util.Scanner;

/**
 * 키보드로부터 정수를 차례로 읽어 역순으로 출력하는 프로그램
 * 사용자가 q, 혹은 Q를 입력하면 입력을 끝내고 출력한다.
 * 
 * @author 조성혁
 *
 */
public class ReverseQ {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] list  = new int[100];

		boolean done = false;
		String temp;
		int i = 0;

		System.out.println("정수를 차례로 입력하시오:");
		System.out.println("입력을 마치려면 'q', 혹은 'Q'를 입력하시오:");
		while(!done) {
			temp = input.next();
			if (temp.equalsIgnoreCase("q"))	//대소문자 구분없이 temp가 "q'와 같은가?
				done = true;
			else
				list[i++] = Integer.parseInt(temp);	//배열에 값을 넣은 후 i를 증가시킴
		}

		System.out.println("배열을 역순으로 출력:");
		//numbers[n], numbers[n-1], ... ,numbers[0]를 출력.
		for(int j=i-1; j>=0; j--) {
			System.out.print(list[j] + " ");
		}

		input.close();


	}


}
