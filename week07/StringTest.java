package w7_2277;

public class StringTest {

	public static void main (String[] args) {

		String p = "A barking dog";		// new ������ ����(String Ŭ������ ���� ����!)
		String s1, s2, s3, s4;	// ���� ����

		System.out.println ("���ڿ��� ���� =" + p.length());

		s1 = p.concat (" never Bites!");	// ���ڿ� ����(concatenate)
		s2 = p.replace ('B', 'b');	// ���� ��ü
		s3 = p.substring (2, 5);	// �κ� ���ڿ� ����(2�� ���ں��� 5�� ���ڱ���)
		s4 = p.toUpperCase();		// �빮�ڷ� ��ȯ 

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
