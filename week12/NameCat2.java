package w12_2277;

class NameCat2 {
	
	//�ʵ�
	private String name;
	private int age;
	
	//������
	public NameCat2() {  }
	public NameCat2(String n) {
		name = n;
	}
	public NameCat2(String n, int a) {
		name = n;
		age = a;
	}

	//�޼ҵ�
	public void eat() {
		System.out.println("�ȳ�!");
	}
	public void yaong() {
		System.out.println("�߿�");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * ����� �̸��� ���̸� �˷��ִ� ������ ����ϴ� �޼ҵ�
	 */
	public String toString() {
		return "NameCat2[name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		NameCat2 c1, c2, c3;	// ��������

		c1 = new NameCat2();			//1�� �����	
		c2 = new NameCat2("������");		//2�� �����
		c3 = new NameCat2("������", 19);	//3�� �����	

		c1.setName("�մ���");	
		c1.setAge(20); 
		
		c2.setAge(21);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
