package w3_2277;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("ǥ�� �μ��մϴ� ");

		System.out.print("���� �� �� ������? ");
		int row = input.nextInt();

		System.out.print("���� �� �� ������? ");
		int column = input.nextInt();

		for (int a=0; a<row; a++) {
			for (int b=0; b<column; b++) {
				System.out.print("(" + a + ", " + b + ")" + "\t");
			}
			System.out.println();
		}	
		input.close();
	}

}
