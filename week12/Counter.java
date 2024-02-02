package w12_2277;

public class Counter {

	private int count = 0;
	public final int MAX = 10;

	/**
	 * count ���� ������Ų��.
	 * MAX�� �ʰ��ϸ� 0���� ���ư���.
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
	 * count ���� ���� ��ȿ ���� ���� �ִ��� �˻�.
	 */
	private boolean isInputValid(int number) {
		if (number < 0)
			return false;
		if (number > MAX)
			return false;
		return true;
	}
	
	/**
	 * Counter �׽�Ʈ�ϴ� ���� �޼ҵ�.
	 * @author ������ 
	 */
	public static void main(String[] args) {

		Counter counter = new Counter();
		counter.setCount(8);

		counter.tick();
		System.out.println("ī��Ʈ�� = " + counter.getCount());
		counter.tick();
		System.out.println("ī��Ʈ�� = " + counter.getCount());
		counter.tick();
		System.out.println("ī��Ʈ�� = " + counter.getCount());
		counter.tick();
		System.out.println("ī��Ʈ�� = " + counter.getCount());
		System.out.println();

		counter.setCount(12);
		System.out.println("ī���Ϳ� 12�� �����Ϸ��� �õ���.");
		System.out.println("ī��Ʈ�� = " + counter.getCount());

		counter.setCount(5);
		System.out.println("ī���Ϳ� 5�� ������.");
		System.out.println("ī��Ʈ�� = " + counter.getCount());
	}
	
}