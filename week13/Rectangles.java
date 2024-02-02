package w13_2277;

import java.awt.Rectangle;

public class Rectangles {

	public static void main(String[] args) {

		// ���º��� ���� �� �ʱ�ȭ
		Rectangle r1 = new Rectangle(50, 50, 100, 100);
		Rectangle r2 = new Rectangle(100, 100, 70, 70);

		Rectangle r3 = new Rectangle(300, 50, 100, 100);
		Rectangle r4 = new Rectangle(350, 100, 70, 70);

		Rectangle intersection, union;       // ���º��� ����

		// intersection�� union�� ����
		intersection = r1.intersection(r2);
		union = r3.union(r4);;
		System.out.println("r1: " + r1);
		System.out.println("r2: " + r2);
		System.out.println("intersection: " + intersection);
		System.out.println();

		System.out.println("r3: " + r3);
		System.out.println("r4: " + r4);
		System.out.println("union: " + union);

	}

}