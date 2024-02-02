package w9_2277;

/**
 * integers.txt�� �а� �迭�� ���ڸ� �����Ͽ� 
 * �������� ������ �ؽ�Ʈ ���� reversedIntegers.txt�� ����ϴ� ���α׷�.
 * 
 * @author ������
 *
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class FileInFileOut {


	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("integers.txt"));
		PrintWriter output = new PrintWriter("reversedIntegers.txt");

		int i=0;
		int[] numbers = new int [10];
		//������ �о� numbers[0], numbers[1], ... ,numbers[9]�� ���ʷ� �����Ѵ�.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		//numbers[9], numbers[8], ... ,numbers[0]�� ����.
		for (int j=i-1; j>=0; j--) {
			output.print(numbers[j] + " ");
		}

		input.close();
		output.close();
	}

}

