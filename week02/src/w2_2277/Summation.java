package w2_2277;

public class Summation {

	public static void main(String[] args) {

		int sum = 0;
		int i;

		//for ���
		for (i=1; i<=100; i++)
			sum = sum+i;
		System.out.println("for �̿�: 1���� 100������ �� = " + sum);

		//while ���
		sum=0;
		i=1; 
		while (i<=100) {
			sum = sum+i;
			i++;
		}
		System.out.println("while �̿�: 1���� 100������ �� = " + sum);
	}

}