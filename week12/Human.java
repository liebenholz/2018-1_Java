package w12_2277;

public class Human {
	
	//필드
	private String name;
	private int age;

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
		return "Human[name=" + name + ",age=" + age + "]";
	}
	
	public static void main(String[] args) {

		Human human1 = new Human();
		Human human2 = new Human();

		human1.setName("썸남");
		human1.setAge(19);
		
		human2.setName("썸녀");
		human2.setAge(20);

		System.out.println(human1);
		System.out.println(human2); 
	}
}
