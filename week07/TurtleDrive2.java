package w7_2277;

/**
 * �ź��̷� ���������� �׸��� ���α׷�.
 * 
 * @author ������
 */
public class TurtleDrive2 {

	public static void main(String[] args) {

		final double STEP = 0.3;	// �̵� �Ÿ�
		final int ANGLE = 72;		// ȸ�� ����
		final int PAUSE = 1000;		// �Ͻ� ���� �ð�. milisecond ����

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
		Turtle turtle  = new Turtle(0.3, 0.3, 0);	// (x, y, theta)

		for(int i=0; i<5; i++) {
			turtle.pause(PAUSE);
			turtle.goForward(STEP);
			turtle.turnLeft(ANGLE);
		}
		turtle.pause(PAUSE);
		turtle.pause(1000);

	}


}
