package w10_2277;

/**
 * 메소드를 불러들여 만들어진 배열을 출력하는 프로그램.
 * @author 조성혁
 *
 */
public class ArrayReturn {

	public static void main(String[] args) {

		int[] array;
		
		//makeArray 메소드를 호출하면 배열을 가리키는 참조가 반환된다.
		//그 참조를 참조변수 array에 저장한다.
		//그렇게 하고 나면 참조변수 array를 이용하여 배열에 접근할 수 있다.
		array = makeArray();
		
		//배열을 출력한다.
		RandomNumbers.printArray(array, 10);
		
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
}
