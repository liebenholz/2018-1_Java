package w13_2277;

/**
 * NumberedBankAccount 클래스 테스트
 * @author 조성혁
 */
public class NumberedBankAccountTest {

	public static void main(String[] args) {

		//계좌 생성
		NumberedBankAccount account1 = new NumberedBankAccount(1000.0);
		NumberedBankAccount account2 = new NumberedBankAccount();

		System.out.println(account1);
		System.out.println(account2);

		double send = 300.0;	//300원 송금
		account1.transfer(send, account2);
		System.out.println(send + "원 계좌이체: account1 --> account2" );

		System.out.println(account1);
		System.out.println(account2);
	}

}
