package w13_2277;

/**
 * �ֻ��� �� ���� 1000�� ���� �� ���� �� �� ���Դ��� ǥ���ϴ� ���α׷�.
 * @author ������
 */
public class DiceCasting2 {

	public static void main(String[] args) {

		final int TRIAL = 1000;	//�ֻ��� ������ Ƚ��

		Dice dice = new Dice();

		//������� ����
		int[] occurence = new int [13];
		int number;
		for (int i = 0; i < TRIAL; i++) {
			number = dice.roll();
			occurence[number]++; 
		}

		//��� ���
		for (int i=1; i<13; i++) {
			System.out.println(i + ": \t" + occurence[i]);
		}

	}

}
