package w7_2277;

import java.util.Scanner;
/**
 * ����ڰ� ������ ���ڸ� �Է��ϸ� �̰��� String Ÿ������ �о� ���δ�.
 * ���� �� ���� ���ڷ� ������� ���ڿ������� �˷��� ��, �� ���ڸ� �и��Ͽ� ����ϵ��� �ϴ� ���α׷�.
 * 
 * @author ������
 */
public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");
		String s = input.next();	//�Է��� String���� �о� ���δ�.

		int len = s.length();		//s���� ���̰� ������ �����!
		System.out.println(len + "���� ���ڷ� �̷���� ���ڿ��Դϴ�.");

		for (int i=0; i < len; i++)
			System.out.print(s.charAt(i) + " "); //s���� i��° ���ڰ� �������� �����!
		System.out.println();

		input.close();
	}

}
