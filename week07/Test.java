package w7_2277;

class Test {

	public static void main(String[] args) {

		Cat c1 = new Cat();	// ù��° ����� �ν��Ͻ� ����
		Cat c2 = new Cat();	// �� ��° ����� �ν��Ͻ� ����
		c1.yaong();			// ù ����̿��� ���� ��Ŵ
		c1.groom(); 		// ù ����̿��� ���� ��Ŵ
		c2.yaong();			// �� ��° ����̿��� ���� ��Ŵ
		c2.groom(); 		// �� ��° ����̿��� ���� ��Ŵ

	}

}
