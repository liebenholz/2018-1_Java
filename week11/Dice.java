package w11_2277;

/**
 * �ֻ��� n���� ������ �� ���� ���� ���� �����ϴ� ���α׷�.
 * ����ڰ� �ֻ����� ������ �õ� Ƚ���� ������ �� �ִ�.
 * @author ������
 *
 */
public class Dice {

	public static void main(String[] args) {

		final int NUM_DICE = 2;		//�� ���ึ�� ���� �ֻ��� ��
		final int TRIALS = 1000;	//�ֻ��� �����⸦ �� �� ������ ���ΰ�?

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
			System.out.println(i + "�� ���� Ƚ�� : " + occurence[i]);
		}


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
}
