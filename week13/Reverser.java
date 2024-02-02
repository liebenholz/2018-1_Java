package w13_2277;

/**
 * ���ڿ��� ������Ű�� ���α׷�
 * @author ������
 */
public class Reverser {

	private String s;
	public Reverser(String s) {
		this.s = s;
	}

	/**
	 * ���ڿ��� �����ϴ� ���ڵ��� ������ �ٲ� �� ���ڿ��� ������ش�
	 * @return ������ �ٲ� �� ���ڿ�
	 */
	public String reverse() {
		StringBuilder s = new StringBuilder();
		for (int i=this.s.length()-1; i>=0; i--) {
			s.append(this.s.charAt(i));
		}
		return s.toString();
	}

	/**
	 * ���ڿ��� �����ϴ� ���ڵ��� ������ �ܾ� ������ �ٲ� �� ���ڿ��� ������ش�.
	 * @return �ܾ� ������ �ٲ� �� ���ڿ�
	 */
	public String reverseWords() {
		StringBuilder s = new StringBuilder();
		int space = 0;

		//�ܾ� ������ �ڸ���
		for (int i=0; i<this.s.length(); i++) {
			if(this.s.charAt(i) == ' ') {
				space++;
			}
		}

		//�������� �ܾ ��迭
		for(int i = space; i >= 0; i--) {
			s.append(this.s.split(" ")[i]).append(' ');
		}
		return s.toString();	
	}

}
