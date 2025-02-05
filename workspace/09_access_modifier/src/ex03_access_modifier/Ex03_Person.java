package ex03_access_modifier;

class Person{
	
	// field
	private String name;
	private int age;
	private char gender;
	private double height;
	private boolean adult;
	
	// constructor
	public Person() {
		// 하는 일 없음	: new Person()을 호출할 수 있도록 만들어 둔다.
	}
	public Person(String name, int age, char gender, double height, boolean adult) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
		this.adult = adult;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
		setAdult(age >= 20);
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public double getHeight() {
		return height;
	}
	public boolean isAdult() {
		return adult;
	}
}

public class Ex03_Person {

	public static void main(String[] args) {
		// 1. 이름과 나이만 가진 Person
		Person person1 = new Person();
		person1.setName("제임스");
		person1.setAge(20);
		
		
		// 2. 모든 걸 가진 Person
		Person person2 = new Person("에밀리", 21, '여', 175.5, true);
		
		
		// 3. 모든 걸 가진 Person
		Person person3 = new Person();
		person3.setName("제임스");
		person3.setAge(20);
		person3.setGender('여');
		person3.setHeight(165.5);
		person3.setAdult(true);
		
		System.out.println(person1.getName());
		System.out.println(person1.getAge());
		
		System.out.println();
		
		System.out.println(person2.getName());
		System.out.println(person2.getAge());
		System.out.println(person2.getGender());
		System.out.println(person2.getHeight());
		System.out.println(person2.isAdult()? "성인" : "청소년");
		
		System.out.println();
		
		System.out.println(person3.getName());
		System.out.println(person3.getAge());
		System.out.println(person3.getGender());
		System.out.println(person3.getHeight());
		System.out.println(person3.isAdult()? "성인" : "청소년");
		
	}

}
