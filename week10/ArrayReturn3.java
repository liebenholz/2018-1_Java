package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * �迭�� ��ȯ�ϴ� �޼ҵ帣 �̿��ϴ� ����
 * �迭�� �Էµ� �� ���� �ؽ�Ʈ ������ ���� �ҷ���
 * ������ �� �� ���� �迭�� ���Ͽ� ����Ѵ�.
 * @author ������
 *
 */
public class ArrayReturn3 {

	public static void main(String[] args)  throws IOException {
		
		Scanner input1 = new Scanner(new File("data1.txt"));
		Scanner input2 = new Scanner(new File("data2.txt"));
		
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		//data1.txt�� �ҷ��� array1�� �����Ѵ�.
		int i=0;
		while (input1.hasNextInt()) {
			array1[i++] = input1.nextInt();
		}
		
		//data2.txt�� �ҷ��� array2�� �����Ѵ�.
		i=0;
		while (input2.hasNextInt()) {
			array2[i++] = input2.nextInt();
		}
		
		//array1, array2, �׸��� �� �迭�� ���� ����Ѵ�.
		System.out.print("�迭 1 : \t" );
		RandomNumbers.printArray(array1, i);
		System.out.println();
		System.out.print("�迭 2 : \t" );
		RandomNumbers.printArray(array2, i);
		System.out.println();
		System.out.print("�迭 �� : \t" );
		RandomNumbers.printArray(addArrays(array1, array2), i);
		
		input1.close();
		input2.close();
	}
	
	/**
	 * �迭 a1�� a2�� ���Ѵ�.
	 * ���� ���� : a1�� a2�� ũ��� ����.
	 * a1, a2�� ũ�Ⱑ ���� �� �迭�� �¤��ϰ�
	 * �� �迭�� a1�� a2�� ���� ����� ������ ��
	 * �� �迭�� ����Ű�� ������ ��ȯ�Ѵ�.
	 * @param a1 �迭
	 * @param a2 �迭
	 * @return a1+a2 ����� ������ �� �迭 (��Ȯ����, �� �迭�� ����Ű�� ����)
	 */
	public static int[] addArrays(int[] a1, int[] a2) {
		int array[] = new int [10];
		
		for (int i=0; i<10; i++) {
			array[i] = a1[i] + a2[i];
		}
		
		return array;
	}

}
