package w4_2277;

import java.util.Scanner;

/**
 * 정수 세 개를 입력받아 이들을 오름차순으로 작성하는 프로그램
 * 
 * @author 조성혁
 *
 */
public class Sorter {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("세 개의 정수를 입력하세요: ");

		int a = input.nextInt();	//정수 a 입력
		int b = input.nextInt();	//정수 b 입력
		int c = input.nextInt();	//정수 c 입력
		int storage;

		if (a>b) {					//a가 b보다 크면 위치 바꾸기 
			storage = a;
			a = b;
			b = storage;
		}
		if (a>c) {					//a가 c보다 크면 위치 바꾸기
			storage = a;
			a = c;
			c = storage;
		}
		if (b>c) {					//b가 c보다 크면 위치 바꾸기
			storage = b;
			b = c;
			c = storage;
		}

		System.out.println(a + " " + b + " " + c);		//위와 같은 과정을 거치면 a,b,c가 오름차순으로 정리됨. 이를 순서대로 출력.

		input.close();
	}

}
