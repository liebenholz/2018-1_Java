package w2_2277;

import java.util.Scanner;

public class StringAdder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		System.out.print("�ܾ �� �� �Է��Ͻÿ�: ");
		String a = input.next();
		String b = input.next();

		System.out.println(a + b);

		input.close();
	}

}