package w11_2277;

/**
 * swap �޼ҵ尡 �迭 ���� �� ���� ���������� �ٲ��ִ��� �˾ƺ��� ���α׷�.
 * @author ������
 *
 */
public class SwapComparison {

	public static void main(String[] args) {

		int[] anArray = {10,20};

		//�Ʒ��� �ڵ忡���� swap(int x, int y)�� ����ȴ�.
		//���� �ٲ��ִ� �Ϳ� �����Ͽ� 
		//anArray[0] = 10 anArray[1] = 20 �� ��µȴ�.
		swap(anArray[0], anArray[1]);
		System.out.println("anArray[0] = " + anArray[0] + " anArray[1] = " + anArray[1]);

		//�Ʒ��� �ڵ忡���� swap(int[] a, int i, int j)�� ����ȴ�.
		//���� �ٲ��ִ� �Ϳ� �����Ͽ�
		//anArray[0] = 20 anArray[1] = 10 �� ��µȴ�.
		swap(anArray, 0, 1);
		System.out.println("anArray[0] = " + anArray[0] + " anArray[1] = " + anArray[1]);

	}

	/**
	 * x,y�� ���� ���� �ٲ��ش�.
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	/**
	 * a[i]�� a[j]�� ���� ���� �ٲ��ش�.
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
