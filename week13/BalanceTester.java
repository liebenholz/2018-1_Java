package w13_2277;

/**
 * ���ڿ��� ��ȣ ����/������ ¦�� �´��� ���θ� �˻����� ���α׷�
 * "(1+(2+3))"�� ¦�� ����
 * "(1+(2+3)"�� ¦�� ���� ����
 * @author ������
 *
 */
public class BalanceTester {

	String str;
	Counter counter;
	
	/**
	 * ������
	 * @param s �˻��� ���ڿ�
	 */
	public BalanceTester(String s) {
		this.str = s;
		counter = new Counter();
	}
	
	/**
	 * str�� ��ȣ ¦�� �´��� �˻��Ѵ�.
	 * @return true, ¦�� �´� ���
	 * 		   false, ¦�� ���� �ʴ� ���
	 */
	public boolean balanced() {
		
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '(') {
				counter.countUp();
			}
			else if(str.charAt(i) == ')') {
				counter.countDown();
			}
			
			if(counter.getValue() < 0) {
				return false;
			}
		}
		int count = counter.getValue();
		
		if(count == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
