package w9_2277;

/**
 * 배열 덧셈
 * @author 조성혁
 *
 */
public class ArrayAdd {

	public static void main(String[] args) {

		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		double random;

		//a에 0 이상 10 미만 난수를 채운다.
		for (int i=0; i<10; i++) {
			random = (Math.random())*10;
			a[i] = (int)random;
		}
		//b에 0 이상 10 미만 난수를 채운다.
		for (int i=0; i<10; i++) {
			random = (Math.random())*10;
			b[i] = (int)random;

		}
		// c = a + b
		for (int i=0; i<10; i++) {
			c[i] = a[i] + b[i];
		}

		printArray(a);
		printArray(b);
		printArray(c);

	}

	/**
	 * 주어진 배열의 원소를 차례로 출력한다.
	 * @param array 출력할 배열을 가리키는 참조변수.
	 */
	public static void printArray(int[] array)	{
		for (int i=0; i<10; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
