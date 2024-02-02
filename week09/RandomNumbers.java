package w9_2277;

/**
 * 크기가 20인 int 타입 배열을 0 이상 10 미만 정수 난수로 채운 후 배열의 각 원소를 차례로 출력하는 프로그램
 * @author 조성혁
 *
 */
public class RandomNumbers {

	public static void main(String[] args) {

		int[] arr = new int [20];
		double random;

		System.out.println("10보다 작은 정수 난수");

		//배열에 10 미만 난수를 채워 넣고 출력한다.
		for (int i=0; i<arr.length; i++) {
			random = (Math.random())*10;
			arr[i] = (int)random;
			System.out.println(arr[i]);
		}

	}


}
