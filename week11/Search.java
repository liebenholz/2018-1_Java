package w11_2277;

/**
 * 선형탐색 메소드와 이진탐색 메소드를 테스트하는 프로그램.
 * @author 조성혁
 *
 */
public class Search {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 5 };

		//linearSearch 테스트
		System.out.println("linearSearch Test --------------");

		System.out.print("배열 a : ");
		ArrayUtil.printArray(a, a.length);

		System.out.println("linearSearch(a, a.length, 5) : " 
				+ linearSearch(a, a.length, 5));

		System.out.println("linearSearch(a, 1, 1) : " 
				+ linearSearch(a, 1, 1));

		System.out.println("linearSearch(a, 4, 5) : " 
				+ linearSearch(a, 4, 5));

		System.out.println("linearSearch(a, 1, 2) : " 
				+ linearSearch(a, 1, 2));

		System.out.println("linearSearch(a, a.length, 2) : " 
				+ linearSearch(a, a.length, 2));

		System.out.println("linearSearch(a, 0, 5) : " 
				+ linearSearch(a, 0, 5));

		System.out.println("linearSearch(a, a.length, 4) : " 
				+ linearSearch(a, a.length, 4));
		System.out.println();

		//binarySearch 메소드 테스트
		System.out.println("binarySearch Test --------------");

		System.out.print("배열 a : ");
		ArrayUtil.printArray(a, a.length);

		System.out.println("binarySearch(a, a.length, 5) : " 
				+ binarySearch(a, a.length, 5));
		
		System.out.println("binarySearch(a, 1, 1) : " 
				+ binarySearch(a, 1, 1));

		System.out.println("binarySearch(a, 4, 5) : " 
				+ binarySearch(a, 4, 5));

		System.out.println("binarySearch(a, 1, 2) : " 
				+ binarySearch(a, 1, 2));

		System.out.println("binarySearch(a, a.length, 2) : " 
				+ binarySearch(a, a.length, 2));

		System.out.println("binarySearch(a, 0, 5) : " 
				+ binarySearch(a, 0, 5));

		System.out.println("binarySearch(a, a.length, 4) : " 
				+ binarySearch(a, a.length, 4));
	}

	/**
	 * 선형탐색 (Linear Search) 배열 x의 앞 n개의 방에 key가 들어있는가?
	 * 
	 * @param x 배열
	 * @param n x의 앞 몇 개의 방에서 key를 찾을 것인가?
	 * @param key 찾을 데이터
	 * @return key가 x에 있는 경우, x 내에서 key의 위치(인덱스)를 반환.
	 * 		   (key가 x내에 여러 개 있는 경우에는 첫 번째 key의 인덱스를 반환.)
	 * 		   key가 x에 없는 경우, -1을 반환.
	 * 
	 */
	public static int linearSearch (int[] x, int n, int key) {		
		for (int i=0; i<n; i++) {
			if (x[i] == key)
				return i;
		}
		return -1;
	}

	/**
	 * 이진탐색 (Binary Search)
	 * 전제조건 : 배열 x가 이미 오름차순으로 청렬되어 있다.
	 * 배열에는 데이터가 꽉 차 있지 않을 수 있다.
	 * 
	 * @param x 정렬된 정수 배열
	 * @param n x에 들어있는 데이터 개수
	 * @param key 찾을 데이터
	 * @return
	 * 		x 내에서 key의 위치 (인덱스), key가 x에 있는 경우
	 * 		(key가 x내에 여러 개 있는 경우에는 그 중 어느 하나의 인덱스)
	 * 		-1, key가 x에 없는 경우
	 */
	public static int binarySearch (int[] x, int n, int key) {

		int low = 0;                      // 배열의 최소 인덱스
		int high = n-1;                   // 최대 인덱스 
		int mid;                          // 중앙 인덱스
		
		while (high >= low) {
			mid  = (high + low) / 2;      // 중앙 인덱스 계산
			if (key == x[mid])
				return mid;               //키를 발견 -- 종료
			if (key < x[mid])
				high = mid - 1;           //x[mid]에서 x[high]까지 제외
			else
				low = mid + 1;            //x[low]에서 x[mid]까지 제외
		}
		return -1;                        //키를 발견하지 못함

	}
}
