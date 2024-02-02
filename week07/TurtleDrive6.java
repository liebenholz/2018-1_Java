package w7_2277;

import java.util.Scanner;

/**
 * �ź��̷� ���ٰ������� �׸��� ���α׷�.
 * drawNgon �޼ҵ带 ����Ͽ� �� ���� ���ٰ����� 2*2 ��İ� ���� �迭�Ѵ�.
 * �Ʒ� �ڵ忡���� ���簢�� �� ���� �׸���.
 * 
 * @author ������
 */
public class TurtleDrive6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double STEP = 0.2;	// �̵� �Ÿ�

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.

		Turtle turtle  = new Turtle(0.5, 0.3, 0);	// (x, y, theta)

		int n = 4;			//�� ������ �׸� ���ΰ�? �簢���� �׸���.
		double size = 0.2;	//�ٰ����� ���� ���̴� �󸶷� �� ���ΰ�? 0.2�� �Ѵ�.

		for(int i=0; i<4; i++) {
			drawNgon(turtle,n,size);
			turtle.goForward(STEP);
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
		final int PAUSE = 1000;		// �Ͻ� ���� �ð�. milisecond ����

		for(int j=0; j<=4; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}

}
