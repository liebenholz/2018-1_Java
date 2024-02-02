package w7_2277;

import java.util.Scanner;

/**
 * �ź��̷� ���ٰ����� �̿��� ����Ż�� �׸��� ���α׷�.
 * drawNgon �޼ҵ带 ����Ͽ� ����Ѵ�.
 * ����ڰ� ������ ��� �����ϴ��Ŀ� ���� �׷����� ������ �޶��� �� �ִ�.
 * 
 * @author ������
 */
public class TurtleDrive8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double SIZE = 0.2;	// �̵� �Ÿ�
		final int N = 5;			// �ٰ���
		final int HOW_MANY = 30;		// �Ͻ� ���� �ð�. milisecond ����

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.

		Turtle turtle  = new Turtle(0.5, 0.5, 0);	// (x, y, theta)

		for(int i=0; i<=HOW_MANY; i++) {
			drawNgon(turtle,N,SIZE);
			turtle.turnLeft(360/HOW_MANY);
		}
		turtle.pause(1000);

		input.close();
	}

	/**
	 * �ź����� ���� ��ġ�� ���ٰ����� �׸���.
	 * �ź��̰� ���� �ٶ󺸰� �ִ� �������� �켱 �����Ͽ� �� ���� �׸���
	 * �������� ���鼭 ������ ���� �׸���.
	 * @param t �ź���
	 * @param n	����� �׸� ���ΰ�?
	 * @param size �ٰ����� �� ����
	 */
	public static void drawNgon(Turtle t, int n, double size) {

		final double STEP = size;	// �̵� �Ÿ�
		final int ANGLE = 360/n;	// ȸ�� ����
		final int PAUSE = 100;		// �Ͻ� ���� �ð�. milisecond ����

		for(int j=0; j<n; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}

}
