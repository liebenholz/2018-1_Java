package w13_2277;

/**
 * �ֻ��� �� ���� 20�� ���� ȭ�鿡 ����� ����ϴ� ���α׷�.
 * @author ������
 */
public class DiceCasting1 {

	public static void main(String[] args) {

		final int TRIAL = 20;	//�ֻ��� ������ Ƚ��
		
		Dice dice = new Dice();
		
		for (int i=0; i<TRIAL; i++) {
			System.out.println(dice.roll());
		}

	}

}
