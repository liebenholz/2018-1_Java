package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * �迭�� ��ȯ�ϴ� �޼ҵ帣 �̿��ϴ� ����
 * �迭�� �Էµ� �� ���� �ؽ�Ʈ ������ ���� �ҷ���
 * ������ �� �� ���� �迭�� �����Ͽ� ����Ѵ�.
 * �� �� �� �ؽ�Ʈ ������ �տ� �����ִ� ���ڴ� �迭�� ũ�⸦ �ǹ��ϸ�,
 * �̸� ��ĵ�� �� �迭�� ũ�⸦ �����ְ� ������ �����͸� �迭�� �����Ѵ�.
 * @author ������
 *
 */
public class ArrayReturn4 {

	public static void main(String[] args) throws IOException {
		
		Scanner input1 = new Scanner(new File("data3.txt"));
		Scanner input2 = new Scanner(new File("data4.txt"));
		
		//data3.txt�� �ҷ��� array1�� �����Ѵ�.
		//ù ��° ���� �迭�� ũ�⸦ �����Ѵ�.
		int i=0;
		int a = input1.nextInt();
		int[] array1 = new int[a];
		while (input1.hasNextInt()) {
			array1[i++] = input1.nextInt();
		}
		
		//data4.txt�� �ҷ��� array2�� �����Ѵ�.
		//ù ��° ���� �迭�� ũ�⸦ �����Ѵ�.
		i=0;
		int b = input2.nextInt();
		int[] array2 = new int[b];
		while (input2.hasNextInt()) {
			array2[i++] = input2.nextInt();
		}
		
		//array1, array2, �׸��� �� �迭�� ������ ���ο� �迭�� ����Ѵ�.
		System.out.print("�迭 1 : \t" );
		RandomNumbers.printArray(array1, a);
		System.out.println();
		System.out.print("�迭 2 : \t" );
		RandomNumbers.printArray(array2, b);
		System.out.println();
		System.out.print("����� �迭 : \t" );
		RandomNumbers.printArray(catArrays(array1, array2), a+b);
		
		input1.close();
		input2.close();
	}
	
	public static int[] catArrays(int[] a1, int[] a2) {
		int n = a1.length + a2.length;
		int[] array = new int [n];
		
		for (int i=0; i<a1.length; i++) {
			array[i] = a1[i];
		}
		
		for (int i=0; i<a2.length; i++) {
			array[i+a1.length] = a2[i];
		}
		return array;
	}

}
