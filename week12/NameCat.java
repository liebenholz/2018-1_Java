package w12_2277;

public class NameCat {

	private String name;	// 필드
	void eat() { 
		System.out.println("냠냠!");
	}
	public void yaong() {
		System.out.println("야옹");
	}
	public void setName(String n) { 
		name = n; 
	}
	public String getName() { 
		return name; 
	}

	public static void main(String[] args) {

		NameCat c1, c2;	// 지역변수

		c1 = new NameCat();	//1번 고양이	
		c2 = new NameCat();	//2번 고양이

		c1.setName("왕눈이");	//1번 고양이는 왕눈이
		c2.setName("방울이"); //2번 고양이는 방울이

		System.out.println(c1.getName());
		System.out.println(c2.getName()); 

	}

}
