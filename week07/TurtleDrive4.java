package w7_2277;

/**
 * 거북이로 정사각형들을 그리는 프로그램.
 * drawSquare 메소드를 사용하여 네 개의 사각형을 가로로 일렬 배열한다.
 * 
 * @author 조성혁
 */
public class TurtleDrive4 {

	public static void main(String[] args) {

		final double STEP = 0.2;	// 이동 거리

		// 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
		// (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
		// 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
		// 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.

		Turtle turtle  = new Turtle(0.1, 0.3, 0);	// (x, y, theta)

		for(int i=0; i<4; i++) {
			drawSquare(turtle);
			turtle.goForward(STEP);
		}

	}

	/**
	 * 주어진 Turtle을 이용하여 사각형을 그린다.
	 * @param t 사각형을 그리는데 이용할 거북이
	 */

	public static void drawSquare(Turtle t) {

		final double STEP = 0.2;	// 이동 거리
		final int ANGLE = 90;		// 회전 각도
		final int PAUSE = 1000;		// 일시 정지 시간. milisecond 단위

		for(int j=0; j<4; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}


}
