package w12_2277;

class NameCat2 {
	
	//필드
	private String name;
	private int age;
	
	//구성자
	public NameCat2() {  }
	public NameCat2(String n) {
		name = n;
	}
	public NameCat2(String n, int a) {
		name = n;
		age = a;
	}

	//메소드
	public void eat() {
		System.out.println("냠냠!");
	}
	public void yaong() {
		System.out.println("야옹");
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
	 * 고양이 이름과 나이를 알려주는 문장을 출력하는 메소드
	 */
	public String toString() {
		return "NameCat2[name=" + name + ", age=" + age + "]";
	}
	
	public static void main(String[] args) {
		NameCat2 c1, c2, c3;	// 지역변수

		c1 = new NameCat2();			//1번 고양이	
		c2 = new NameCat2("갑순이");		//2번 고양이
		c3 = new NameCat2("갑돌이", 19);	//3번 고양이	

		c1.setName("왕눈이");	
		c1.setAge(20); 
		
		c2.setAge(21);

		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}
