package w7_2277;

public class StringTest {

	public static void main (String[] args) {

		String p = "A barking dog";		// new 연산자 생략(String 클래스만 생략 가능!)
		String s1, s2, s3, s4;	// 참조 변수

		System.out.println ("문자열의 길이 =" + p.length());

		s1 = p.concat (" never Bites!");	// 문자열 연결(concatenate)
		s2 = p.replace ('B', 'b');	// 문자 교체
		s3 = p.substring (2, 5);	// 부분 문자열 추출(2번 글자부터 5번 글자까지)
		s4 = p.toUpperCase();		// 대문자로 변환 

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
