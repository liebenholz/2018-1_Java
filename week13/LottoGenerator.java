package w13_2277;

import java.util.Random;

/**
 * 로또 복권에 적을 여섯 개의 정수를 만들어주는 클래스
 * @author 조성혁
 */
public class LottoGenerator {

	private Random random;	//필드

	public LottoGenerator() {
		//Random 인스턴스를 하나 구성하고
		//random이 Random 인스턴스를 가리키게 함
		//LottoGenerator가 난수를 발생시킬 때
		//이 Random 인스턴스를 이용함
		random = new Random();
	}

	/**
	 * 로또 복권에 적을 수 6개 생성
	 * @return 6개의 정수가 들어있는 정수 배열
	 */
	public int[] generateNumbers() {

		//정수 배열을 가리키는 참조 변수 선언
		//6개의 방을 가지는 정수 배열을 구성
		int[] numbers = new int [6];

		//6개의 방에 각각 50 미만의 정수 난수를 저장
		for (int i=0; i<6; i++) {
			numbers[i] = random.nextInt(50);
		}
		return numbers;
	}

}