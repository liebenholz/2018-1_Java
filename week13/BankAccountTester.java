package w13_2277;

/**
 * BankAccount 클래스 테스트
 * @author 조성혁
 */
public class BankAccountTester {

	public static void main(String[] args) {

		BankAccount account1 = new BankAccount();
		BankAccount account2 = new BankAccount(1000.0);

		account1.deposit(500.0);
		account2.deposit(500.0);

		account1.withdraw(100.0);
		account2.withdraw(100.0);

		System.out.println("첫 계좌 잔액 예상액: 400.0");
		System.out.println("첫 계좌 잔액: " + account1.getBalance());

		System.out.println("두번째 계좌 잔액 예상액: 1400.0");
		System.out.println("두번째 계좌 잔액: " + account2.getBalance());

	}

}
