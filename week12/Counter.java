package w12_2277;

public class Counter {

	private int count = 0;
	public final int MAX = 10;

	/**
	 * count 값을 증가시킨다.
	 * MAX를 초과하면 0으로 돌아간다.
	 */
	public void tick() {
		if (count >= MAX)
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
		if (number > MAX)
			return false;
		return true;
	}
	
	/**
	 * Counter 테스트하는 메인 메소드.
	 * @author 조성혁 
	 */
	public static void main(String[] args) {

		Counter counter = new Counter();
		counter.setCount(8);

		counter.tick();
		System.out.println("카운트값 = " + counter.getCount());
		counter.tick();
		System.out.println("카운트값 = " + counter.getCount());
		counter.tick();
		System.out.println("카운트값 = " + counter.getCount());
		counter.tick();
		System.out.println("카운트값 = " + counter.getCount());
		System.out.println();

		counter.setCount(12);
		System.out.println("카운터에 12를 설정하려고 시도함.");
		System.out.println("카운트값 = " + counter.getCount());

		counter.setCount(5);
		System.out.println("카운터에 5를 설정함.");
		System.out.println("카운트값 = " + counter.getCount());
	}
	
}