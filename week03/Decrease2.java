package w3_2277;

import java.util.Scanner;

public class Decrease2 {

	public static void main(String[] args) {

		Scanner input = new Scanner (System.in);
		System.out.print("���� ������ �ϳ� �Է��Ͻÿ�: ");
		int a = input.nextInt();

		int i=0;
		System.out.println("ù��° ���");
		for (i=a; i>=0; i--) {
			System.out.print(i + "\t");
			if ((a-i)%10==9)
				System.out.println();
		}
		System.out.println();

		System.out.println("�ι�° ���");
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