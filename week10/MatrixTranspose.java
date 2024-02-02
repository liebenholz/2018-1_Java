package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * �־��� ���(matrix)�� ��ġ���(transpose matrix)�� ���Ѵ�.
 * @author ������
 *
 */
public class MatrixTranspose {

	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(new File("integers15.txt"));

		int [][] matrix = new int[3][5];
		int [][] tMatrix = new int[5][3];

		//���Ϸκ��� �������� �о� ������ �迭�� �����Ѵ�.
		for (int mRow = 0; mRow<3; mRow++){
			for (int mCol = 0; mCol<5; mCol++) {
				matrix[mRow][mCol] = input.nextInt();		
			}
		}

		//������ �迭�� ����Ѵ�.
		System.out.println("������ ���");
		printMatrix(matrix, 3, 5);
		System.out.println();


		//��ġ����� ���Ѵ�.
		for (int tCol = 0; tCol<3; tCol++){
			for (int tRow = 0; tRow<5; tRow++) {
				tMatrix[tRow][tCol] = matrix[tCol][tRow];
			}
		}		

		//��ġ����� ����Ѵ�.
		System.out.println("��ġ���");
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
