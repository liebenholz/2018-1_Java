package w13_2277;

import java.util.Random;

/**
 * �ζǹ�ȣ 6�� �����ϴ� ���α׷�.
 * @author ������
 */
public class LottoNumber {

	public static void main(String[] args) {

		Random random = new Random();

		//50�̸��� ���� 6���� �����Ѵ�.
		for (int i=0; i<6; i++) {
			int lotto = random.nextInt(50);
			System.out.print(lotto + " ");
		}

	}

}
