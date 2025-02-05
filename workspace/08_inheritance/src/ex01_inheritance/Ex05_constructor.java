package ex01_inheritance;

// 슈퍼클래스
class Father{
	
	// field
	String fName;
	
	// constructor
	Father(String fName) {
		this.fName = fName;
	}
	
	// method
}

// 서브 클래스
class Son extends Father{
	
	// field
	String sName;
	
	// constructor
	Son(String fName, String sName){
		// 반드시 슈퍼 클래스의 constructor를 호출해야 한다.
		super(fName);	// Father(String fName) { ... } 호출, 슈퍼 클래스의 constructor에 매개변수가 있다면 반드시 명시할 것
		this.sName = sName;
		
	}
	
	// method
	void sonInfo() {
		System.out.println("아빠이름 : " + fName);
		System.out.println("아들이름 : " + sName);
	}
}

public class Ex05_constructor {

	public static void main(String[] args) {
		
		Son boy = new Son("tom", "tomson");
		boy.sonInfo();

	}

}
