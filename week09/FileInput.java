package w9_2277;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt를 읽고 배열에 숫자를 저장하여 역순으로 콘솔에 출력하는 프로그램.
 * @author 조성혁
 *
 */
public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("integers.txt"));

		int[] numbers = new int [10];

		int i=0;
		//정수를 읽어 numbers[0], numbers[1], ... ,numbers[9]에 차례로 저장한다.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		System.out.println("배열을 역순으로 출력: ");
		//numbers[9], numbers[8], ... ,numbers[0]를 출력.
		for (int j=i-1; j>=0; j--) {
			System.out.print(numbers[j] + " ");
		}

		input.close();
	}

}
