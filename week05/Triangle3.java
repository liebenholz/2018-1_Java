package w5_2277;

import java.util.Scanner;

/**
 * �Ʒ��� ���� �ﰢ���� �׸��� ���α׷�. 
 * 
 * *****
 *  ****
 *   ***
 *    **
 *     *    
 * @author ������
 *
 */
public class Triangle3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("�ﰢ���� �׸��� ���α׷��Դϴ�.");
		System.out.print("�ﰢ���� ũ�⸦ �󸶷� �ұ��? ");

		int height = input.nextInt();	//�ﰢ���� ũ�⸦ ����ڰ� �Է��Ѵ�.

		for (int x=1; x<=height; x++) {
			for (int y=1; y<x; y++) {
				System.out.print(" ");
			}
			for (int z=height; (z-x)>=0; z--) {
				System.out.print("*");
			}
			System.out.println();

		}
		input.close();

	}

}
