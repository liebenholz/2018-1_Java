package w4_2277;

import java.util.Scanner;

/** 
 * �Ʒ��� ���� �ﰢ���� �׸��� ���α׷�.
 * �ﰢ���� ũ��� ����ڰ� �������ش�.
 * 
 * *****
 * ****
 * ***
 * **
 * *
 * 
 * @author ������ 
 *  
 *  */
public class ReversedTriangle {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		System.out.println("���ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("���ﰢ���� ũ�⸦ �󸶷� �ұ��? 1 �̻��� ������ �Է��ϼ���.");

		int size = input.nextInt();    // ����ڰ� �ﰢ���� ũ�⸦ ����

		System.out.println();

		for (int i=size; i>0; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		input.close();
	}

}
