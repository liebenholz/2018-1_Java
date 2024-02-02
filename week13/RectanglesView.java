package w13_2277;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class RectanglesView extends JFrame {

	private static final long serialVersionUID = 1L;

	// ���º��� ���� �� �ʱ�ȭ
	Rectangle r1 = new Rectangle(50, 50, 100, 100);
	Rectangle r2 = new Rectangle(100, 100, 70, 70);

	Rectangle r3 = new Rectangle(300, 50, 100, 100);
	Rectangle r4 = new Rectangle(350, 100, 70, 70);

	Rectangle intersection, union;     // ���º��� ����

	// ������
	RectanglesView() {
		super("Rectangles");       // â ���� ����
		setSize(500, 250);                    // â ũ�� ����

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

	public void paint(Graphics g) {

		// r1, r2�� �׸� (draw Rectangle)
		g.drawRect(r1.x, r1.y, r1.width, r1.height);
		g.drawRect(r2.x, r2.y, r2.width, r2.height);

		// Color ������ �Ķ����: red, green, blue, ���� (0~255)
		g.setColor(new Color(100, 100, 100, 100));
		g.fillRect(intersection.x, intersection.y, intersection.width, intersection.height); // fill Rectangle
		g.setColor(Color.BLACK);
		g.drawRect(intersection.x, intersection.y, intersection.width, intersection.height); 

		g.drawRect(r3.x, r3.y, r3.width, r3.height);
		g.drawRect(r4.x, r4.y, r4.width, r4.height);
		g.setColor(new Color(100, 100, 100, 100));
		g.fillRect(union.x, union.y, union.width, union.height);
		g.setColor(Color.BLACK);
		g.drawRect(union.x, union.y, union.width, union.height);

	}

	public static void main(String[] args) {
		JFrame f = new RectanglesView();
		f.setVisible(true);
	}

}
