package w13_2277;

/**
 * 은행 계좌 만드는 프로그램
 * 입출금 및 잔액 확인을 할 수 있다
 * @author 조성혁
 */
public class NumberedBankAccount {

	private int accountNumber;	//필드, 계좌번호
	private double balance;	//필드, 잔액
	private static int nextAccountNumber = 100;	//스태틱 필드, 다음에 부여할 계좌번호

	/**
	 * 잔액이 0.0인 계좌 생성
	 */
	public NumberedBankAccount() {
		balance = 0.0;
		accountNumber = nextAccountNumber++;
	}

	/**
	 * 주어진 금액을 초기 잔액으로 갖는 계좌를 구성
	 * @param initialBalance 초기 잔액
	 */
	public NumberedBankAccount(double initialBalance) {
		balance = initialBalance;
		accountNumber = nextAccountNumber++;
	}

	/**
	 * 계좌번호 반환
	 * @return 계좌번호
	 */
	public int getAccountNumber() {
		return accountNumber;
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

	/**
	 * 해당 형식으로 계좌번호롸 잔액을 출력한다.
	 */
	public String toString() {
		return "NumberedBankAccount[accountNumber=" + getAccountNumber() + ", balance=" + getBalance()+"]";
	}

	/**
	 * 다른 계좌로 amount만큼 계좌이체한다(송금한다)
	 * @param amount
	 * @param other
	 */
	public void transfer(double amount, NumberedBankAccount other) {
		this.withdraw(amount);
		other.deposit(amount);
	}

}
