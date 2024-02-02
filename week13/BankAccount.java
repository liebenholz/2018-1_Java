package w13_2277;

/**
 * 은행 계좌 만드는 프로그램
 * 입출금 및 잔액 확인을 할 수 있다
 * @author 조성혁
 */
public class BankAccount {
	private double balance;	//필드, 잔액

	/**
	 * 잔액이 0.0인 계좌 생성
	 */
	public BankAccount() {
		balance = 0.0;
	}

	/**
	 * 주어진 금액을 초기 잔액으로 갖는 계좌를 구성
	 * @param initialBalance 초기 잔액
	 */
	public BankAccount(double initialBalance) {
		balance = initialBalance;
	}

	/**
	 * 계좌 입금
	 * @param amount 입금액
	 */
	public void deposit(double amount) {
		balance += amount;
	}

	/**
	 * 계좌 출금
	 * @param amount 출금액
	 */
	public void withdraw(double amount) {
		balance -= amount;
	}

	/**
	 * 잔액 확인
	 * @return 잔액
	 */
	public double getBalance() {
		return balance;
	}
}
