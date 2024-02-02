package w5_2277;

/**
 * 1���� 100������ �ڿ����� ���� ��,
 * 2���� 101������ �ڿ����� ���� ��,
 * 3���� 102������ �ڿ����� ���� ��,
 * ...
 * 20���� 119������ �ڿ����� ���� ���� ����ϴ� ���α׷�.
 * �ڿ����� 1 �̻��� ������ �����Ѵ�.
 * 
 * @author ������
 *
 */
public class Summations2 {

	public static void main(String[] args) {

		int from = 1;	//���� ���� ���� 1�� ����
		int to = 100;	//���� �� ���� 100���� ����

		while (from<=20) {		//���� ���� ���� 20�� �� ������
			System.out.printf("Summation of natural numbers form " + from + " to " + to + " = ");
			System.out.println(sumResult(from, to));
			from++;		//���� ���� ���� +1
			to++;		//���� �� ���� +1

		}

	}

	/**
	 * �־��� ������ �ڿ����� ���� ���Ѵ�.
	 * @param from ������ ���� ��
	 * @param to ������ �� ��
	 * @return �־��� ������ �ڿ����� ��
	 */
	public static int sumResult(int from, int to) {
		int sum = 0;
		for (int i=from; i<=to; i++) {
			sum = sum + i;
		}

		return sum;
	}

}
