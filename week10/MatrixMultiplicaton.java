package w10_2277;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * ����� ����
 * @author ������
 *
 */
public class MatrixMultiplicaton {

	public static void main(String[] args) throws IOException {
		
		Scanner input1 = new Scanner(new File("matrix1.txt"));
		Scanner input2 = new Scanner(new File("matrix2.txt"));		

		int [][] matrixA = new int[3][5];
		int [][] matrixB = new int[5][3];
		int [][] matrixC = new int[3][3];

		//���Ϸκ��� �����͸� �̾� ��� a�� ä���.
		for (int mRow = 0; mRow<3; mRow++){
			for (int mCol = 0; mCol<5; mCol++) {
				matrixA[mRow][mCol] = input1.nextInt();		
			}
		}

		//���Ϸκ��� �����͸� �̾� ��� b�� ä���.
		for (int tRow = 0; tRow<5; tRow++){
			for (int tCol = 0; tCol<3; tCol++) {
				matrixB[tRow][tCol] = input2.nextInt();
			}
		}		
		
		// c = ab�� ����Ѵ�.
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				for (int k = 0; k<5; k++) {
					matrixC[i][j] += matrixA[i][k] * matrixB[k][j];
				}
			}
		}
		
		//a, b, c ����� ���ʴ�� ����Ѵ�.
		System.out.println("A ���");
		printMatrix(matrixA, 3, 5);
		System.out.println();
		System.out.println("B ���");
		printMatrix(matrixB, 5, 3);
		System.out.println();
		System.out.println("c ���");
		printMatrix(matrixC, 3, 3);
		System.out.println();
		input1.close();
		input2.close();

	}

	public static void printMatrix(int[][] array, int rows, int cols) {
		for (int i = 0; i<rows; i++) {
			for (int j = 0; j<cols; j++)	{
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
