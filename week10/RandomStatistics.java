package w10_2277;

/**
 * 크기가 10인 int 타입 배열에 0 이상 100 미만 정수 난수를 넣은 후,
 * 배열의 각 원소를 차례로 출력하여
 * 원소들 중 최대값과 최소값, 그리고 원소들의 평균을 출력하는 프로그램.
 * @author 조성혁
 *
 */
public class RandomStatistics {

	public static void main(String[] args) {
		
		final int SIZE = 10;
		int[] array = new int[SIZE];
		
		System.out.println("100보다 작은 정수 난수");
		writeRandomNumbers(array, SIZE);
		
		for(int i=0; i<SIZE; i++) {
			System.out.println(array[i]);
		}
		int min = min(array);
		int max = max(array);
		double average = average(array);
		
		System.out.println("원소들 중 최소값: " + min);
		System.out.println("원소들 중 최대값: " + max);
		System.out.println("원소들의 평균: " + average);

	}

	/**
	 * 0이상 n 미만의 정수 난수를 발생시켜 배열 a를 차례로 채운다.
	 * @param a 난수를 저장할 배열
	 * @param n 0 이상 n 미만 난수 발생
	 */
	public static void writeRandomNumbers(int[] a, int n) {
		
		for(int i=0; i < a.length; i++) {
			a[i] = (int)(Math.random() * 100);
		}
	}
	
	/**
	 * 배열 a의 원소 중 최소값을 찾아 반환한다.
	 * @param a 배열을 가리키는 참조변수
	 * @return 최소값
	 */
	public static int min(int[] a) {
		
		int min = 99;

		for(int i = 0; i < 10; i++) {
			if(a[i] < min) {
				min = a[i];	
			}
		}
		return min;
	}
	
	/**
	 * 배열 a의 원소 중 최대값을 찾아 반환한다.
	 * @param a 배열을 가리키는 참조변수
	 * @return 최대값
	 */
	public static int max(int[] a) {
		
		int max = 0;
		
		for(int i = 0; i < 10; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}
	
	/**
	 * 배열 a의 원소들의 평균값 반환한다.
	 * @param a 배열을 가리키는 참조변수
	 * @return 평균값
	 */
	public static double average(int[] a) {
		int average;
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			sum += a[i];
		}
		average = sum / 10;
		
		return average;
	}
}
