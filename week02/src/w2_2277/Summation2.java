package w2_2277;

import java.util.Scanner;

public class Summation2 {

	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);	
		System.out.print("1���� �󸶱����� �ڿ����� ���Ͻðڽ��ϱ�? ");
		int a = input.nextInt();	

		int sum = 0;
		int i;

		//for ���
		for (i=1; i<=a; i++)
			sum = sum+i;
		System.out.println("for �̿�: 1���� " + a + "������ �� = " + sum);

		sum=0;
		i=1; 

		//while ���
		while (i<=a) {
			sum = sum+i;
			i++;
		}
		System.out.println("while �̿�: 1���� " + a + "������ �� = " + sum);

		input.close();
	}

}