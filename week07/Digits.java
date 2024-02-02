package w7_2277;

import java.util.Scanner;
/**
 * 사용자가 임의의 숫자를 입력하면 이것을 String 타입으로 읽어 들인다.
 * 이후 몇 개의 문자로 만들어진 문자열인지를 알려준 후, 각 문자를 분리하여 출력하도록 하는 프로그램.
 * 
 * @author 조성혁
 */
public class Digits {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		String s = input.next();	//입력을 String으로 읽어 들인다.

		int len = s.length();		//s에게 길이가 얼마인지 물어본다!
		System.out.println(len + "개의 글자로 이루어진 문자열입니다.");

		for (int i=0; i < len; i++)
			System.out.print(s.charAt(i) + " "); //s에게 i번째 글자가 무언인지 물어본다!
		System.out.println();

		input.close();
	}

}
