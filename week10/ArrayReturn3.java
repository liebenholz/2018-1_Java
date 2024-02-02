package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 배열을 반환하는 메소드르 이용하는 문제
 * 배열이 입력된 두 개의 텍스트 파일을 각각 불러와
 * 저장한 뒤 두 개의 배열을 더하여 출력한다.
 * @author 조성혁
 *
 */
public class ArrayReturn3 {

	public static void main(String[] args)  throws IOException {
		
		Scanner input1 = new Scanner(new File("data1.txt"));
		Scanner input2 = new Scanner(new File("data2.txt"));
		
		int[] array1 = new int[10];
		int[] array2 = new int[10];
		
		//data1.txt를 불러와 array1에 저장한다.
		int i=0;
		while (input1.hasNextInt()) {
			array1[i++] = input1.nextInt();
		}
		
		//data2.txt를 불러와 array2에 저장한다.
		i=0;
		while (input2.hasNextInt()) {
			array2[i++] = input2.nextInt();
		}
		
		//array1, array2, 그리고 두 배열의 합을 출력한다.
		System.out.print("배열 1 : \t" );
		RandomNumbers.printArray(array1, i);
		System.out.println();
		System.out.print("배열 2 : \t" );
		RandomNumbers.printArray(array2, i);
		System.out.println();
		System.out.print("배열 합 : \t" );
		RandomNumbers.printArray(addArrays(array1, array2), i);
		
		input1.close();
		input2.close();
	}
	
	/**
	 * 배열 a1과 a2를 더한다.
	 * 전제 조선 : a1과 a2의 크기는 같다.
	 * a1, a2와 크기가 같은 세 배열을 굿ㅇ하고
	 * 이 배열에 a1과 a2를 더한 결과를 저장한 후
	 * 세 배열을 가리키는 참조를 반환한다.
	 * @param a1 배열
	 * @param a2 배열
	 * @return a1+a2 결과를 저장한 새 배열 (정확히는, 새 배열을 가리키는 참조)
	 */
	public static int[] addArrays(int[] a1, int[] a2) {
		int array[] = new int [10];
		
		for (int i=0; i<10; i++) {
			array[i] = a1[i] + a2[i];
		}
		
		return array;
	}

}
