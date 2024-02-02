package w12_2277;

public class Counter3 {

	//�ʵ�
	private int count = 0;
	private int max = 10;
	
	//������
	public Counter3() {  }
	public Counter3(int m) {
		max = m;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
	/**
	 * count ���� ������Ų��.
	 * MAX�� �ʰ��ϸ� 0���� ���ư���.
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
	 * count ���� ���� ��ȿ ���� ���� �ִ��� �˻�.
	 */
	private boolean isInputValid(int number) {
		if (number < 0)
			return false;
		if (number > max)
			return false;
		return true;
	}

	public static void main(String[] args) {

		Counter3 c12 = new Counter3(12);
		Counter3 c60 = new Counter3(60);

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

