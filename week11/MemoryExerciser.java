package w11_2277;

import java.util.Scanner;

/**
 * 사용자가 지정한 만큼의 무작위 숫자를 보여준 후
 * 1을 입력하면 화면을 위로 올려 숫자를 가린다.
 * 입력받은 숫자 중에서 몇 개가 맞았는지를 출력하는 프로그램.
 * 
 * @author 조성혁
 *
 */
public class MemoryExerciser {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] list;			//난수들을 저장할 배열
		int listlength;		//list의 크기
		
		System.out.print("몇 개의 정수들을 보시겠습니까? ");
		listlength = input.nextInt();
		list = new int[listlength];
		ArrayUtil.fillRandomDistinct(list, 100);	//1이상 100이하 서로 다른 난수를 배열에 채움
		
		for (int i=0; i<list.length; i++)
			System.out.println(list[i]);
		
		System.out.print("1을 입력하면 숫자를 감춥니다. ");
		input.nextInt();		//사용자가 1을 입력할 때까지 대기.
		for (int i=0; i<100; i++)
			System.out.println();	//화면을 위로 밀어올려 숫자가 보이지 않게 함

		System.out.println("어떤 숫자들이 있었는지 맞춰보시오.");
		System.out.println("입력을 끝내려면 음수를 입력하세요.");
		
		int[] answer = new int [100];
		int count = 0;
		int a;
		while ((a = input.nextInt())>= 0) {
			answer[count] = a;
			count++;
		}
		
		System.out.println(checkAnswers(list, answer, count) + "개 맞추었습니다.");
		
		input.close();
	}
	
	/**
	 * 사용자가 입력한 정수들이 list에 몇 개나 있는지 알아냄
	 * list에는 난수들이 꽉 차 있다.
	 * answer 배열에는 앞의 일부분에만 사용자가 입력한 답이 들어 있을 수 있다.
	 * 
	 * @param list 서로 다른 난수가 들어있는 배열
	 * @param answer 사용자가 입력한 정수들이 들어있는 배열
	 * @param answerNumber answer에 들어있는 정수 개수
	 * @return 사용자가 압력한 정수들이 list에 몇 개나 들어 있는지
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
