package w9_2277;

/**
 * integers.txt를 읽고 배열에 숫자를 저장하여 
 * 역순으로 정렬한 텍스트 파일 reversedIntegers.txt를 출력하는 프로그램.
 * 
 * @author 조성혁
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
		//정수를 읽어 numbers[0], numbers[1], ... ,numbers[9]에 차례로 저장한다.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		//numbers[9], numbers[8], ... ,numbers[0]를 저장.
		for (int j=i-1; j>=0; j--) {
			output.print(numbers[j] + " ");
		}

		input.close();
		output.close();
	}

}

