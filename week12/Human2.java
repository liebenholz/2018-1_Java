package w12_2277;

public class Human2 {
	
	private String name;
	private int age;
	
	//구성자
	public Human2() {  }	
	public Human2(String n, int a) {
		name = n;
		age = a;
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
	 * 사람 이름과 나이를 알려주는 문장을 출력하는 메소드
	 */
	public String toString() {
		return "Human2[name=" + name + ",age=" + age + "]";
	}
	
	public static void main(String[] args) {

		Human2 human1 = new Human2("썸남", 19);
		Human2 human2 = new Human2("썸녀", 20);

		System.out.println(human1);
		System.out.println(human2); 
	}
}

