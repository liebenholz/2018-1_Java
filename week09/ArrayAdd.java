package w9_2277;

/**
 * �迭 ����
 * @author ������
 *
 */
public class ArrayAdd {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		double random;

		//a�� 0 �̻� 10 �̸� ������ ä���.
		for (int i=0; i<10; i++) {
			random = (Math.random())*10;
			a[i] = (int)random;
		}
		//b�� 0 �̻� 10 �̸� ������ ä���.
		for (int i=0; i<10; i++) {
			random = (Math.random())*10;
			b[i] = (int)random;

		}
		// c = a + b
		for (int i=0; i<10; i++) {
			c[i] = a[i] + b[i];
		}

		printArray(a);
		printArray(b);
		printArray(c);

	}

	/**
	 * �־��� �迭�� ���Ҹ� ���ʷ� ����Ѵ�.
	 * @param array ����� �迭�� ����Ű�� ��������.
	 */
	public static void printArray(int[] array)	{
		for (int i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
