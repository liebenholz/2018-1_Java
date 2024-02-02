package w5_2277;

/**
 * 섭씨 -40도부터 100도까지의 온도를 화씨 온도로 변환하고 결과를 출력하는 프로그램.
 * 
 * @author 조성혁
 *
 */
public class CelciusToFarenheit2 {

	public static void main(String[] args) {

		int c = -40;		//섭씨 -40도부터 시작

		while (c<=100) {	//섭씨 100도까지
			double farh = convert(c);
			System.out.println("C = " + c + " --> F = " + farh);
			c++;
		}

	}

	/**
	 * 섭씨 온도를 화씨 온도로 변환한다.
	 * @param c 섭씨온도
	 * @return 화씨 온도
	 */
	public static double convert(int c) {

		double f = c * 9.0 / 5.0 + 32.0;
		return f;
	}

}



