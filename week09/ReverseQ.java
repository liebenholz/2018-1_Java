package w9_2277;

import java.util.Scanner;

/**
 * Ű����κ��� ������ ���ʷ� �о� �������� ����ϴ� ���α׷�
 * ����ڰ� q, Ȥ�� Q�� �Է��ϸ� �Է��� ������ ����Ѵ�.
 * 
 * @author ������
 *
 */
public class ReverseQ {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int [] list  = new int[100];

		boolean done = false;
		String temp;
		int i = 0;

		System.out.println("������ ���ʷ� �Է��Ͻÿ�:");
		System.out.println("�Է��� ��ġ���� 'q', Ȥ�� 'Q'�� �Է��Ͻÿ�:");
		while(!done) {
			temp = input.next();
			if (temp.equalsIgnoreCase("q"))	//��ҹ��� ���о��� temp�� "q'�� ������?
				done = true;
			else
				list[i++] = Integer.parseInt(temp);	//�迭�� ���� ���� �� i�� ������Ŵ
		}

		System.out.println("�迭�� �������� ���:");
		//numbers[n], numbers[n-1], ... ,numbers[0]�� ���.
		for(int j=i-1; j>=0; j--) {
			System.out.print(list[j] + " ");
		}

		input.close();


	}


}
