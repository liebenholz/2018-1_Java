package w13_2277;

import java.util.Scanner;

public class ReverserTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("���ڿ��� �Է��ϼ���: ");
		String s = input.nextLine();

		Reverser reverser = new Reverser(s);
		String reversedString = null;
		reversedString = reverser.reverse();

		System.out.print("������ ���ڿ�: ");
		System.out.println(reversedString);

		//------------------------

		String reversedWords = null;
		reversedWords = reverser.reverseWords();

		System.out.print("�ܾ� ������ ������ ���ڿ�: ");
		System.out.println(reversedWords);

		input.close();

	}

}
