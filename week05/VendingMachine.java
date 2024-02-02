package w5_2277;

import java.util.Scanner;

/**
 * 아이스크림, 커피, 음료 자판기 프로그램.
 * 연속적인 거래가 가능하다.
 * 메뉴를 보여주는 기능만 구현함.
 * 돈 계산 기능은 아직 없음
 * 
 * main 메소드 하나로 구현함.
 * @author 조성혁
 *
 */
public class VendingMachine {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int command = 0;		//명령 번호 선언
		int ice_cream = 0;
		int coffee = 0;
		int drink = 0;

		System.out.println("아이스크림, 커피, 음료를 파는 자판기입니다.");

		while (command!=4) {	//명령 번호가 4일때까지 아래를 반복

			System.out.println("어떤 종류를 원하십니까?");

			System.out.println("아이스크림:" + "\t" + "1");
			System.out.println("커피:" + "\t\t" + "2");
			System.out.println("음료:" + "\t\t" + "3");
			System.out.println("종료:" + "\t\t" + "4");

			System.out.print("번호 선택: ");
			command = input.nextInt();	//명령 번호 입력

			switch (command) {

			case 1 :			//아이스크림 메뉴
				System.out.println();
				System.out.println("무엇을 드시겠습니까?");
				System.out.println("바닐라 아이스크림(1000원):" + "\t" + "1");
				System.out.println("아몬드 아이스크림(1400원):" + "\t" + "2");
				System.out.println("딸기 아이스크림(1400원):" + "\t" + "3");
				System.out.println("호두 아이스크림(1400원):" + "\t" + "4");

				System.out.print("번호 선택: ");
				ice_cream = input.nextInt();

				if (ice_cream<=4 && ice_cream>=1)
					System.out.println(ice_cream + "선택, 감사합니다.");
				else
					System.out.println("올바르지 않은 번호입니다.");

				break;

			case 2 :			//커피 메뉴
				System.out.println();
				System.out.println("무엇을 드시겠습니까?");
				System.out.println("아메리칸(1000원):" + "\t" + "1");
				System.out.println("카페라떼(1400원):" + "\t" + "2");
				System.out.println("에스프레소(1400원):" + "\t" + "3");

				System.out.print("번호 선택: ");
				coffee = input.nextInt();

				if (coffee<=3 && coffee>=1)
					System.out.println(coffee + "선택, 감사합니다.");
				else
					System.out.println("올바르지 않은 번호입니다.");

				break;

			case 3 : 			//음료 메뉴
				System.out.println();
				System.out.println("무엇을 드시겠습니까?");
				System.out.println("생수(1000원):" + "\t" + "1");
				System.out.println("오렌지쥬스(1400원):" + "\t" + "2");
				System.out.println("망고쥬스(1400원):" + "\t" + "3");
				System.out.println("우유(1400원):" + "\t" + "4");

				System.out.print("번호 선택: ");
				drink = input.nextInt();

				if (drink<=4 && drink>=1)
					System.out.println(drink + "선택, 감사합니다.");
				else
					System.out.println("올바르지 않은 번호입니다.");

				break;

			case 4 :
				System.out.println("감사합니다 거래를 종료합니다.");			//종료
				break;

			default :
				System.out.println("올바르지 않은 번호입니다.");		//이외의 번호를 입력받으면 다음을 출력
				break;
			}

			System.out.println();
		}

		input.close();		
	}

}
