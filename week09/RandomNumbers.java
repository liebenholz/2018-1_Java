package w9_2277;

/**
 * ũ�Ⱑ 20�� int Ÿ�� �迭�� 0 �̻� 10 �̸� ���� ������ ä�� �� �迭�� �� ���Ҹ� ���ʷ� ����ϴ� ���α׷�
 * @author ������
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {

		int[] arr = new int [20];
		double random;

		System.out.println("10���� ���� ���� ����");

		//�迭�� 10 �̸� ������ ä�� �ְ� ����Ѵ�.
		for (int i=0; i<arr.length; i++) {
			random = (Math.random())*10;
			arr[i] = (int)random;
			System.out.println(arr[i]);
		}

	}


}
