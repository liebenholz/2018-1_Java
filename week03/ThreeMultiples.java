package w3_2277;

public class ThreeMultiples {

	public static void main(String[] args) {

		System.out.println("i�� 1�� ������Ű�鼭 i�� 3�� ����� ���� ���ϴ� ������� ���");
		int sum = 0;
		int i;

		for	(i=0; i<=100; i++)
			if (i%3==0) 
				sum = sum + i;

		System.out.println("1�̻� 100������ 3�� ������� �� = " + sum);

		System.out.println();

		System.out.println("i�� 3�� ������Ű�鼭 ���ϴ� ������� ���");
		sum = 0;

		for (i=0; i<=100; i+=3)
			sum = sum + i;

		System.out.println("1�̻� 100������ 3�� ������� �� = " + sum);

	}

}