package w11_2277;

import java.util.Scanner;

/**
 * 키보드로부터 입력된 정수들을 오름차순을 정렬하는 프로그램.
 * 삽입정렬을 이용한다.
 * @author 조성혁
 *
 */
public class InsertSort {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int []numbers = new int[1000];  //최대 1000개의 정수를 저장할 수 있는 배열
		int size;  		        //실제로 저장되어 있는 정수 개수
		
		System.out.print("데이터 개수를 입력하시오: ");
		size = input.nextInt();
		System.out.print(size + "개의 정수를 입력하시오: ");

		for (int i = 0; i < size; i++)
			numbers[i] = input.nextInt();
		System.out.println();

		sort(numbers, size);

		System.out.println("정렬된 배열: ");
		for (int i = 0; i < size; i++)
			System.out.print(numbers[i]+ " ");
		System.out.println();
		
		input.close();

	}
	
	/**
	 * x[0], x[1], ..., x[i-1]가 이미 오름차순으로 정렬되어 있는 상태에서
	 * x[i]를 그 앞의 올바른 위치로 삽입하여
	 * x[0], x[1], ..., x[i]가 오름차순으로 정렬되도록 한다.
	 * 전제조건 : x[0], x[1], ..., x[i]는 이미 오름차순으로 정렬되어 있다.
	 * 		   i는 배열 x의 크기보다 작다.
	 * @param x 배열
	 * @param i 정렬할 원소의 개수
	 */
	public static void insert (int[] x, int i) {
		int temp = x[i];   		//값을 임시 저장소에 보관.

	    //temp 값을 끼워 넣을 장소를 찾음.
		int j = i-1;
		while ( j >= 0 && temp <x[j]) { 
			x[j+1] = x[j];      //오른쪽으로 이동.
			j--;
		}
		x[j+1]= temp; 	//temp 값(x[i])을 올바른 위치에 끼워 넣음.
	}

	/**
	 * 배열 x를 정렬한다.
	 * x[0], x[1], ..., x[n-1]을 정렬된 상태로 만든다
	 * @param x 배열
	 * @param n 정렬할 원소의 개수
	 */
	public static void sort(int[] x, int n) {	
		
		//insert(x, i) 메소드를 이용하여 아래 작업을 차례로 수행한다.
		//x[0]이 정렬된 상태 --> x[0], x[1]이 정렬된 상태로 만든다.
		//x[0], x[1]이 정렬된 상태 --> x[0], x[1], x[2]가 정렬된 상태로 만든다.
		//...
		//x[0], ..., x[n-2]가 정렬된 상태 --> x[0], ..., x[n-1]가 정렬된 상태로 만든다.
		
		for (int i = 1; i < n; i++)
			insert(x, i);
	}

}
