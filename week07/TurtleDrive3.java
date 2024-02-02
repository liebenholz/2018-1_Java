package w7_2277;

/**
 * �ź��̷� ���簢������ �׸��� ���α׷�.
 * �� ���� ���簢���� ���η� �迭�Ͽ� �׷�����
 * 
 * @author ������
 */
public class TurtleDrive3 {

	public static void main(String[] args) {

		final double STEP = 0.2;	// �̵� �Ÿ�
		final int ANGLE = 90;		// ȸ�� ����
		final int PAUSE = 1000;		// �Ͻ� ���� �ð�. milisecond ����

		// �����ڸ� �����Ͽ� �ź��� �ν��Ͻ��� �ϳ� �����Ѵ�.
		// (x, y)�� �ź����� �ʱ� ��ġ�̸� theta�� �ź��̰� �ʱ⿡ ���ϰ� �ִ� �����̴�.
		// ������ ���� �����̸� ��������0���̰� ���� 90���̴�.
		// ����� ���� �Ʒ� �𼭸� ��ǥ�� (0.0, 0.0), ������ �� �𼭸� ��ǥ�� (1.0, 1.0)�̴�.
		Turtle turtle  = new Turtle(0.1, 0.4, 0);	// (x, y, theta)

		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				turtle.pause(PAUSE);
				turtle.goForward(STEP);
				turtle.turnLeft(ANGLE);
			}
			turtle.goForward(STEP);
		}
		turtle.pause(PAUSE);
		turtle.pause(1000);

	}


}
