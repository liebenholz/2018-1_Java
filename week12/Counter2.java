package w12_2277;

public class Counter2 {

	//필드
	private int count = 0;
	private int max = 10;

	public void setMax(int max) {
		this.max = max;
	}
	
	/**
	 * count 값을 증가시킨다.
	 * MAX를 초과하면 0으로 돌아간다.
	 */
	public void tick() {
		if (count >= max)
			count = 0;
		else count++;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int number) {
		if (isInputValid(number))
			count = number;
	}
	
	/*
	 * count 설정 값이 유효 범위 내에 있는지 검사.
	 */
	private boolean isInputValid(int number) {
		if (number < 0)
			return false;
		if (number > max)
			return false;
		return true;
	}

	/*
	 * Counter2 테스트
	 */
	public static void main(String[] args) {

		Counter2 c12 = new Counter2();
		Counter2 c60 = new Counter2();

		c12.setMax(12);
		c60.setMax(60);

		//c12에 count를 11로 선언
		c12.setCount(11);

		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		c12.tick();
		System.out.println(c12.getCount());
		System.out.println();

		//c60에 count를 59로 선언
		c60.setCount(59);

		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());
		c60.tick();
		System.out.println(c60.getCount());

	}

}
