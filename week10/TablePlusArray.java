package w10_2277;

import java.util.Scanner;

/**
 * ������ �迭�� ������ ä�� �� ���� �հ� ���� ��, �׸��� ������ ����ϴ� ���α׷�.
 * @author ������
 *
 */
public class TablePlusArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//����ڰ� ����� ũ��� ������ ������ �����Ѵ�.
		System.out.print("���� ��: ");
		int rows = input.nextInt();
		System.out.print("���� ��: ");
		int cols = input.nextInt();
		System.out.print("������ �ִ밪: ");
		int max = input.nextInt();
		
		int[][] table = new int[rows][cols];
		int[] rowSum = new int [rows];
		int[] colSum = new int [cols];
		int total;
		
		//�ʱ� �迭(0������ �̷���� �迭), ������ ����� �迭, ���μ��� ���� ���� �迭�� 
		//�޼ҵ带 ȣ���Ͽ� ����� ����Ѵ�.
		System.out.println("�ʱ� �迭");
		for(int row = 0; row < rows; row++) {
			display(table, row, cols);
			System.out.println();
		}
		
		System.out.println("������ ����� �迭");
		random(table, rows, cols, max);
		for(int row = 0; row < rows; row++) {
			display(table, row, cols);
			System.out.println();
		}
		
		System.out.println("����, ���� ���� ���� �迭");
		calculateRowSums(table, rows, cols, rowSum);
		calculateColSums(table, rows, cols, colSum);
		System.out.println();
		total = calculateTotal(rowSum);
		displayAll(table, rows, cols, rowSum, colSum, total);
		
		input.close();
	}
	
	/**
	 * ������ �迭 table�� ù row ��, ù cols ���� �ִ� ���ҵ���
	 * ǥ ���·� ����Ѵ�.
	 * ���� ���� : rows�� table�� �� �������� �۰ų� ����.
	 * ���� ���� : cols�� table�� �� �������� �۰ų� ����.
	 * @param table ������ ���� �迭
	 * @param rows ����� �� ��
	 * @param cols ����� �� ��
	 */
	public static void display(int[][] table, int rows, int cols) {
		for(int row = rows; row <= rows; row++) {
			for(int col = 0; col < cols; col++) {
				System.out.print(table[row][col] + "\t");
			}
		}
	}
	
	/**
	 * 2���� �迭 table�� ���� Ȥ�� �Ϻο� ������ ä���.
	 * ������ 0 �̻�, max "����" �����̾�� �Ѵ�.
	 * ���� ���� : rows�� table�� �� �������� �۰ų� ����.
	 * ���� ���� : cols�� table�� �� �������� �۰ų� ����.
	 * @param table �迭
	 * @param rows ������ ä�� �� ����
	 * @param cols ������ ä�� �� ����
	 * @param max ������ �ִ밪
	 */
	public static void random(int[][] table, int rows, int cols, int max) {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				table[row][col] = (int) (Math.random() * (max+1));
			}
		}
	}
	
	/**
	 * 2���� �迭 table�� ���� ���� ���� rowSum�� �����Ѵ�.
	 * table�� 0�� ���� ���� ���� rowSum[0]��,
	 * table�� 1�� ���� ���� ���� rowSum[1]��,
	 * ...
	 * table�� (rows-1)�� ���� ���� ���� rowSum[rows-1]�� �����Ѵ�.
	 * @param table 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� ��
	 * @param rowSum �� ���� ���� ���� ������ �迭
	 */
	public static void calculateRowSums(int[][] table, int rows, int cols, int[] rowSum) {
		int num = 0;
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				num += table[row][col];
			}
			rowSum[row] = num;
			num = 0;
		}
	}
	
	/**
	 * 2���� �迭 table�� ���� ���� ���� colSum�� �����Ѵ�.
	 * table�� 0�� ���� ���� ���� colSum[0]��,
	 * table�� 1�� ���� ���� ���� colSum[1]��,
	 * ...
	 * table�� (cols-1)�� ���� ���� ���� colSum[cols-1]�� �����Ѵ�.
	 * @param table 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� ��
	 * @param colSum �� ���� ���� ���� ������ �迭
	 */
	public static void calculateColSums(int[][] table, int rows, int cols, int[] colSum) {
		int num = 0;
		for(int col = 0; col < cols; col++) {
			for(int row = 0; row < rows; row++) {
				num += table[row][col];
			}
			colSum[col] = num;
			num = 0;
		}
	}
	
	/**
	 * 2���� �迭 table�� ���ҵ��� ������ ���Ѵ�.
	 * 2���� �迭�� ������ ������ ���� �յ��� ��� ���ؼ� ���� �� �ִ�.
	 * @param rowSum ���� �� �迭
	 * @return ����
	 */
	public static int calculateTotal(int[] rowSum) {
		int sum = 0;
		for(int i = 0; i < rowSum.length; i++) {
			sum += rowSum[i];
		}
		return sum;
	}
	
	/**
	 * ������ �����Ͱ� ��� �ִ� 2���� �迭, ���� �� �迭, ���� �� �迭, ������ ǥ ���·� ����Ѵ�.
	 * @param table ������ �����Ͱ� ��� �ִ� 2���� �迭
	 * @param rows table�� �� ��
	 * @param cols table�� �� ��
	 * @param rowSum ���� �� �迭
	 * @param colSuum ���� �� �迭
	 * @param total ����
	 */
	public static void displayAll(int[][] table, int rows, int cols, int[] rowSum, int[] colSum, int total) {
		for(int row = 0; row < rows; row++) {
			display(table, row, cols);
			System.out.print("|\t" + rowSum[row]);
			System.out.println();
		}
		System.out.println();
		
		for(int col = 0; col < cols; col++) {
			System.out.print(colSum[col] + "\t");
		}
		System.out.print("|\t" + total);
	}
}