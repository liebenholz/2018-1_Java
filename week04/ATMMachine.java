package w4_2277;

import java.util.Scanner;

/**
 * ATM에서 작동하는 프로그램
 * 사용자의 계좌에 있는 초기금액은 5000원이다.
 * 잔액 확인은 1번, 현금 인출은 2번, 입금은 3번, 종료는 4번을 입력하면 된다.
 * 이외의 것을 입력하면 "올바르지 않은 번호입니다."를 출력한다.
 * 
 * 단, 인출하려는 금액이 잔고보다 클 때에는 인출을 취소한다.
 * 
 * @author 조성혁
 *
 */
public class ATMMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int money;				//입금 또는 인출하려는 돈
		double remain = 5000;	//잔고

		System.out.println("ATM 프로그램입니다. 번호를 입력하세요");
		System.out.println("잔액 확인:" + "\t" + "1");
		System.out.println("현금 인출:" + "\t" + "2");
		System.out.println("입금:" + "\t" + "3");
		System.out.println("종료:" + "\t" + "4");

		System.out.print("번호 선택: ");
		int command = input.nextInt();	//명령 번호 입력

		switch (command) {

		case 1 :
			System.out.println("잔액은 " + remain + "원입니다.");	//잔고 확인
			break;

		case 2 :
			System.out.print("금액은? ");
			money = input.nextInt();				//인출 금액 입력

			if (remain<money) 						//인출하려는 금액이 잔액보다 크면
				System.out.println("돈이 모자릅니다.");	//다음을 출력
			else {
				remain = remain - money;			//인출
				System.out.println("돈을 받으세요.");	
			}

			System.out.println("잔액은 " + remain + "원입니다.");		
			break;

		case 3 : 
			System.out.print("금액은? ");
			money = input.nextInt();				//입금 금액 입력

			remain = remain + money;				//입금
			System.out.println("잔액이 " + remain + "원이 되었습니다.");
			break;

		case 4 :
			System.out.println("감사합니다.");			//종료
			break;

		default :
			System.out.println("올바르지 않은 번호입니다.");		//이외의 번호를 입력받으면 다음을 출력
			break;
		}

		input.close();
	}

}
