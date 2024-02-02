package w13_2277;

/**
 * ���� ���� ����� ���α׷�
 * ����� �� �ܾ� Ȯ���� �� �� �ִ�
 * @author ������
 */
public class BankAccount {
	private double balance;	//�ʵ�, �ܾ�

	/**
	 * �ܾ��� 0.0�� ���� ����
	 */
	public BankAccount() {
		balance = 0.0;
	}

	/**
	 * �־��� �ݾ��� �ʱ� �ܾ����� ���� ���¸� ����
	 * @param initialBalance �ʱ� �ܾ�
	 */
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	/**
	 * ���� �Ա�
	 * @param amount �Աݾ�
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * ���� ���
	 * @param amount ��ݾ�
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * �ܾ� Ȯ��
	 * @return �ܾ�
	 */
	public double getBalance() {
		return balance;
	}
}
