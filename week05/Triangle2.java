package w5_2277;

import java.util.Scanner;
/**
 * �Ʒ��� ���� �ﰢ���� �׸��� ���α׷�. 
 * 
 *     *
 *    **
 *   ***
 *  ****
 * *****    
 * @author ������
 *
 */
public class Triangle2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");

		int height = input.nextInt();	 //�ﰢ���� ũ�⸦ ����ڰ� �Է��Ѵ�.

		for (int i=height; i>=1; i--) {
			int j;
			for (j=0; j<i; j++) 
				System.out.print(" ");
			for ( ; j<=height; j++) 
				System.out.print("*");
			System.out.println();		
		}

		input.close();
	}
}