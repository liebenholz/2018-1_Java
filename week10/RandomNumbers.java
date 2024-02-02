package w10_2277;

import java.util.Scanner;

/**
 * int Ÿ�� �迭�� 0�̻� 10�̸� ���� ������ ���� ��
 * �迭�� �� ���Ҹ� ���ʷ� ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final int SIZE = 20;
		final int MAX = 10;
		int[] intArray;
		
		//makeRandomArray �޼ҵ带 ȣ���Ͽ�
		//0 �̻� MAX �̸��� ������ ����ִ�, ũ�Ⱑ SIZE�� �迭�� ����� �� ���� ��û�Ѵ�.
		//�޼ҵ�κ��� ��ȯ�Ǵ� (���� ������� �迭�� ����Ű��) ����������
		//intArray�� �����Ѵ�.
		
		intArray = makeRandomArray(SIZE, MAX);
		
		//�迭�� ����Ѵ�.
		System.out.print("�迭�� �� ��° ���ұ��� ����ϰڽ��ϱ�? (" + SIZE + "�� ����) : ");
		int howMuch = input.nextInt();
		printArray(intArray, howMuch);
		
		input.close();

	}

	/**
	 * �迭�� �����,
	 * 0�̻� max �̸��� ���� ������ n�� �߻�����
	 * �̵��� �迭�� ������ �� �迭�� ����Ű�� ���������� ��ȯ�Ѵ�.
	 * @param n �迭�� ũ��(������ ����)
	 * @param max 0�̻� max �̸��� ������ �߻���Ű���� ��.
	 * @return ������ ���ڷ� ������� �迭�� ��������.
	 */
	
	public static int[] makeRandomArray(int n, int max) {
		int array[] = new int [n];
		double random;
		
		for (int i=0; i<array.length; i++) {
			random = (Math.random())*max;
			array[i] = (int)random;
		}
		return array;
	}
	
	
	/**
	 * �־��� �迭�� ���� �־��� ����ŭ ����Ѵ�.
	 * (�迭�� ���� ��θ� ������� �ʰ�, ���ҵ� �� �� �� �Ϻθ��� ����� �� �ִ�.)
	 * @param a ����� ���
	 * @param n �迭�� ���Ҹ� �� �� ����� ���ΰ�?
	 */
	
	public static void printArray(int[] a, int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
