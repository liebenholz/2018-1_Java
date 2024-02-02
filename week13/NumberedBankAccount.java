package w13_2277;

/**
 * ���� ���� ����� ���α׷�
 * ����� �� �ܾ� Ȯ���� �� �� �ִ�
 * @author ������
 */
public class NumberedBankAccount {

	private int accountNumber;	//�ʵ�, ���¹�ȣ
	private double balance;	//�ʵ�, �ܾ�
	private static int nextAccountNumber = 100;	//����ƽ �ʵ�, ������ �ο��� ���¹�ȣ

	/**
	 * �ܾ��� 0.0�� ���� ����
	 */
	public NumberedBankAccount() {
		balance = 0.0;
		accountNumber = nextAccountNumber++;
	}

	/**
	 * �־��� �ݾ��� �ʱ� �ܾ����� ���� ���¸� ����
	 * @param initialBalance �ʱ� �ܾ�
	 */
	public NumberedBankAccount(double initialBalance) {
		balance = initialBalance;
		accountNumber = nextAccountNumber++;
	}

	/**
	 * ���¹�ȣ ��ȯ
	 * @return ���¹�ȣ
	 */
	public int getAccountNumber() {
		return accountNumber;
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

	/**
	 * �ش� �������� ���¹�ȣ�� �ܾ��� ����Ѵ�.
	 */
	public String toString() {
		return "NumberedBankAccount[accountNumber=" + getAccountNumber() + ", balance=" + getBalance()+"]";
	}

	/**
	 * �ٸ� ���·� amount��ŭ ������ü�Ѵ�(�۱��Ѵ�)
	 * @param amount
	 * @param other
	 */
	public void transfer(double amount, NumberedBankAccount other) {
		this.withdraw(amount);
		other.deposit(amount);
	}

}
