package w10_2277;

/**
 * �迭�� ��ȯ�ϴ� �޼ҵ帣 �̿��ϴ� ����
 * ������ ũ���� �迭�� ��ȯ�ϴ� �޼ҵ带 ȣ���� ��
 * ��ȯ�� �迭�� ������ ����ϴ� �۾��� �ݺ��Ѵ�.
 * �޼ҵ尡 �󸶳� ū �迭�� ����� ������
 * �޼ҵ带 ȣ���� �� �μ��� ���� �������ش�.
 * @author ������
 *
 */
public class ArrayReturn2 {

	public static void main(String[] args) {

		int[] array;
		int num = 10;
		
		//�Ķ���͸� ���� �ʴ� makeArray �޼ҵ带 ȣ���Ͽ� ��ȯ�� �迭�� ����Ѵ�.
		array = makeArray();
		RandomNumbers.printArray(array, num);
		
		//�Ķ���͸� �ϳ� ���� makeArray �޼ҵ带 ȣ���Ͽ� ��ȯ�� �迭�� ����ϴ� ����
		//10�� �ݺ��Ѵ�.
		//�Ķ���͸� �ϳ� ���� makeArray �޼ҵ带 ȣ���� �� �޼ҵ带 �Ѱ��ִ� ���ڴ�
		//1���� �����Ͽ� 10���� �����Ѵ�.
		for (int i = 0; i<=num; i++) {
			array = makeArray(i+1);
			RandomNumbers.printArray(array, i);
			System.out.println();
		}
		
	}
	
	/**
	 * ũ�Ⱑ 10�� int �迭�� ������ ��
	 * 0�� ���� 0*0��,
	 * 1�� ���� 1*1��,
	 * ...
	 * 9�� ���� 9*9�� �����ϰ�
	 * �迭�� ��ȯ�Ѵ�.
	 * �迭�� ��ȯ�Ѵٴ� ���� �� �迭�� ����Ű�� ����(reference)�� ��ȯ�ܴٴ� ���̴�.
	 * @return �迭�� ����Ű�� ����
	 */
	public static int[] makeArray() {
		int[] array = new int[10];
		for (int i=0; i<10; i++) {
			array[i] = i*i;
		}
		return array;
	}
	
	/**
	 * ũ�Ⱑ n�� int �迭�� ������ ��
	 * 0�� ���� 0*0��,
	 * 1�� ���� 1*1��,
	 * ...
	 * n-1�� ���� (n-1)*(n-1)�� �����ϰ�
	 * �迭�� ��ȯ�Ѵ�.
	 * �迭�� ��ȯ�Ѵٴ� ���� �� �迭�� ����Ű�� ����(reference)�� ��ȯ�ܴٴ� ���̴�.
	 * @param n �迭�� ũ��
	 * @return �迭�� ����Ű�� ����
	 */
	public static int[] makeArray(int n) {
		int[] array = new int[n];
		for (int i=0; i<n; i++) {
			array[i] = i*i;
		}
		return array;
	}
}
