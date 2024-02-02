package w13_2277;

/**
 * LottoGenerator를 이용해서 로또 10장 뽑는 프로그램
 * @author 조성혁
 */
public class LottoGeneratorTest {

	public static void main(String[] args) {

		int[] numbers;	//정수 배열을 가리키는 데 사용할 참조변수

		//LorroGenerator 인스턴스 구성
		LottoGenerator generator = new LottoGenerator();

		//6개의 숫자로 이루어진 로또 번호 10개 생성
		for (int n=0; n<10; n++) {
			//LottoGenerator에게 로또 번호 6개를 만들 것을 지시함
			numbers = generator.generateNumbers();

			//6개의 숫자를 화면에 출력
			for (int i=0; i<6; i++) {
				System.out.print(numbers[i] + " ");
			}
			System.out.println();
		}

	}

}
