package w13_2277;

/**
 * BalanceTester ½Ã¹Ä·¹ÀÌ¼Ç
 * @author Á¶¼ºÇõ
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
				System.out.println("´Â °ýÈ£°¡ Â¦ÀÌ ¸Â½À´Ï´Ù.");
			}
			else {
				System.out.println("´Â °ýÈ£°¡ Â¦ÀÌ ¸ÂÁö ¾Ê½À´Ï´Ù.");				
			}
		}
	}
}

