package w7_2277;

import java.util.Scanner;

/**
 * 거북이로 정다각형을 이용한 프렉탈을 그리는 프로그램.
 * drawNgon 메소드를 사용하여 출력한다.
 * 사용자가 변수를 어떻게 선언하느냐에 따라 그려지는 도형이 달라질 수 있다.
 * 
 * @author 조성혁
 */
public class TurtleDrive8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double SIZE = 0.2;	// 이동 거리
		final int N = 5;			// 다각형
		final int HOW_MANY = 30;		// 일시 정지 시간. milisecond 단위

		// 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
		// (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
		// 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
		// 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.

		Turtle turtle  = new Turtle(0.5, 0.5, 0);	// (x, y, theta)

		for(int i=0; i<=HOW_MANY; i++) {
			drawNgon(turtle,N,SIZE);
			turtle.turnLeft(360/HOW_MANY);
		}
		turtle.pause(1000);

		input.close();
	}

	/**
	 * 거북이의 현재 위치에 정다각형을 그린다.
	 * 거북이가 현재 바라보고 있는 방향으로 우선 직진하여 한 변을 그리고
	 * 왼족으로 돌면서 나머지 변을 그린다.
	 * @param t 거북이
	 * @param n	몇각형을 그릴 것인가?
	 * @param size 다각형의 변 길이
	 */
	public static void drawNgon(Turtle t, int n, double size) {

		final double STEP = size;	// 이동 거리
		final int ANGLE = 360/n;	// 회전 각도
		final int PAUSE = 100;		// 일시 정지 시간. milisecond 단위

		for(int j=0; j<n; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}

}
