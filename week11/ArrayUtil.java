package w11_2277;

/**
 * ���� ���̴� �迭 ������ �ϳ��� Ŭ������ �����س��� �ʿ��� ������ ����Ѵ�.
 * �Ʒ��� printArray �޼ҵ带 �׽�Ʈ�ϴ� ���α׷�.
 * 
 * @author ������
 */
public class ArrayUtil {

	public static void main(String[] args) {

		int[] a = new int [10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		//p4. printArray �޼ҵ带 �׽�Ʈ�Ѵ�.
		System.out.print("printArray(a, 0) : ");
		printArray(a, 0);
		System.out.print("printArray(a, 1) : ");
		printArray(a, 1);
		System.out.print("printArray(a, a.length) : ");
		printArray(a, a.length);
		System.out.print("printArray(a, a.length+1) : ");
		printArray(a, a.length+1);
		System.out.println();
		System.out.println();


		//p6-1. fillRandom �޼ҵ带 �׽�Ʈ�Ѵ�.
		System.out.println("fillRandom �޼ҵ� �׽�Ʈ ---------");
		System.out.print("fillRandom(a, 10) : ");
		fillRandom(a, 10);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 100) : ");
		fillRandom(a, 100);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 1) : ");
		fillRandom(a, 1);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 0) : ");
		fillRandom(a, 0);
		printArray(a, a.length);
		System.out.println();


		//p6-2. distinct �޼ҵ带 �׽�Ʈ�Ѵ�.
		System.out.println("distinct �޼ҵ� �׽�Ʈ ---------");

		int[] a2 = {1, 1, 2};
		System.out.println("a2 = {1, 1, 2}");
		System.out.println("distinct(a2, a2.length) : "
				+ distinct(a2, a2.length));
		System.out.println("distinct(a2, 0) : " 
				+ distinct(a2, 0));
		System.out.println("distinct(a2, a2.length + 1) : "
				+ distinct(a2, a2.length + 1));

		int[] a3 = {1, 2, 3};
		System.out.println("a3 = {1, 2, 3}");
		System.out.println("distinct(a3, a3.length) : "
				+ distinct(a3, a3.length));
		System.out.println("distinct(a3, a3.length + 1) : "
				+ distinct(a3, a3.length + 1));

		int[] a4 = {1};
		System.out.println("a4 = {1}");
		System.out.println("distinct(a4, a4.length) : "
				+ distinct(a4, a4.length));
		System.out.println("distinct(a4, a4.length + 1) : "
				+ distinct(a4, a4.length + 1));

		int[] a5 = {};
		System.out.println("a5 = {}");
		System.out.println("distinct(a5, a5.length) : "
				+ distinct(a5, a5.length));
		System.out.println("distinct(a5, a5.length + 1) : "
				+ distinct(a5, a5.length + 1));
		System.out.println();


		//p6-3. fillRandomDistinct �޼ҵ带 �׽�Ʈ�Ѵ�.
		System.out.println("fillRandomDistinct �޼ҵ� �׽�Ʈ ---------");
		System.out.print("fillRandomDistinct(a, 10) : ");
		fillRandomDistinct(a, 10);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 100) : ");
		fillRandomDistinct(a, 100);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 1) : ");
		fillRandomDistinct(a, 1);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 0) : ");
		fillRandomDistinct(a, 0);
		printArray(a, a.length);
		System.out.println();


		//p6-4. makeRandomArray �޼ҵ带 �׽�Ʈ�Ѵ�.
		System.out.println("makeRandomArray �޼ҵ� �׽�Ʈ ---------");
		System.out.print("makeRandomArray(10, 10) : ");
		if ((makeRandomArray(10, 10) == null))
			System.out.println("null");
		else printArray(makeRandomArray(10, 10), makeRandomArray(10, 10).length);

		System.out.print("makeRandomArray(10, 1) : ");
		if ((makeRandomArray(10, 1) == null))
			System.out.println("null");
		else printArray(makeRandomArray(10, 1), makeRandomArray(10, 1).length);

		System.out.print("makeRandomArray(1, 10) : ");
		if((makeRandomArray(1, 10) == null))
			System.out.println("null");
		else printArray(makeRandomArray(1, 10), makeRandomArray(1, 10).length);

		System.out.print("makeRandomArray(1, 0) : ");
		if((makeRandomArray(1, 0) == null))
			System.out.println("null");
		else printArray(makeRandomArray(1, 0), makeRandomArray(1, 0).length);

		System.out.print("makeRandomArray(0, 0) : ");
		if((makeRandomArray(0, 0) == null))
			System.out.println("null");
		else printArray(makeRandomArray(0, 0), makeRandomArray(0, 0).length);

	}

	/**
	 * �迭 �տ� �ִ� n���� ���ҵ��� ����Ұ� �������� new line�� ����Ѵ�.
	 * n > a.length�� ��쿡�� ������ ��� ������ �Բ� a.length ���� ���Ҹ� ����Ѵ�.
	 * 
	 * @param a �迭
	 * @param n ����ϴ� ������ ����
	 */
	public static void printArray(int[] a, int n) {

		if (n>a.length) {	// ���!
			System.out.println("�迭�� ũ�⺸�� �� ���� ����� �䱸�Ͽ����ϴ�.");
			System.out.println("�迭�� ũ�⸸ŭ ����մϴ�.");
			for (int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		else {				//����ó��
			for (int i=0; i<n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * �迭�� list�� 1 �̻� max ���� ���� ������ ä���ش�. ������ �ߺ��� �� �ִ�.
	 * �� �޼ҵ带 ȣ���ϴ� �ڴ� �Ʒ� ���������� ���Ѿ� �Ѵ�.
	 * �������� : max >= 1
	 * �� �޼ҵ带 ȣ���ϴ� �ڰ� �� ���������� ��Ű�� ������
	 * �迭�� ������ ä���� �ʰ� ���� �޼����� ����ϰ� �����Ѵ�. 
	 * 
	 * @param list ������ ä�� �迭
	 * @param max ������ �ִ밪
	 */
	public static void fillRandom(int[] list, int max) {

		if (max<1) {	//���� �Ҹ���!
			System.out.println("max >= 1�̾�� �մϴ�.");
			System.out.println("�迭���� �ƹ� �͵� ä���� �ʾҽ��ϴ�.");
		}
		else {			//���� ä���
			for (int i = 0; i<list.length; i++) {
				int num = (int)(Math.random()*max) + 1;
				list[i] = num;
			}
		}
	}

	/**
	 * �迭 �� n���� �� (0������ n-1��)�� ���ҵ��� ���� �ٸ��� �˻��Ѵ�.
	 * ���ҵ��� ���� �ٸ���?
	 * �������� : 1 <= n
	 * n�� 0 ������ ���� ������ ��� ������ ����ϰ� true�� ��ȯ�Ѵ�.
	 * n > a.length �϶��� n == a.length �� ���� �Ȱ��� �۵��Ѵ�.
	 * 
	 * @param a �迭
	 * @param n �迭�� �� �� �� �濡 �ߺ� ���� �˻縦 �� ���ΰ�?
	 * @return true, �迭�� �� n�� ���ҵ��� ��� �ٸ� ���
	 * 		   false, �迭�� �� n�� �濡 �ߺ��� ���Ұ� �ִ� ���
	 */
	public static boolean distinct(int[] a, int n) {

		if (n<1) {	//�ʱ� ���� �Ҹ���!
			System.out.println("n >= 1 �̾�� �մϴ�.");
			return true;
		}
		else if (n > a.length) {
			n = a.length;
		}

		boolean isDistinct = true;	//�ϴ� ��� �ٸ��ٰ� ����

		for (int i = n-1; i>=1; i--) {

			//a[i]�� i���� �� a[0]~a[i-1] �� ��� �ϳ��� �ߺ��ȴٸ�,
			//(a[i]�� �迭 a�� �� i���� �濡 ����ִٸ�),
			//distinct���� �ʴ�.
			//�ߺ��� ���Ұ� �ϳ��� �߰ߵǸ� �� �̻� üũ�� �ʿ䰡 ����.
			//(������ ����������.)

			if (Search.linearSearch(a, i, a[i]) != -1) {
				isDistinct = false;		//�ߺ��ȴ�!
				break;
			}
		}
		return isDistinct;
	}

	/**
	 * �迭 list�� 1 �̻� max ���� "���� �ٸ�" ���� ������ ä���ش�.
	 * �� �޼ҵ带 ȣ���ϴ� �ڴ� �Ʒ� ���������� ���Ѿ� �Ѵ�.
	 * �������� : max >= list.length && max>=1
	 * �� �޼ҵ带 ȣ���ϴ� �ڴ� �� ���������� ��Ű�� ������
	 * �迭�� ������ ä���� �ʰ� ���� �޼����� ����ϰ� �����Ѵ�.
	 * 
	 * @param list ������ ä�� �迭
	 * @param max ������ �ִ밪
	 */
	public static void fillRandomDistinct(int[] list, int max) {

		//������ �߻���Ų �� �� ������ �迭�� �ֱ� ����
		//�� ������ �̹� �迭�� ��� �ִ����� �˻��ؾ� ��.
		//�̹� �ִٸ� �� ������ ������ �� ������ �߻���Ŵ.

		if (max < list.length || max < 1) {		//���� �Ҹ���!
			System.out.println("max >= list.length �̰� max>=1 �̾�� �մϴ�. ");
			System.out.println("�迭�� �ƹ� �͵� ä���� �ʾҽ��ϴ�.");
		}

		else {
			int count = 0;	//�迭�� ���� ���� ����

			while (count < list.length) {	//�迭�� ������ ���� �� ������ �ݺ�

				int number = (int) (max * Math.random()) + 1;

				//number�� �迭�� �̹� ������� ���� ��쿡�� �迭�� �߰�
				//list�� �� count���� �濡 number�� ��� ���� ������
				//number�� �迭�� �ְ� count�� ������Ŵ

				for (int i=0; i<count; i++) {
					while (list[i] == number) {
						number = (int) (max * Math.random()) + 1;
						i=0;
					}
				}
				list[count] = number;
				count++;			
			}
		}
	}

	/**
	 * 1 �̻� max ���� ���� ������ n�� �߻����� �̵��� �迭�� ������ ��
	 * �迭�� ī��Ű�� ���������� ��ȯ�Ѵ�.
	 * �迭���� ���� ���ڰ� �� �� �̻� �ߺ��� �� �ִ�.
	 * �������� : n >= 0 && max >= 1
	 * �� �޼ҵ带 ȣ���ϴ� �ڰ� �� ���������� ��Ű�� ������ null�� ��ȯ�Ѵ�.
	 * 
	 * @param n ���� ����, �迭�� ũ��
	 * @param max 1 �̻� max ���� ����
	 * @return
	 */
	public static int[] makeRandomArray(int n, int max) {
		if (n < 0|| max < 1) {
			return null;	//���� �Ҹ���!
		}
		else {	
			int[] list = new int [n];
			int count = 0;	//�迭�� ���� ���� ����

			while (count < list.length) {	//�迭�� ������ ���� �� ������ �ݺ�

				int number = (int) (max * Math.random()) + 1;
				number = (int) (max * Math.random()) + 1;
				list[count] = number;
				count++;			
			}
			return list;
		}
	}

}