package w7_2277;

/**
 * �ź��̷� ���簢������ �׸��� ���α׷�.
 * drawSquare �޼ҵ带 ����Ͽ� �� ���� �簢���� ���η� �Ϸ� �迭�Ѵ�.
 * 
 * @author ������
 */
public class TurtleDrive4 {

	public static void main(String[] args) {

		final double STEP = 0.2;	// �̵� �Ÿ�

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.

		Turtle turtle  = new Turtle(0.1, 0.3, 0);	// (x, y, theta)

		for(int i=0; i<4; i++) {
			drawSquare(turtle);
			turtle.goForward(STEP);
		}

	}

	/**
	 * �־��� Turtle�� �̿��Ͽ� �簢���� �׸���.
	 * @param t �簢���� �׸��µ� �̿��� �ź���
	 */

	public static void drawSquare(Turtle t) {

		final double STEP = 0.2;	// �̵� �Ÿ�
		final int ANGLE = 90;		// ȸ�� ����
		final int PAUSE = 1000;		// �Ͻ� ���� �ð�. milisecond ����

		for(int j=0; j<4; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}


}
