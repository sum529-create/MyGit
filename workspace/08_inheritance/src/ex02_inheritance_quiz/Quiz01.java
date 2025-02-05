package ex02_inheritance_quiz;

// 슈퍼클래스
class Owner{
	String name = "없음";
	
	Owner(String name){
		this.name = name;
	}
	Owner(){
		
	}
}

// 서브클래스
class Cat extends Owner{
	String catName;
	
	Cat(String catName, String name){
		super(name);
		this.catName = catName;
	}

	Cat(String catName) {
		super();	// 생략가능
		this.catName = catName;
	}

	void info(){
		System.out.println("이름 : " + catName + " (주인 : " + name + ")");
	}
}


public class Quiz01 {

	public static void main(String[] args) {
		
		// 서브 클래스
		Cat cat1 = new Cat("야옹이", "제임스");
		cat1.info();	// 이름 : 야옹이 (주인 : 제임스)

		Cat cat2 = new Cat("냥냥이");
		cat2.info();	// 이름 : 냥냥이 (주인 : 없음)
	}

}
