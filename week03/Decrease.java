package w3_2277;

import java.util.Scanner;

public class Decrease {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("���� ������ �ϳ� �Է��Ͻÿ� : ");
		int a = input.nextInt();

		for (int i=a; i>=0; i--)
			System.out.print(i + " ");

		input.close();

	}

}