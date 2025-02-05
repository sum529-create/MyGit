package ex03_method;

// this : 객체 자신의 참조값
// 객체 -> 필드, 메소드

class computer{
	// field
	String model;
	String manufacturer;
	int price;
	
	// method
	// 1. setInfo()
	void setInfo(String model, String manufacturer, int price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	
	// 2. info
	void info() {
		System.out.println("모델명 : " + model);
		System.out.println("제조사 : " + manufacturer);
		System.out.println("가격 : " + price);
		
	}
	
}

public class Ex05_this {

	public static void main(String[] args) {
		computer cp = new computer();
		
		cp.setInfo("GRAM", "LG", 180); 		// tab 키를 사용하면 다음 블록으로 이동
		cp.info();
	}

}
