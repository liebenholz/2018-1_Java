package w11_2277;

/**
 * 많이 쓰이는 배열 조작을 하나의 클래스에 구현해놓고 필요할 때마다 사용한다.
 * 아래의 printArray 메소드를 테스트하는 프로그램.
 * 
 * @author 조성혁
 */
public class ArrayUtil {

	public static void main(String[] args) {

		int[] a = new int [10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}

		//p4. printArray 메소드를 테스트한다.
		System.out.print("printArray(a, 0) : ");
		printArray(a, 0);
		System.out.print("printArray(a, 1) : ");
		printArray(a, 1);
		System.out.print("printArray(a, a.length) : ");
		printArray(a, a.length);
		System.out.print("printArray(a, a.length+1) : ");
		printArray(a, a.length+1);
		System.out.println();
		System.out.println();


		//p6-1. fillRandom 메소드를 테스트한다.
		System.out.println("fillRandom 메소드 테스트 ---------");
		System.out.print("fillRandom(a, 10) : ");
		fillRandom(a, 10);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 100) : ");
		fillRandom(a, 100);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 1) : ");
		fillRandom(a, 1);
		printArray(a, a.length);
		System.out.print("fillRandom(a, 0) : ");
		fillRandom(a, 0);
		printArray(a, a.length);
		System.out.println();


		//p6-2. distinct 메소드를 테스트한다.
		System.out.println("distinct 메소드 테스트 ---------");

		int[] a2 = {1, 1, 2};
		System.out.println("a2 = {1, 1, 2}");
		System.out.println("distinct(a2, a2.length) : "
				+ distinct(a2, a2.length));
		System.out.println("distinct(a2, 0) : " 
				+ distinct(a2, 0));
		System.out.println("distinct(a2, a2.length + 1) : "
				+ distinct(a2, a2.length + 1));

		int[] a3 = {1, 2, 3};
		System.out.println("a3 = {1, 2, 3}");
		System.out.println("distinct(a3, a3.length) : "
				+ distinct(a3, a3.length));
		System.out.println("distinct(a3, a3.length + 1) : "
				+ distinct(a3, a3.length + 1));

		int[] a4 = {1};
		System.out.println("a4 = {1}");
		System.out.println("distinct(a4, a4.length) : "
				+ distinct(a4, a4.length));
		System.out.println("distinct(a4, a4.length + 1) : "
				+ distinct(a4, a4.length + 1));

		int[] a5 = {};
		System.out.println("a5 = {}");
		System.out.println("distinct(a5, a5.length) : "
				+ distinct(a5, a5.length));
		System.out.println("distinct(a5, a5.length + 1) : "
				+ distinct(a5, a5.length + 1));
		System.out.println();


		//p6-3. fillRandomDistinct 메소드를 테스트한다.
		System.out.println("fillRandomDistinct 메소드 테스트 ---------");
		System.out.print("fillRandomDistinct(a, 10) : ");
		fillRandomDistinct(a, 10);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 100) : ");
		fillRandomDistinct(a, 100);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 1) : ");
		fillRandomDistinct(a, 1);
		printArray(a, a.length);
		
		System.out.print("fillRandomDistinct(a, 0) : ");
		fillRandomDistinct(a, 0);
		printArray(a, a.length);
		System.out.println();


		//p6-4. makeRandomArray 메소드를 테스트한다.
		System.out.println("makeRandomArray 메소드 테스트 ---------");
		System.out.print("makeRandomArray(10, 10) : ");
		if ((makeRandomArray(10, 10) == null))
			System.out.println("null");
		else printArray(makeRandomArray(10, 10), makeRandomArray(10, 10).length);

		System.out.print("makeRandomArray(10, 1) : ");
		if ((makeRandomArray(10, 1) == null))
			System.out.println("null");
		else printArray(makeRandomArray(10, 1), makeRandomArray(10, 1).length);

		System.out.print("makeRandomArray(1, 10) : ");
		if((makeRandomArray(1, 10) == null))
			System.out.println("null");
		else printArray(makeRandomArray(1, 10), makeRandomArray(1, 10).length);

		System.out.print("makeRandomArray(1, 0) : ");
		if((makeRandomArray(1, 0) == null))
			System.out.println("null");
		else printArray(makeRandomArray(1, 0), makeRandomArray(1, 0).length);

		System.out.print("makeRandomArray(0, 0) : ");
		if((makeRandomArray(0, 0) == null))
			System.out.println("null");
		else printArray(makeRandomArray(0, 0), makeRandomArray(0, 0).length);

	}

	/**
	 * 배열 앞에 있는 n개의 원소들을 출력할고 마지막에 new line을 출력한다.
	 * n > a.length인 경우에는 적절한 경고 문구와 함께 a.length 개의 원소를 출력한다.
	 * 
	 * @param a 배열
	 * @param n 출력하는 원소의 개수
	 */
	public static void printArray(int[] a, int n) {

		if (n>a.length) {	// 경고!
			System.out.println("배열의 크기보다 더 많은 출력을 요구하였습니다.");
			System.out.println("배열의 크기만큼 출력합니다.");
			for (int i=0; i<a.length; i++) {
				System.out.print(a[i] + " ");
			}
		}
		else {				//정상처리
			for (int i=0; i<n; i++) {
				System.out.print(a[i] + " ");
			}
			System.out.println();
		}
	}

	/**
	 * 배열에 list에 1 이상 max 이하 정수 난수를 채워준다. 난수는 중복될 수 있다.
	 * 이 메소드를 호출하는 자는 아래 전제조건을 지켜야 한다.
	 * 전제조건 : max >= 1
	 * 이 메소드를 호출하는 자가 위 전제조건을 지키지 않으면
	 * 배열을 난수로 채우지 않고 에러 메세지를 출력하고 리턴한다. 
	 * 
	 * @param list 난수를 채울 배열
	 * @param max 난수의 최대값
	 */
	public static void fillRandom(int[] list, int max) {

		if (max<1) {	//조건 불만족!
			System.out.println("max >= 1이어야 합니다.");
			System.out.println("배열에는 아무 것도 채우지 않았습니다.");
		}
		else {			//난수 채우기
			for (int i = 0; i<list.length; i++) {
				int num = (int)(Math.random()*max) + 1;
				list[i] = num;
			}
		}
	}

	/**
	 * 배열 앞 n개의 방 (0번부터 n-1번)의 원소들이 서로 다른지 검사한다.
	 * 원소들이 서로 다른가?
	 * 전제조간 : 1 <= n
	 * n이 0 이하일 때는 적절한 경고 문구를 출력하고 true를 반환한다.
	 * n > a.length 일때는 n == a.length 일 때와 똑같이 작동한다.
	 * 
	 * @param a 배열
	 * @param n 배열에 앞 몇 개 방에 중복 여부 검사를 할 것인가?
	 * @return true, 배열의 앞 n개 원소들이 모두 다른 경우
	 * 		   false, 배열의 앞 n개 방에 중복된 원소가 있는 경우
	 */
	public static boolean distinct(int[] a, int n) {

		if (n<1) {	//초기 조건 불만족!
			System.out.println("n >= 1 이어야 합니다.");
			return true;
		}
		else if (n > a.length) {
			n = a.length;
		}

		boolean isDistinct = true;	//일단 모두 다르다고 하자

		for (int i = n-1; i>=1; i--) {

			//a[i]가 i개의 방 a[0]~a[i-1] 중 어느 하나와 중복된다면,
			//(a[i]가 배열 a의 앞 i개의 방에 들어있다면),
			//distinct하지 않다.
			//중복된 원소가 하나라도 발견되면 더 이상 체크할 필요가 없다.
			//(루프를 빠져나간다.)

			if (Search.linearSearch(a, i, a[i]) != -1) {
				isDistinct = false;		//중복된다!
				break;
			}
		}
		return isDistinct;
	}

	/**
	 * 배열 list에 1 이상 max 이하 "서로 다른" 정수 난수를 채워준다.
	 * 이 메소드를 호출하는 자는 아래 전제조건을 지켜야 한다.
	 * 전제조건 : max >= list.length && max>=1
	 * 이 메소드를 호출하는 자는 위 전제조건을 지키지 않으면
	 * 배열을 난수로 채우지 않고 에러 메세지를 출력하고 리턴한다.
	 * 
	 * @param list 난수를 채울 배열
	 * @param max 난수의 최대값
	 */
	public static void fillRandomDistinct(int[] list, int max) {

		//난수를 발생시킨 후 이 난수를 배열에 넣기 전에
		//이 난수가 이미 배열에 들어 있는지를 검사해야 함.
		//이미 있다면 이 난수를 버리고 새 난수를 발생시킴.

		if (max < list.length || max < 1) {		//조건 불만족!
			System.out.println("max >= list.length 이고 max>=1 이어야 합니다. ");
			System.out.println("배열에 아무 것도 채우지 않았습니다.");
		}

		else {
			int count = 0;	//배열에 넣은 난수 개수

			while (count < list.length) {	//배열에 난수가 가득 찰 때까지 반복

				int number = (int) (max * Math.random()) + 1;

				//number가 배열이 이미 들어있지 않은 경우에만 배열에 추가
				//list의 앞 count개의 방에 number가 들어 있지 않으면
				//number를 배열에 넣고 count를 증가시킴

				for (int i=0; i<count; i++) {
					while (list[i] == number) {
						number = (int) (max * Math.random()) + 1;
						i=0;
					}
				}
				list[count] = number;
				count++;			
			}
		}
	}

	/**
	 * 1 이상 max 이하 정수 난수를 n번 발생시켜 이들을 배열에 저장한 후
	 * 배열을 카리키는 참조변수를 반환한다.
	 * 배열에는 같은 숫자가 두 번 이상 중복될 수 있다.
	 * 전제조건 : n >= 0 && max >= 1
	 * 이 메소드를 호출하는 자가 위 전제조건을 지키지 않으면 null을 반환한다.
	 * 
	 * @param n 난수 개수, 배열의 크기
	 * @param max 1 이상 max 이하 정수
	 * @return
	 */
	public static int[] makeRandomArray(int n, int max) {
		if (n < 0|| max < 1) {
			return null;	//조건 불만족!
		}
		else {	
			int[] list = new int [n];
			int count = 0;	//배열에 넣은 난수 개수

			while (count < list.length) {	//배열에 난수가 가득 찰 때까지 반복

				int number = (int) (max * Math.random()) + 1;
				number = (int) (max * Math.random()) + 1;
				list[count] = number;
				count++;			
			}
			return list;
		}
	}

}