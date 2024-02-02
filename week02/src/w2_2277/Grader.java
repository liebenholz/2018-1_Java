package w2_2277;

import java.util.Scanner;

public class Grader {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("점수를 입력하시오: ");
		int a = input.nextInt();

		if (a>=90)
			System.out.println("등급=A");
		else if (a>=80)
			System.out.println("등급=B");
		else if (a>=70)
			System.out.println("등급=C");
		else if (a>=60)
			System.out.println("등급=D");
		else
			System.out.println("등급=F");

		input.close();
	}

}
