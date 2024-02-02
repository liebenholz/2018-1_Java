package w11_2277;

/**
 * �ֻ��� n���� ������ �� ���� ���� ���� �����ϴ� ���α׷�.
 * ����ڰ� �ֻ����� ������ �õ� Ƚ���� ������ �� �ִ�.
 * �������� �׷����� Ƚ���� Ȯ������ǥ�� ����Ѵ�. 
 * @author ������
 *
 */
public class DiceGraph {

	public static void main(String[] args) {

		final int NUM_DICE = 5;		//�� ���ึ�� ���� �ֻ��� ��
		final int TRIALS = 10000;	//�ֻ��� �����⸦ �� �� ������ ���ΰ�?
		final int HEIGHT = 50;

		int[] occurence;			//�� ���� ���� Ƚ���� �����ϱ� ���� �迭

		//occurence �迭 ����
		//�迭�� ũ��� NUM_DICE�� ���� �޶�����
		//
		//(��)
		//NUM_DICE�� 2�϶��� 13���� ��(0������ 12��)�� �����
		//0,1���� ������� �ʰ� 2������ 12�� ����� ����Ѵ�.
		//(�ֻ��� ���� 0,1�� ���� ���� ������)
		//�ֻ��� ���� 2�� Ƚ���� 2�� �濡, 3�� Ƚ���� 3�� �濡,
		//..., 12�� Ƚ���� 12�� �濡 �����Ѵ�.
		//
		//NUM_DICE�� 3�϶��� 19���� ��(0������ 18��)�� �����
		//0,1,2���� ������� �ʰ� 3������ 18�� ����� ����Ѵ�.

		occurence = new int [6 * NUM_DICE + 1];
		int number;
		for (int i = 0; i < TRIALS; i++) {
			number = castDice(NUM_DICE);
			occurence[number]++; 
		}

		for (int i=0; i<6 * NUM_DICE + 1; i++) {
			System.out.println(i + "�� ���� Ƚ�� : " + occurence[i] + " ");	//Ƚ�����
		}
		System.out.println();
		graph(occurence, HEIGHT);	//�׷������

	}

	/**
	 * n���� �ֻ����� ���� ���� ���� ��ȯ�Ѵ�.
	 * �ֻ����� ������ü �ֻ����̴�.
	 * @param n �ֻ��� ��
	 * @return n���� �ֻ����� ���� ���� ��
	 */
	public static int castDice(int n) {
		int sum = 0;
		for (int i=0; i<n; i++) {
			sum += (int) (1 + Math.random()*6);
		}
		return sum;
	}

	/**
	 * �迭 a�� ���� �� �ִ밪�� ã�� ��ȯ�Ѵ�.
	 * @param a �迭�� ����Ű�� ��������
	 * @return �ִ밪
	 */
	public static int max(int[] a) {
		int max = 0;
		for (int i=0; i<a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		return max;
	}

	/**
	 * �迭 a�� �׷����� �׸���.
	 * �׷����� ������ '*'�� �μ��Ͽ� �׸���.
	 * 
	 * �� ���� �ϳ��� �ܼ��� 1�� �ǹ��ϵ��� �ϸ�
	 * �迭�� ��� �ִ� ���ڵ��� ū ���� ��
	 * �� ���ڸ� �ʹ� ���� �׷��� �ϹǷ� (�׷����� �ʹ� Ŀ���Ƿ�)
	 * �迭�� �餷 �ִ� ���ڰ� �󸶳� ū �������� ����
	 * �� ���� �ϳ��� �ǹ��ϴ� ũ�Ⱑ �����ǵ��� �Ѵ�.
	 * 
	 * height�� �迭�� ��� �ִ� ���ڵ� �� ���� ū ����
	 * �� ���� �� ���� ǥ���� �������� �������ش�.
	 * �迭�� ��� �ִ� �� �� ���� ū ���� 910�̰�
	 * height�� 50�̸�
	 * �� ���� �ϳ��� 910/50 = 18.2�� �ǹ��ϰ� �ȴ�.
	 * 
	 * @param a �迭
	 * @param height �׷����� �ִ� ����
	 * 				 ���� ū ���� �� ���� �� ���� �׸� ���ΰ��� ��Ÿ��.
	 */
	public static void graph(int[] a, int height) {

		int maximum;		//�迭���� ���� ū ��
		maximum = max(a);
		float quantum;		//�� ���� �ϳ��� ���� �󸶿� �ش��ϳ�?
		quantum = (float) maximum/height;

		//star�� �迭�� �׷����� �׸���.
		for (int i=0; i<a.length; i++) {
			System.out.printf("%-10s", i + " : " + a[i]);
			for (int j = 0; j < a[i]/quantum; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
