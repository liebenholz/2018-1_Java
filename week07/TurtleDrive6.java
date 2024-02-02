package w7_2277;

import java.util.Scanner;

/**
 * 거북이로 정다각형들을 그리는 프로그램.
 * drawNgon 메소드를 사용하여 네 개의 정다각형을 2*2 행렬과 같이 배열한다.
 * 아래 코드에서는 정사각형 네 개를 그린다.
 * 
 * @author 조성혁
 */
public class TurtleDrive6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		final double STEP = 0.2;	// 이동 거리

		// 생성자를 실행하여 거북이 인스턴스를 하나 생성한다.
		// (x, y)는 거북이의 초기 위치이며 theta는 거북이가 초기에 향하고 있는 방향이다.
		// 방향은 각도 단위이며 오른쪽이0도이고 위가 90도이다.
		// 평면의 왼쪽 아래 모서리 좌표는 (0.0, 0.0), 오른쪽 위 모서리 좌표는 (1.0, 1.0)이다.

		Turtle turtle  = new Turtle(0.5, 0.3, 0);	// (x, y, theta)

		int n = 4;			//몇 각형을 그릴 것인가? 사각형을 그린다.
		double size = 0.2;	//다각형의 변의 길이는 얼마로 할 것인가? 0.2로 한다.

		for(int i=0; i<4; i++) {
			drawNgon(turtle,n,size);
			turtle.goForward(STEP);
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
		final int PAUSE = 1000;		// 일시 정지 시간. milisecond 단위

		for(int j=0; j<=4; j++) {
			t.pause(PAUSE);
			t.goForward(STEP);
			t.turnLeft(ANGLE);
		}

	}

}
