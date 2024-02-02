package w13_2277;

import java.util.Scanner;

/**
 * 상태변수 value를 이용한 Counter 클래스의 구현
 * @author 조성혁
 */
public class Counter {

	private int value;	//필드

	/**
	 * 구성자
	 */
	public Counter() {
		value = 0;
	}

	/**
	 * 구성자
	 * @param n value의 초기값.
	 */
	public Counter(int n) {
		value = n;
	}

	/**
	 * value값 증가
	 */
	public void countUp() {
		value++;
	}

	/**
	 * value값 감소
	 */
	public void countDown() {
		value--;
	}

	/**
	 * value값 0으로 만듦
	 */
	public void clear() {
		value = 0;
	}

	/**
	 * 현재 value값 반환
	 * @return
	 */
	public int getValue() {
		return value;
	}

	public static void main(String[] args) {

		Counter count = new Counter();
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.println("0을 일벽하면 종료합니다.");
			System.out.print("정수를 입력하세요: ");
			int command = input.nextInt();

			if(command > 0) {
				count.countUp();
			}
			else if(command < 0) {
				count.countDown();
			}
			else {
				System.out.println(count.getValue());
				break;
			}
		}

		input.close();
	}
}

