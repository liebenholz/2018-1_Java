package w11_2277;

/**
 * swap 메소드가 배열 안의 두 값을 성공적으로 바꾸주는지 알아보는 프로그램.
 * @author 조성혁
 *
 */
public class SwapComparison {

	public static void main(String[] args) {

		int[] anArray = {10,20};

		//아래의 코드에서는 swap(int x, int y)가 실행된다.
		//값을 바꿔주는 것에 실패하여 
		//anArray[0] = 10 anArray[1] = 20 이 출력된다.
		swap(anArray[0], anArray[1]);
		System.out.println("anArray[0] = " + anArray[0] + " anArray[1] = " + anArray[1]);

		//아래의 코드에서는 swap(int[] a, int i, int j)이 실행된다.
		//값을 바꿔주는 것에 성공하여
		//anArray[0] = 20 anArray[1] = 10 이 출력된다.
		swap(anArray, 0, 1);
		System.out.println("anArray[0] = " + anArray[0] + " anArray[1] = " + anArray[1]);

	}

	/**
	 * x,y의 값을 서로 바꿔준다.
	 * @param x
	 * @param y
	 */
	public static void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
	}

	/**
	 * a[i]와 a[j]의 값을 서로 바꿔준다.
	 * @param a
	 * @param i
	 * @param j
	 */
	public static void swap(int[] a, int i, int j) {
		int temp;
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
