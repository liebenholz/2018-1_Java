package w9_2277;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * integers.txt 파일로부터 정수 10개를 읽어 배열에 채운 후 
 * 배열의 앞에 있는 원소들의 합을 차례로 구해 화면에 출력하는 프로그램
 * 
 * @author 조성혁
 *
 */
public class ListSum {

	public static void main(String[] args) throws FileNotFoundException {

		Scanner input = new Scanner(new File("integers.txt"));

		int[] numbers = new int [10];
		int sum;
		int i=0;

		//정수를 읽어 numbers[0], numbers[1], ... ,numbers[9]에 차례로 저장한다.
		while(input.hasNextInt()) {
			numbers[i++] = input.nextInt();
		}

		//배열의 1번째 원소까지의 합, 2번째 원소까지의 합, ... , 1번째 원소까지의 합을 구하여 출력한다.
		for (int j=0; j<i; j++) {
			sum = 0;
			for (int k=0; k<=j; k++) {
				sum += numbers[k];
			}
			System.out.println("배열의 첫 " + (j+1) + "개 원소의 합 : " + sum);
		}

		input.close();
	}

}
