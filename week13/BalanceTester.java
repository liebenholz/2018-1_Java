package w13_2277;

/**
 * 문자열의 괄호 열림/닫힘의 짝이 맞는지 여부를 검사하응 프로그램
 * "(1+(2+3))"은 짝이 맞음
 * "(1+(2+3)"은 짝이 맞지 않음
 * @author 조성혁
 *
 */
public class BalanceTester {

	String str;
	Counter counter;
	
	/**
	 * 구성자
	 * @param s 검사할 문자열
	 */
	public BalanceTester(String s) {
		this.str = s;
		counter = new Counter();
	}
	
	/**
	 * str의 괄호 짝이 맞는지 검사한다.
	 * @return true, 짝이 맞는 경우
	 * 		   false, 짝이 맞지 않는 경우
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
