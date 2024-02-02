package w5_2277;

/**
 * 100������ �ڿ����� ���� ��,
 * 101������ �ڿ����� ���� ��,
 * 102������ �ڿ����� ���� ��,
 * ...
 * 120������ �ڿ����� ���� ���� ����ϴ� ���α׷�.
 * �ڿ����� 1 �̻��� ������ �����Ѵ�.
 * 
 * @author ������
 *
 */
public class Summations {

	public static void main(String[] args) {

		int upto = 100;			//������ �� ���� 100���� �����Ͽ�
		while (upto<=120) {		//120���� ����Ѵ�.

			System.out.printf("Summation of natural numbers upto " + upto + " = ");
			System.out.println(sum(upto));		//�ڿ������� ���� ����ϴ� �޼ҵ�� �����Ѵ�.
			upto++;

		}

	}

	/**
	 * 
	 * @param upto �ڿ������� ���� �� ��
	 * @return �ش� �������� �ڿ������� ��
	 */
	public static int sum(int upto) {
		int sum = 0;
		for (int i=1; i<=upto; i++) {
			sum = sum + i;
		}

		return sum;
	}

}