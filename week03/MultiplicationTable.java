package w3_2277;

public class MultiplicationTable {

	public static void main(String[] args) {

		for (int a=1; a<=9; a++) {
			for (int b=1; b<=9; b++) {
				System.out.print(a + "x" + b + "=" + a*b + "\t");
			}
			System.out.println();
		}
	}

}
