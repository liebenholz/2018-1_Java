package w13_2277;

/**
 * LottoGenerator�� �̿��ؼ� �ζ� 10�� �̴� ���α׷�
 * @author ������
 */
public class LottoGeneratorTest {

	public static void main(String[] args) {

		int[] numbers;	//���� �迭�� ����Ű�� �� ����� ��������

		//LorroGenerator �ν��Ͻ� ����
		LottoGenerator generator = new LottoGenerator();

		//6���� ���ڷ� �̷���� �ζ� ��ȣ 10�� ����
		for (int n=0; n<10; n++) {
			//LottoGenerator���� �ζ� ��ȣ 6���� ���� ���� ������
			numbers = generator.generateNumbers();

			//6���� ���ڸ� ȭ�鿡 ���
			for (int i=0; i<6; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

	}

}
