package w2_2277;

import java.util.Scanner;

public class LargerNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("점수를 두 개 입력하시오: ");
		int a = input.nextInt();
		int b = input.nextInt();

		if (a>b)
			System.out.println("더 큰 수는 " + a + "입니다.");
		else if (a<b)
			System.out.println("더 큰 수는 " + b + "입니다.");
		else
			System.out.println("두 수는 같습니다.");

		input.close();
	}

}