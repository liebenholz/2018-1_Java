package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 주어진 행렬(matrix)의 전치행렬(transpose matrix)을 구한다.
 * @author 조성혁
 *
 */
public class MatrixTranspose {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(new File("integers15.txt"));

		int [][] matrix = new int[3][5];
		int [][] tMatrix = new int[5][3];

		//파일로부터 정수들을 읽어 이차원 배열에 저장한다.
		for (int mRow = 0; mRow<3; mRow++){
			for (int mCol = 0; mCol<5; mCol++) {
				matrix[mRow][mCol] = input.nextInt();		
			}
		}

		//이차원 배열을 출력한다.
		System.out.println("원래의 행렬");
		printMatrix(matrix, 3, 5);
		System.out.println();


		//전치행렬을 구한다.
		for (int tCol = 0; tCol<3; tCol++){
			for (int tRow = 0; tRow<5; tRow++) {
				tMatrix[tRow][tCol] = matrix[tCol][tRow];
			}
		}		

		//전치행렬을 출력한다.
		System.out.println("전치행렬");
		printMatrix(tMatrix, 5, 3);
		System.out.println();

		input.close();

	}

	public static void printMatrix(int[][] array, int rows, int cols) {
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<cols; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
