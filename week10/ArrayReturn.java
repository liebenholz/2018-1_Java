package w10_2277;

/**
 * �޼ҵ带 �ҷ��鿩 ������� �迭�� ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class ArrayReturn {

	public static void main(String[] args) {

		int[] array;
		
		//makeArray �޼ҵ带 ȣ���ϸ� �迭�� ����Ű�� ������ ��ȯ�ȴ�.
		//�� ������ �������� array�� �����Ѵ�.
		//�׷��� �ϰ� ���� �������� array�� �̿��Ͽ� �迭�� ������ �� �ִ�.
		array = makeArray();
		
		//�迭�� ����Ѵ�.
		RandomNumbers.printArray(array, 10);
		
	}
	
	/**
	 * ũ�Ⱑ 10�� int �迭�� ������ ��
	 * 0�� ���� 0*0��,
	 * 1�� ���� 1*1��,
	 * ...
	 * 9�� ���� 9*9�� �����ϰ�
	 * �迭�� ��ȯ�Ѵ�.
	 * �迭�� ��ȯ�Ѵٴ� ���� �� �迭�� ����Ű�� ����(reference)�� ��ȯ�ܴٴ� ���̴�.
	 * @return �迭�� ����Ű�� ����
	 */
	public static int[] makeArray() {
		int[] array = new int[10];
		for (int i=0; i<10; i++) {
			array[i] = i*i;
		}
		return array;
	}
}
