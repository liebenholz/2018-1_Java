package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 배열을 반환하는 메소드르 이용하는 문제
 * 배열이 입력된 두 개의 텍스트 파일을 각각 불러와
 * 저장한 뒤 두 개의 배열을 연결하여 출력한다.
 * 이 떄 각 텍스트 파일의 앞에 적혀있는 숫자는 배열의 크기를 의미하며,
 * 이를 스캔한 후 배열의 크기를 정헤주고 이후의 데이터를 배열에 저장한다.
 * @author 조성혁
 *
 */
public class ArrayReturn4 {

	public static void main(String[] args) throws IOException {
		
		Scanner input1 = new Scanner(new File("data3.txt"));
		Scanner input2 = new Scanner(new File("data4.txt"));
		
		//data3.txt를 불러와 array1에 저장한다.
		//첫 번째 수는 배열의 크기를 결정한다.
		int i=0;
		int a = input1.nextInt();
		int[] array1 = new int[a];
		while (input1.hasNextInt()) {
			array1[i++] = input1.nextInt();
		}
		
		//data4.txt를 불러와 array2에 저장한다.
		//첫 번째 수는 배열의 크기를 결정한다.
		i=0;
		int b = input2.nextInt();
		int[] array2 = new int[b];
		while (input2.hasNextInt()) {
			array2[i++] = input2.nextInt();
		}
		
		//array1, array2, 그리고 두 배열을 연결한 새로운 배열을 출력한다.
		System.out.print("배열 1 : \t" );
		RandomNumbers.printArray(array1, a);
		System.out.println();
		System.out.print("배열 2 : \t" );
		RandomNumbers.printArray(array2, b);
		System.out.println();
		System.out.print("연결된 배열 : \t" );
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
