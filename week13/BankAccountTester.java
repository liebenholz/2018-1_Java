package w13_2277;

/**
 * BankAccount Ŭ���� �׽�Ʈ
 * @author ������
 */
public class BankAccountTester {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(1000.0);

		account1.deposit(500.0);
		account2.deposit(500.0);

		account1.withdraw(100.0);
		account2.withdraw(100.0);

		System.out.println("ù ���� �ܾ� �����: 400.0");
		System.out.println("ù ���� �ܾ�: " + account1.getBalance());

		System.out.println("�ι�° ���� �ܾ� �����: 1400.0");
		System.out.println("�ι�° ���� �ܾ�: " + account2.getBalance());

	}

}
