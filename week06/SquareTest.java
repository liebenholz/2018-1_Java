package w6_2277;

/**
 * ������ ������ ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class SquareTest {

	public static void main(String[] args) {

		System.out.println("1���� 3������ ������ ������ ����ϴ� ���α׷��Դϴ�.");

		for (int i = 1; i <= 3; i++) {
			System.out.println(i + " * " + i + " = " + square(i));
		}
		System.out.println("��.");
	}

	/**
	 * �־��� ���� ������ ���Ѵ�.
	 * @param n �־��� ��.
	 * @return n�� ����.
	 */
	public static int square(int n) {
		int n2 = n * n;
		return n2;
	}
}
