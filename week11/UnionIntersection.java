package w11_2277;

/**
 * 난수로 만들어진 집합을 한 배열에 넣고, 또 다른 난수 집합을 만든 뒤,
 * 그 합집합과 교집합 배열을 계산하는 프로그램.
 * @author 조성혁
 *
 */
public class UnionIntersection {

	public static void main(String[] args) {
		final int ALENGTH = 10;
		final int BLENGTH = 10;
		final int MAX = 20;

		int[] a = new int[ALENGTH];
		int[] b = new int[BLENGTH];

		int[] union = new int[ALENGTH + BLENGTH];
		int unionSize;

		int[] intersection;
		//교집합의 원소 수는 A집합 원소 수보다 작고
		//B집합 원소 수보다 작으므로
		//임의로 A집합 원소 수로 크기를 정한다.
		intersection = new int[ALENGTH];
		int intersectionSize;

		ArrayUtil.fillRandomDistinct(a, MAX);
		System.out.print("배열1 : ");
		ArrayUtil.printArray(a, a.length);
		if(!ArrayUtil.distinct(a, a.length))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

		ArrayUtil.fillRandomDistinct(b, MAX);
		System.out.print("배열2 : ");
		ArrayUtil.printArray(b, b.length);
		if(!ArrayUtil.distinct(b, b.length))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

		unionSize = unionArrays(a, b, union);
		System.out.print("Union : ");
		ArrayUtil.printArray(union, unionSize);
		if(!ArrayUtil.distinct(union, unionSize))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

		intersectionSize = intersectionArrays(a, b, intersection);
		System.out.print("Intersection : ");
		ArrayUtil.printArray(intersection, intersectionSize);
		if(!ArrayUtil.distinct(intersection, intersectionSize))
			System.out.println("엥? 배열에 중복된 원소가 있네!");

	} 

	/**
	 * 배열 a의 원소들과 배열 b의 원소들의 합집합을
	 * 배열 union에 넣고 합집합의 원소의 수를 반환한다.
	 * 전제조건 : union.length >= a.length + b.length
	 * 
	 * @param a 배열
	 * @param b 배열
	 * @return 합집합의 원소의 개수
	 */

	public static int unionArrays(int[] a, int[] b, int[] union) {
		int count = 0;

		//먼저 a배열 원소를 합집합에 옮긴다.
		for(int i=0; i<a.length; i++) {
			union[i] = a[i];
		}

		//b배열 원소 중에서 a배열 원소와 중복되는 원소를 제외하고 합집합에 옯긴다.
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<a.length; j++) {
				if(a[i] == b[j])
					count++;
				else
					union[a.length + i - count] = b[i];
			}
		}
		return (a.length + b.length - count);
	}

	/**
	 * 배열 a의 원소들과 배열 b의 원소들의 합집합을
	 * 배열 union에 넣고 합집합의 원소의 수를 반환한다.
	 * 전제조건 : intersection.length >= min(a.length, b.length)
	 * 
	 * @param a 배열
	 * @param b 배열
	 * @return 교집합의 원소의 개수
	 */
	public static int intersectionArrays(int[] a, int[] b, int[] intersection) {
		int count = 0;

		//a배열 원소와 b배열 원소가 중복되는 것이 있으면 교집합 원소로 옮긴다.
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(a[i] == b[j]) {
					intersection[count] = a[i];
					count++;
				}
			}
		}
		return count;
	}
}
