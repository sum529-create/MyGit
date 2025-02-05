package ex02_interface;

class Pet{
	// field
	private String name;

	// constructor
	public Pet(String name) {
		super();
		this.name = name;
	}

	// method
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void feed(String food) {
		System.out.println("먹는다.");
	}
	
}

interface Walkable{
	// 산책할 수 있는 pet들은 Walkable 인터페이스를 구현시키자.
	// Walkable 인터페이스를 구현한 Pet들은 타입이 2개가 된다.
	// 1. Pet
	// 2. Walkable
	
	// Walkable 인터페이스를 구현하지 않은 Pet들은 타입이 1개가 된다.
	// 1. Pet
}

class Dog extends Pet implements Walkable{	// 산책할 수 있으면 Walkable 인터페이스 구현하기
	
	// constructor
	public Dog(String name) {
		super(name);
	}
}

class Turtle extends Pet{		// 산책할 수 없으면 그냥 두기
	// constructor
	public Turtle(String name) {
		super(name);
	}
}

class Person {
	// method
	public void feed() {
		
	}

	public void feed(Pet pet, String food) {
		pet.feed(food);
		
	}

	public void walkingWithPet(Walkable pet) {
		
		System.out.println(((Pet)pet).getName() + "랑 산책하기");
	}
}


public class Ex04_Walkable {

	public static void main(String[] args) {
		
		Person p = new Person();
		Dog dog = new Dog("코야");
		Turtle turtle = new Turtle("꼬부기");
		p.feed(dog, "닭가슴살");
		p.feed(turtle, "참치");
		
		p.walkingWithPet(dog);	// 코야랑 산책하기
//		p.walkingWithPet(turtle);	// 실행이 되지 않도록 처리
		
		
	}

}
