package w10_2277;

/**
 * ũ�Ⱑ 10�� int Ÿ�� �迭�� 0 �̻� 100 �̸� ���� ������ ���� ��,
 * �迭�� �� ���Ҹ� ���ʷ� ����Ͽ�
 * ���ҵ� �� �ִ밪�� �ּҰ�, �׸��� ���ҵ��� ����� ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class RandomStatistics {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] array = new int[SIZE];
		
		System.out.println("100���� ���� ���� ����");
		writeRandomNumbers(array, SIZE);
		
		for(int i=0; i<SIZE; i++) {
			System.out.println(array[i]);
		}
		int min = min(array);
		int max = max(array);
		double average = average(array);
		
		System.out.println("���ҵ� �� �ּҰ�: " + min);
		System.out.println("���ҵ� �� �ִ밪: " + max);
		System.out.println("���ҵ��� ���: " + average);

	}

	/**
	 * 0�̻� n �̸��� ���� ������ �߻����� �迭 a�� ���ʷ� ä���.
	 * @param a ������ ������ �迭
	 * @param n 0 �̻� n �̸� ���� �߻�
	 */
	public static void writeRandomNumbers(int[] a, int n) {
		
		for(int i=0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100);
		}
	}
	
	/**
	 * �迭 a�� ���� �� �ּҰ��� ã�� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ּҰ�
	 */
	public static int min(int[] a) {
		
		int min = 99;

		for(int i = 0; i < 10; i++) {
			if(a[i] < min) {
				min = a[i];	
			}
		}
		return min;
	}
	
	/**
	 * �迭 a�� ���� �� �ִ밪�� ã�� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ִ밪
	 */
	public static int max(int[] a) {
		
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	/**
	 * �迭 a�� ���ҵ��� ��հ� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return ��հ�
	 */
	public static double average(int[] a) {
		int average;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += a[i];
		}
		average = sum / 10;
		
		return average;
	}
}
