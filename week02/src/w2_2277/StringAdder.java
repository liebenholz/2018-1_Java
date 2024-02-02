package w2_2277;

import java.util.Scanner;

public class StringAdder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("단어를 두 개 입력하시오: ");
		String a = input.next();
		String b = input.next();

		System.out.println(a + b);

		input.close();
	}

}