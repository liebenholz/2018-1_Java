package w9_2277;

import java.util.Scanner;

/**
 * Ű����κ��� 10���� ������ ���ʷ� �о� �������� ����ϴ� ���α׷�
 * @author ������
 *
 */
public class Reverse {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int[] list  = new int[10];

		System.out.println("���� 10���� ���ʷ� �Է��Ͻÿ�:");
		//����ڰ� �Է��� ������ numbers[0], numbers[1], ... ,numbers[9]�� ���ʷ� �����Ѵ�.
		for(int i=0; i<list.length; i++) {
			list[i] = input.nextInt();
		}

		System.out.println("�迭�� �������� ���:");
		//numbers[9], numbers[8], ... ,numbers[0]�� ���.
		for(int j=list.length-1; j>=0; j--) {
			System.out.print(list[j] + " ");
		}

		input.close();


	}

}
