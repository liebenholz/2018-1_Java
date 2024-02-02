package w3_2277;

public class ThreeMultiples {

	public static void main(String[] args) {

		System.out.println("i룰 1씩 증가시키면서 i가 3의 배수일 때만 더하는 방식으로 계산");
		int sum = 0;
		int i;

		for	(i=0; i<=100; i++)
			if (i%3==0) 
				sum = sum + i;

		System.out.println("1이상 100이하의 3의 배수들의 합 = " + sum);

		System.out.println();

		System.out.println("i룰 3씩 증가시키면서 더하는 방식으로 계산");
		sum = 0;

		for (i=0; i<=100; i+=3)
			sum = sum + i;

		System.out.println("1이상 100이하의 3의 배수들의 합 = " + sum);

	}

}