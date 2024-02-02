package w4_2277;

import java.util.Scanner;

/**
 * 키보드로부터 양수들을 받아들여 이 수들의 평균을 구하는 프로그램
 * 소수점 두 자리까지 출력하고, 양수가 아닌 수가 입력되면 입력을 마친다.
 * 정수도 입력할 수 있고, 소수도 입력이 가능하다.
 * 양수가 하나도 입력되지 않으면 "양수가 하나도 입력되지 않았습니다."라고 출력한다.
 * 
 * @author 조성혁
 *
 */
public class Average {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	

		double in;				//입력하는 수
		double sum = 0.0;		//지금까지 입력한 양수의 합
		int count = 0;			//지금까지 입력한 양수의 개수
		boolean done = false;	

		System.out.println("양수들의 평균을 구하는 프로그램입니다.");
		System.out.println("입력을 마치려면 0 이하의 수를 입력하시오.");

		while (!done) {			//done이 true가 될 때까지 반복
			System.out.print("숫자를 입력하시오: ");
			in = input.nextDouble();	//수 입력
			if (in>0) {
				sum = sum + in;			//양수가 입력되면 양수의 합을 담는 변수에 더하기
				count++;				//입력한 양수의 개수에 +1
			}
			else						//입력된 수가 양수가 아니면
				done = true;			//done을 true로 바꾸고 반복 종료
		}

		if (count>0)					//입력된 수 중에 양수가 하나 이상 존재하면
			System.out.printf("평균 = %.2f\n",(double) sum/count);	//평균을 소수점 2자리로 표현

		else							//입력된 수 중에 양수가 하나도 없으면
			System.out.println("양수가 하나도 입력되지 않았습니다.");			//이 문구 출력

		input.close();
	}

}
