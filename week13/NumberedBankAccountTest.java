package w13_2277;

/**
 * NumberedBankAccount Ŭ���� �׽�Ʈ
 * @author ������
 */
public class NumberedBankAccountTest {

	public static void main(String[] args) {

		//���� ����
		NumberedBankAccount account1 = new NumberedBankAccount(1000.0);
		NumberedBankAccount account2 = new NumberedBankAccount();

		System.out.println(account1);
		System.out.println(account2);

		double send = 300.0;	//300�� �۱�
		account1.transfer(send, account2);
		System.out.println(send + "�� ������ü: account1 --> account2" );

		System.out.println(account1);
		System.out.println(account2);
	}

}
