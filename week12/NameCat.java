package w12_2277;

public class NameCat {

	private String name;	// �ʵ�
	void eat() { 
		System.out.println("�ȳ�!");
	}
	public void yaong() {
		System.out.println("�߿�");
	}
	public void setName(String n) { 
		name = n; 
	}
	public String getName() { 
		return name; 
	}

	public static void main(String[] args) {

		NameCat c1, c2;	// ��������

		c1 = new NameCat();	//1�� �����	
		c2 = new NameCat();	//2�� �����

		c1.setName("�մ���");	//1�� ����̴� �մ���
		c2.setName("�����"); //2�� ����̴� �����

		System.out.println(c1.getName());
		System.out.println(c2.getName()); 

	}

}
