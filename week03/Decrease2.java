package w3_2277;

import java.util.Scanner;

public class Decrease2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("양의 정수를 하나 입력하시오: ");
		int a = input.nextInt();

		int i=0;
		System.out.println("첫번째 방법");
		for (i=a; i>=0; i--) {
			System.out.print(i + "\t");
			if ((a-i)%10==9)
				System.out.println();
		}
		System.out.println();

		System.out.println("두번째 방법");
		int count = 0;

		for (i=a; i>=0; i--) {
			System.out.print(i + "\t");			
			count++;
			while (count==10) {
				System.out.println();
				count = 0;
			}
		}

		input.close();
	}

}