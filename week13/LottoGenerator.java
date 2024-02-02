package w13_2277;

import java.util.Random;

/**
 * �ζ� ���ǿ� ���� ���� ���� ������ ������ִ� Ŭ����
 * @author ������
 */
public class LottoGenerator {

	private Random random;	//�ʵ�

	public LottoGenerator() {
		//Random �ν��Ͻ��� �ϳ� �����ϰ�
		//random�� Random �ν��Ͻ��� ����Ű�� ��
		//LottoGenerator�� ������ �߻���ų ��
		//�� Random �ν��Ͻ��� �̿���
		random = new Random();
	}

	/**
	 * �ζ� ���ǿ� ���� �� 6�� ����
	 * @return 6���� ������ ����ִ� ���� �迭
	 */
	public int[] generateNumbers() {

		//���� �迭�� ����Ű�� ���� ���� ����
		//6���� ���� ������ ���� �迭�� ����
		int[] numbers = new int [6];

		//6���� �濡 ���� 50 �̸��� ���� ������ ����
		for (int i=0; i<6; i++) {
			numbers[i] = random.nextInt(50);
		}
		return numbers;
	}

}