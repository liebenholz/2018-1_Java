package w9_2277;

/**
 * 크기가 10인 int 타입 배열을 0 이상 100 미만 정수 난수로 채운 후 배열의 각 원소를 차례로 출력하는 프로그램
 * 출력한 값의 최대값, 최소값을 구하고, 10개의 숫자들의 평균도 구한다.
 * @author 조성혁
 *
 */
public class RandomNumbers2 {

	public static void main(String[] args) {

		int[] arr = new int [10];
		double random;
		int min = 100;
		int max = 0;
		double sum = 0.0;	//숫자들의 합

		//배열에 100 미만 난수를 채워 넣는다.
		System.out.println("100보다 작은 정수 난수");
		for (int i=0; i<arr.length; i++) {
			random = (Math.random())*100;
			arr[i] = (int)random;
			System.out.println(arr[i]);
			if (arr[i]<min)	{	//최소값 갱신
				min = arr[i];
			}
			if (arr[i]>max) {	//최대값 갱신
				max = arr[i];	
			}
			sum += arr[i];
		}

		System.out.println();
		System.out.println("원소들 중 최소값: " + min);
		System.out.println("원소들 중 최대값: " + max);
		System.out.println("원소들의 평균값: " + sum/arr.length);	//평균
	}

}
