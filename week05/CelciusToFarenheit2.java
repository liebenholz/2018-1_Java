package w5_2277;

/**
 * ���� -40������ 100�������� �µ��� ȭ�� �µ��� ��ȯ�ϰ� ����� ����ϴ� ���α׷�.
 * 
 * @author ������
 *
 */
public class CelciusToFarenheit2 {

	public static void main(String[] args) {

		int c = -40;		//���� -40������ ����

		while (c<=100) {	//���� 100������
			double farh = convert(c);
			System.out.println("C = " + c + " --> F = " + farh);
			c++;
		}

	}

	/**
	 * ���� �µ��� ȭ�� �µ��� ��ȯ�Ѵ�.
	 * @param c �����µ�
	 * @return ȭ�� �µ�
	 */
	public static double convert(int c) {

		double f = c * 9.0 / 5.0 + 32.0;
		return f;
	}

}



