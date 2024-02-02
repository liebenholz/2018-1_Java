package w10_2277;

/**
 * 배열을 반환하는 메소드르 이용하는 문제
 * 지정된 크기의 배열을 반환하는 메소드를 호출한 후
 * 반환된 배열의 내용을 출력하는 작업을 반복한다.
 * 메소드가 얼마나 큰 배열을 만들게 할지는
 * 메소드를 호툴할 때 인수를 통해 지정해준다.
 * @author 조성혁
 *
 */
public class ArrayReturn2 {

	public static void main(String[] args) {

		int[] array;
		int num = 10;
		
		//파라미터를 갖지 않는 makeArray 메소드를 호출하여 반환된 배열을 출력한다.
		array = makeArray();
		RandomNumbers.printArray(array, num);
		
		//파라미터를 하나 갖는 makeArray 메소드를 호출하여 반환된 배열을 출력하는 일을
		//10번 반복한다.
		//파라미터를 하나 갖는 makeArray 메소드를 호출할 때 메소드를 넘겨주는 인자는
		//1부터 시작하여 10까지 증가한다.
		for (int i = 0; i<=num; i++) {
			array = makeArray(i+1);
			RandomNumbers.printArray(array, i);
			System.out.println();
		}
		
	}
	
	/**
	 * 크기가 10인 int 배열을 구성한 후
	 * 0번 방은 0*0을,
	 * 1번 방은 1*1을,
	 * ...
	 * 9번 방은 9*9를 저장하고
	 * 배열을 반환한다.
	 * 배열을 반환한다는 것은 곧 배열을 가리키는 참조(reference)를 반환단다는 말이다.
	 * @return 배열을 가리키는 참조
	 */
	public static int[] makeArray() {
		int[] array = new int[10];
		for (int i=0; i<10; i++) {
			array[i] = i*i;
		}
		return array;
	}
	
	/**
	 * 크기가 n인 int 배열을 구성한 후
	 * 0번 방은 0*0을,
	 * 1번 방은 1*1을,
	 * ...
	 * n-1번 방은 (n-1)*(n-1)을 저장하고
	 * 배열을 반환한다.
	 * 배열을 반환한다는 것은 곧 배열을 가리키는 참조(reference)를 반환단다는 말이다.
	 * @param n 배열의 크기
	 * @return 배열을 가리키는 참조
	 */
	public static int[] makeArray(int n) {
		int[] array = new int[n];
		for (int i=0; i<n; i++) {
			array[i] = i*i;
		}
		return array;
	}
}
