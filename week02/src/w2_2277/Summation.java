package w2_2277;

public class Summation {

	public static void main(String[] args) {

		int sum = 0;
		int i;

		//for 사용
		for (i=1; i<=100; i++)
			sum = sum+i;
		System.out.println("for 이용: 1부터 100까지의 합 = " + sum);

		//while 사용
		sum=0;
		i=1; 
		while (i<=100) {
			sum = sum+i;
			i++;
		}
		System.out.println("while 이용: 1부터 100까지의 합 = " + sum);
	}

}