package w10_2277;

import java.util.Scanner;

/**
 * ������ �迭�� ������ ä�� �� ���� �հ� ���� ���� �߰��Ͽ� ����ϴ� ���α׷�.
 * ������ �迭 �ϳ��� ������ �����Ϳ� ���� ��, ���� ��, ������ ��� ����ִ� ������� �ۼ���.
 * @author ������
 *
 */
public class Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ��: ");
		int rows = input.nextInt()+1;
		System.out.print("���� ��: ");
		int cols = input.nextInt()+1;
		System.out.print("������ �ִ밪: ");
		int max = input.nextInt();
		int[][] table = new int[rows][cols];
		
		//�ʱ� �迭(0������ �̷���� �迭), ������ ����� �迭, ���μ��� ���� ���� �迭�� 
		//�޼ҵ带 ȣ���Ͽ� ����� ����Ѵ�.
		System.out.println("�ʱ� �迭");
		for(int row = 0; row < rows-1; row++) {
			display(table, row, cols-1);
			System.out.println();
		}
		
		System.out.println("������ ����� �迭");
		random(table, rows-1, cols-1, max);
		for(int row = 0; row < rows-1; row++) {
			display(table, row, cols-1);
			System.out.println();
		}

		System.out.println("����, ���� ���� ���� �迭");
		total(table);
		for(int row = 0; row < rows; row++) {
			display(table, row, cols);
			System.out.println();
		}
		
		input.close();
	}

	/**
	 * ������ �迭 a�� ù row��, ù cols���� �ִ� ���ҵ��� ǥ ���·� ����Ѵ�.
	 * ���� ���� : rows�� a�� �� �������� �۰ų� ����, cols�� a�� �� �������� �۰ų� ����.
	 * @param a ������ ���� �迭
	 * @param rows ����� �� ��
	 * @param cols ����� �� ��
	 */
	public static void display(int[][] a, int rows, int cols) {
		for(int row = rows; row <= rows; row++) {
			for(int col = 0; col < cols; col++) {
				System.out.print(a[row][col] + "\t");
			}
		}
	}
	
	/**
	 * 2���� �迭 a�� ���� Ȥ�� �Ϻο� ������ ä���.
	 * ������ 0 �̻�, max "����" �����̾�� �Ѵ�.
	 * ���� ���� : rows�� a�� �� �������� �۰ų� ����,
	 * ���� ���� : cols�� a�� �� �������� �۰ų� ����.
	 * @param a �迭
	 * @param rows ������ ä�� �� ����
	 * @param cols ������ ä�� �� ����
	 * @param max ������ �ִ밪
	 */
	public static void random(int[][] a, int rows, int cols, int max) {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				a[row][col] = (int)(Math.random()*(max+1));
			}
		}
	}
	
	/**
	 * 2���� �迭 a�� ������ ��� ������ ���� �����հ� �������� ä���.
	 * a�� ������ ��� ������ ���� ������ ������ ���鿡 �����Ͱ� ����ִ�.
	 * @param a 2���� �迭
	 */
	public static void total(int[][] a) {
		int num = 0;
		for(int row = 0; row < a.length; row++) {
			for(int col = 0; col < a[0].length; col++) {
				num += a[row][col];
			}
			a[row][a.length+1] = num;
			num = 0;
		}
		
		for(int col = 0; col < a[0].length; col++) {
			for(int row = 0; row < a.length; row++) {
				num += a[row][col];
			}
			a[a.length-1][col] = num;
			num = 0;
		}
	}
}
