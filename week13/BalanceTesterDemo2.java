package w13_2277;

/**
 * BalanceTester �ùķ��̼�
 * @author ������
 */
public class BalanceTesterDemo2 {

	public static void main(String[] args) {

		String[] strings = {"((hello)(goodbye))",
							"((a)(b)(())",
							"(a))b("};

		for(int i=0; i<strings.length; i++) {
			BalanceTester tester = new BalanceTester(strings[i]);
			System.out.print(strings[i]);

			if(tester.balanced()) {
				System.out.println("�� ��ȣ�� ¦�� �½��ϴ�.");
			}
			else {
				System.out.println("�� ��ȣ�� ¦�� ���� �ʽ��ϴ�.");				
			}
		}
	}
}

