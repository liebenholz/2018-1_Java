package w11_2277;

import java.util.Scanner;

/**
 * ����ڰ� ������ ��ŭ�� ������ ���ڸ� ������ ��
 * 1�� �Է��ϸ� ȭ���� ���� �÷� ���ڸ� ������.
 * �Է¹��� ���� �߿��� �� ���� �¾Ҵ����� ����ϴ� ���α׷�.
 * 
 * @author ������
 *
 */
public class MemoryExerciser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list;			//�������� ������ �迭
		int listlength;		//list�� ũ��
		
		System.out.print("�� ���� �������� ���ðڽ��ϱ�? ");
		listlength = input.nextInt();
		list = new int[listlength];
		ArrayUtil.fillRandomDistinct(list, 100);	//1�̻� 100���� ���� �ٸ� ������ �迭�� ä��
		
		for (int i=0; i<list.length; i++)
			System.out.println(list[i]);
		
		System.out.print("1�� �Է��ϸ� ���ڸ� ����ϴ�. ");
		input.nextInt();		//����ڰ� 1�� �Է��� ������ ���.
		for (int i=0; i<100; i++)
			System.out.println();	//ȭ���� ���� �о�÷� ���ڰ� ������ �ʰ� ��

		System.out.println("� ���ڵ��� �־����� ���纸�ÿ�.");
		System.out.println("�Է��� �������� ������ �Է��ϼ���.");
		
		int[] answer = new int [100];
		int count = 0;
		int a;
		while ((a = input.nextInt())>= 0) {
			answer[count] = a;
			count++;
		}
		
		System.out.println(checkAnswers(list, answer, count) + "�� ���߾����ϴ�.");
		
		input.close();
	}
	
	/**
	 * ����ڰ� �Է��� �������� list�� �� ���� �ִ��� �˾Ƴ�
	 * list���� �������� �� �� �ִ�.
	 * answer �迭���� ���� �Ϻκп��� ����ڰ� �Է��� ���� ��� ���� �� �ִ�.
	 * 
	 * @param list ���� �ٸ� ������ ����ִ� �迭
	 * @param answer ����ڰ� �Է��� �������� ����ִ� �迭
	 * @param answerNumber answer�� ����ִ� ���� ����
	 * @return ����ڰ� �з��� �������� list�� �� ���� ��� �ִ���
	 */
	public static int checkAnswers(int[] list, int[] answer, int answerNumber) {
		int count = 0;
		for (int i=0; i<answer.length; i++) {
			for (int j=0; j<list.length; j++) {
				if (answer[i] == list[j])
					count++;
			}
		}
		return count;
	}

}
