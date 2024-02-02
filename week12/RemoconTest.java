package w12_2277;

import java.util.Scanner;

/**
 * 리모콘 테스트하는 프로그램.
 * @author 조성혁
 *
 */
public class RemoconTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);


		Remocon remote = new Remocon();
		int command = 1;

		while (command != 0) {

			remote.display();
			System.out.print("메뉴 번호를 입력하세요 : ");
			command = input.nextInt();

			switch(command) {
			case 1:
				remote.volumeUp(); break;
			case 2:
				remote.volumeDown(); break;
			case 3:
				remote.channelUp(); break;
			case 4:
				remote.channelDown(); break;
			case 0:
				System.out.println("시스템을 종료합니다."); break;
			default:
				System.out.println("잘못 입력하겼습니다."); break;
			}
			System.out.println();

		}

		input.close();
	}

}
