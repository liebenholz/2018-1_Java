package w9_2277;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt�� �а� �迭�� ���ڸ� �����Ͽ� �������� �ֿܼ� ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("integers.txt"));

		int[] numbers = new int [10];

		int i=0;
		//������ �о� numbers[0], numbers[1], ... ,numbers[9]�� ���ʷ� �����Ѵ�.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		System.out.println("�迭�� �������� ���: ");
		//numbers[9], numbers[8], ... ,numbers[0]�� ���.
		for (int j=i-1; j>=0; j--) {
			System.out.print(numbers[j] + " ");
		}

		input.close();
	}

}
