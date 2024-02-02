package w11_2277;

/**
 * ������ ������� ������ �� �迭�� �ְ�, �� �ٸ� ���� ������ ���� ��,
 * �� �����հ� ������ �迭�� ����ϴ� ���α׷�.
 * @author ������
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
		//�������� ���� ���� A���� ���� ������ �۰�
		//B���� ���� ������ �����Ƿ�
		//���Ƿ� A���� ���� ���� ũ�⸦ ���Ѵ�.
		intersection = new int[ALENGTH];
		int intersectionSize;

		ArrayUtil.fillRandomDistinct(a, MAX);
		System.out.print("�迭1 : ");
		ArrayUtil.printArray(a, a.length);
		if(!ArrayUtil.distinct(a, a.length))
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");

		ArrayUtil.fillRandomDistinct(b, MAX);
		System.out.print("�迭2 : ");
		ArrayUtil.printArray(b, b.length);
		if(!ArrayUtil.distinct(b, b.length))
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");

		unionSize = unionArrays(a, b, union);
		System.out.print("Union : ");
		ArrayUtil.printArray(union, unionSize);
		if(!ArrayUtil.distinct(union, unionSize))
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");

		intersectionSize = intersectionArrays(a, b, intersection);
		System.out.print("Intersection : ");
		ArrayUtil.printArray(intersection, intersectionSize);
		if(!ArrayUtil.distinct(intersection, intersectionSize))
			System.out.println("��? �迭�� �ߺ��� ���Ұ� �ֳ�!");

	} 

	/**
	 * �迭 a�� ���ҵ�� �迭 b�� ���ҵ��� ��������
	 * �迭 union�� �ְ� �������� ������ ���� ��ȯ�Ѵ�.
	 * �������� : union.length >= a.length + b.length
	 * 
	 * @param a �迭
	 * @param b �迭
	 * @return �������� ������ ����
	 */

	public static int unionArrays(int[] a, int[] b, int[] union) {
		int count = 0;

		//���� a�迭 ���Ҹ� �����տ� �ű��.
		for(int i=0; i<a.length; i++) {
			union[i] = a[i];
		}

		//b�迭 ���� �߿��� a�迭 ���ҿ� �ߺ��Ǵ� ���Ҹ� �����ϰ� �����տ� �����.
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
	 * �迭 a�� ���ҵ�� �迭 b�� ���ҵ��� ��������
	 * �迭 union�� �ְ� �������� ������ ���� ��ȯ�Ѵ�.
	 * �������� : intersection.length >= min(a.length, b.length)
	 * 
	 * @param a �迭
	 * @param b �迭
	 * @return �������� ������ ����
	 */
	public static int intersectionArrays(int[] a, int[] b, int[] intersection) {
		int count = 0;

		//a�迭 ���ҿ� b�迭 ���Ұ� �ߺ��Ǵ� ���� ������ ������ ���ҷ� �ű��.
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
