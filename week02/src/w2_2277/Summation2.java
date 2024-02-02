package w2_2277;

import java.util.Scanner;

public class Summation2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);	
		System.out.print("1부터 얼마까지의 자연수를 더하시겠습니까? ");
		int a = input.nextInt();	

		int sum = 0;
		int i;

		//for 사용
		for (i=1; i<=a; i++)
			sum = sum+i;
		System.out.println("for 이용: 1부터 " + a + "까지의 합 = " + sum);

		sum=0;
		i=1; 

		//while 사용
		while (i<=a) {
			sum = sum+i;
			i++;
		}
		System.out.println("while 이용: 1부터 " + a + "까지의 합 = " + sum);

		input.close();
	}

}