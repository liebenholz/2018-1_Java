package w10_2277;

import java.util.Scanner;

/**
 * int 타입 배열에 0이상 10미만 정수 난수를 넣은 후
 * 배열의 각 원소를 차례로 출력하는 프로그램.
 * @author 조성혁
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		final int SIZE = 20;
		final int MAX = 10;
		int[] intArray;
		
		//makeRandomArray 메소드를 호출하여
		//0 이상 MAX 미만의 난수가 들어있는, 크기가 SIZE인 배열을 만들어 줄 것을 요청한다.
		//메소드로부터 반환되는 (새로 만들어진 배열을 가리키는) 참조변수를
		//intArray에 저장한다.
		
		intArray = makeRandomArray(SIZE, MAX);
		
		//배열을 출력한다.
		System.out.print("배열의 몇 번째 원소까지 출력하겠습니까? (" + SIZE + "개 이하) : ");
		int howMuch = input.nextInt();
		printArray(intArray, howMuch);
		
		input.close();

	}

	/**
	 * 배열을 만들고,
	 * 0이상 max 미만의 정수 난수를 n번 발생시켜
	 * 이들을 배열에 저장한 후 배열을 가리키는 참조변수를 반환한다.
	 * @param n 배열의 크기(난수의 개수)
	 * @param max 0이상 max 미만의 난수를 발생시키도록 함.
	 * @return 무작위 숫자로 만들어진 배열의 참조변수.
	 */
	
	public static int[] makeRandomArray(int n, int max) {
		int array[] = new int [n];
		double random;
		
		for (int i=0; i<array.length; i++) {
			random = (Math.random())*max;
			array[i] = (int)random;
		}
		return array;
	}
	
	
	/**
	 * 주어진 배열의 원고를 주어진 수만큼 출력한다.
	 * (배열의 원소 모두를 출력하지 않고, 원소들 중 앞 쪽 일부만을 출력할 수 있다.)
	 * @param a 출력할 배멸
	 * @param n 배열의 원소를 몇 개 출력할 것인가?
	 */
	
	public static void printArray(int[] a, int n) {
		for (int i = 0; i<n; i++) {
			System.out.print(a[i] + "\t");
		}
	}
}
