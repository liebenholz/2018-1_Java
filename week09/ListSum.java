package w9_2277;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt ���Ϸκ��� ���� 10���� �о� �迭�� ä�� �� 
 * �迭�� �տ� �ִ� ���ҵ��� ���� ���ʷ� ���� ȭ�鿡 ����ϴ� ���α׷�
 * 
 * @author ������
 *
 */
public class ListSum {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("integers.txt"));

		int[] numbers = new int [10];
		int sum;
		int i=0;

		//������ �о� numbers[0], numbers[1], ... ,numbers[9]�� ���ʷ� �����Ѵ�.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		//�迭�� 1��° ���ұ����� ��, 2��° ���ұ����� ��, ... , 1��° ���ұ����� ���� ���Ͽ� ����Ѵ�.
		for (int j=0; j<i; j++) {
			sum = 0;
			for (int k=0; k<=j; k++) {
				sum += numbers[k];
			}
			System.out.println("�迭�� ù " + (j+1) + "�� ������ �� : " + sum);
		}

		input.close();
	}

}
