package w10_2277;

import java.util.Scanner;

/**
 * 이차원 배열에 난수를 채운 후 가로 합과 세로 합을 추가하여 출력하는 프로그램.
 * 이차원 배열 하나에 원래의 데이터와 가로 합, 세로 합, 총합을 모두 적어넣는 방식으로 작성됨.
 * @author 조성혁
 *
 */
public class Table {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("행의 수: ");
		int rows = input.nextInt()+1;
		System.out.print("열의 수: ");
		int cols = input.nextInt()+1;
		System.out.print("난수의 최대값: ");
		int max = input.nextInt();
		int[][] table = new int[rows][cols];
		
		//초기 배열(0만으로 이루어진 배열), 난수가 저장된 배열, 가로세로 합이 계산된 배열을 
		//메소드를 호출하여 만들고 출력한다.
		System.out.println("초기 배열");
		for(int row = 0; row < rows-1; row++) {
			display(table, row, cols-1);
			System.out.println();
		}
		
		System.out.println("난수가 저장된 배열");
		random(table, rows-1, cols-1, max);
		for(int row = 0; row < rows-1; row++) {
			display(table, row, cols-1);
			System.out.println();
		}

		System.out.println("가로, 세로 합이 계산된 배열");
		total(table);
		for(int row = 0; row < rows; row++) {
			display(table, row, cols);
			System.out.println();
		}
		
		input.close();
	}

	/**
	 * 이차원 배열 a의 첫 row행, 첫 cols열에 있는 원소들을 표 형태로 출력한다.
	 * 전제 조건 : rows는 a의 행 개수보다 작거나 같고, cols는 a의 열 개수보다 작거나 같다.
	 * @param a 이차원 정수 배열
	 * @param rows 출력할 행 수
	 * @param cols 출력할 열 수
	 */
	public static void display(int[][] a, int rows, int cols) {
		for(int row = rows; row <= rows; row++) {
			for(int col = 0; col < cols; col++) {
				System.out.print(a[row][col] + "\t");
			}
		}
	}
	
	/**
	 * 2차원 배열 a의 전부 혹은 일부에 난수를 채운다.
	 * 난수는 0 이상, max "이하" 정수이어야 한다.
	 * 전제 조건 : rows는 a의 행 개수보다 작거나 같다,
	 * 전제 조건 : cols는 a의 열 개수보다 작거나 같다.
	 * @param a 배열
	 * @param rows 난수를 채울 행 개수
	 * @param cols 난수를 채울 열 개수
	 * @param max 난수의 최대값
	 */
	public static void random(int[][] a, int rows, int cols, int max) {
		for(int row = 0; row < rows; row++) {
			for(int col = 0; col < cols; col++) {
				a[row][col] = (int)(Math.random()*(max+1));
			}
		}
	}
	
	/**
	 * 2차원 배열 a의 마지막 행과 마지막 열에 세로합과 가로합을 채운다.
	 * a의 마지막 행과 마지막 열을 제외한 나무지 셀들에 데이터가 들어있다.
	 * @param a 2차원 배열
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
