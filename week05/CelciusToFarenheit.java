package w5_2277;

/**
 * ���� -40������ 100�������� �µ��� ȭ�� �µ��� ��ȯ�ϰ� ����� ����ϴ� ���α׷�.
 * 
 * @author ������
 *
 */
public class CelciusToFarenheit {

	public static void main(String[] args) {

		int c = -40;		//���� -40������ ����
		
		while (c<=100) {	//���� 100������
			System.out.print("C = " + c + " --> F = ");
			convertAndPrint(c);
			c++;
		}

	}
	
	/**
	 * ���� �µ��� ȭ�� �µ��� ��ȯ�ϰ� ����Ѵ�.
	 * void ���·� return���� ����.
	 * @param c �����µ�
	 */
	public static void convertAndPrint(int c) {
		double f = c * 9.0 / 5.0 + 32.0;
		System.out.println(f);

	}

}
