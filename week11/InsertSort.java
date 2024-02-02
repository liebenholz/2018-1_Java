package w11_2277;

import java.util.Scanner;

/**
 * Ű����κ��� �Էµ� �������� ���������� �����ϴ� ���α׷�.
 * ���������� �̿��Ѵ�.
 * @author ������
 *
 */
public class InsertSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int []numbers = new int[1000];  //�ִ� 1000���� ������ ������ �� �ִ� �迭
		int size;  		        //������ ����Ǿ� �ִ� ���� ����
		
		System.out.print("������ ������ �Է��Ͻÿ�: ");
		size = input.nextInt();
		System.out.print(size + "���� ������ �Է��Ͻÿ�: ");

		for (int i = 0; i < size; i++)
			numbers[i] = input.nextInt();
		System.out.println();

		sort(numbers, size);

		System.out.println("���ĵ� �迭: ");
		for (int i = 0; i < size; i++)
			System.out.print(numbers[i]+ " ");
		System.out.println();
		
		input.close();

	}
	
	/**
	 * x[0], x[1], ..., x[i-1]�� �̹� ������������ ���ĵǾ� �ִ� ���¿���
	 * x[i]�� �� ���� �ùٸ� ��ġ�� �����Ͽ�
	 * x[0], x[1], ..., x[i]�� ������������ ���ĵǵ��� �Ѵ�.
	 * �������� : x[0], x[1], ..., x[i]�� �̹� ������������ ���ĵǾ� �ִ�.
	 * 		   i�� �迭 x�� ũ�⺸�� �۴�.
	 * @param x �迭
	 * @param i ������ ������ ����
	 */
	public static void insert (int[] x, int i) {
		int temp = x[i];   		//���� �ӽ� ����ҿ� ����.

	    //temp ���� ���� ���� ��Ҹ� ã��.
		int j = i-1;
		while ( j >= 0 && temp <x[j]) { 
			x[j+1] = x[j];      //���������� �̵�.
			j--;
		}
		x[j+1]= temp; 	//temp ��(x[i])�� �ùٸ� ��ġ�� ���� ����.
	}

	/**
	 * �迭 x�� �����Ѵ�.
	 * x[0], x[1], ..., x[n-1]�� ���ĵ� ���·� �����
	 * @param x �迭
	 * @param n ������ ������ ����
	 */
	public static void sort(int[] x, int n) {	
		
		//insert(x, i) �޼ҵ带 �̿��Ͽ� �Ʒ� �۾��� ���ʷ� �����Ѵ�.
		//x[0]�� ���ĵ� ���� --> x[0], x[1]�� ���ĵ� ���·� �����.
		//x[0], x[1]�� ���ĵ� ���� --> x[0], x[1], x[2]�� ���ĵ� ���·� �����.
		//...
		//x[0], ..., x[n-2]�� ���ĵ� ���� --> x[0], ..., x[n-1]�� ���ĵ� ���·� �����.
		
		for (int i = 1; i < n; i++)
			insert(x, i);
	}

}
