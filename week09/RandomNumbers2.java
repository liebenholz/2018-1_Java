package w9_2277;

/**
 * ũ�Ⱑ 10�� int Ÿ�� �迭�� 0 �̻� 100 �̸� ���� ������ ä�� �� �迭�� �� ���Ҹ� ���ʷ� ����ϴ� ���α׷�
 * ����� ���� �ִ밪, �ּҰ��� ���ϰ�, 10���� ���ڵ��� ��յ� ���Ѵ�.
 * @author ������
 *
 */
public class RandomNumbers2 {

	public static void main(String[] args) {

		int[] arr = new int [10];
		double random;
		int min = 100;
		int max = 0;
		double sum = 0.0;	//���ڵ��� ��

		//�迭�� 100 �̸� ������ ä�� �ִ´�.
		System.out.println("100���� ���� ���� ����");
		for (int i=0; i<arr.length; i++) {
			random = (Math.random())*100;
			arr[i] = (int)random;
			System.out.println(arr[i]);
			if (arr[i]<min)	{	//�ּҰ� ����
				min = arr[i];
			}
			if (arr[i]>max) {	//�ִ밪 ����
				max = arr[i];	
			}
			sum += arr[i];
		}

		System.out.println();
		System.out.println("���ҵ� �� �ּҰ�: " + min);
		System.out.println("���ҵ� �� �ִ밪: " + max);
		System.out.println("���ҵ��� ��հ�: " + sum/arr.length);	//���
	}

}
