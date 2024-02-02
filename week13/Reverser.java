package w13_2277;

/**
 * 문자열을 역전시키는 프로그램
 * @author 조성혁
 */
public class Reverser {

	private String s;
	public Reverser(String s) {
		this.s = s;
	}

	/**
	 * 문자열을 구성하는 글자들의 순서를 바꾼 새 문자열을 만들어준다
	 * @return 순서가 바뀐 새 문자열
	 */
	public String reverse() {
		StringBuilder s = new StringBuilder();
		for (int i=this.s.length()-1; i>=0; i--) {
			s.append(this.s.charAt(i));
		}
		return s.toString();
	}

	/**
	 * 문자열을 구성하는 글자들을 순서를 단어 단위로 바꾼 새 문자열을 만들어준다.
	 * @return 단어 단위로 바꾼 새 문자열
	 */
	public String reverseWords() {
		StringBuilder s = new StringBuilder();
		int space = 0;

		//단어 단위로 자르기
		for (int i=0; i<this.s.length(); i++) {
			if(this.s.charAt(i) == ' ') {
				space++;
			}
		}

		//역순으로 단어를 재배열
		for(int i = space; i >= 0; i--) {
			s.append(this.s.split(" ")[i]).append(' ');
		}
		return s.toString();	
	}

}
