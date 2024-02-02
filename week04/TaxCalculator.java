package w4_2277;

import java.util.Scanner;

/**
 * �ҵ��� �Է��ϸ� �������� ����� �ҵ漼�� ������ִ� ���α׷�
 * ���ҵ��� 3000���� ���ϴ� ���� 10%, 7000���� ���ϴ� 18%, �̸� �ʰ��ϸ� 30%��.
 * 
 * ���� ��� ���ҵ��� 8000������ ��, �ҵ漼�� ������ ����. 
 * 3000����*10/100 + (7000����-3000����)*18/100 + (8000����-7000����)*30/100 = 1320����
 * 
 * @author ������
 *
 */
public class TaxCalculator {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double tax = 0;		//�ҵ漼 �⺻���� 0

		final double TAX_RATE_LOW = 10.0/100.0; //3000���� ������ �ݾ׿����� ����
		final double TAX_RATE_MID= 18.0/100.0;	//7000���� ������ �ݾ׿����� ����
		final double TAX_RATE_HIGH= 30.0/100.0;	//7000���� �ʰ��� �ݾ׿����� ����


		System.out.print("�ҵ���? ");
		double salary = input.nextDouble();		//�ҵ� �Է�

		if (salary>70000000) 					//7000���� �ʰ��� ��
			tax = 30000000 * TAX_RATE_LOW + (70000000 - 30000000) * TAX_RATE_MID + (salary - 70000000) * TAX_RATE_HIGH;

		else if (salary>30000000)				//7000���� ������ ��
			tax = 30000000 * TAX_RATE_LOW + (salary - 30000000) * TAX_RATE_MID;

		else if (salary>0)						//3000���� ������ ��
			tax = salary * TAX_RATE_LOW;

		System.out.println("�ҵ漼 = " + tax);		//�ҵ漼�� �ҵ濡 ���� �˸°� ���

		input.close();
	}

}
