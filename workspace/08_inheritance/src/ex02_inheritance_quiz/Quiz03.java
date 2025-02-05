package ex02_inheritance_quiz;

// 슈퍼클래스
class Elec{		// 전자제품
	// field
	int watt;	// 소비전력
	
	Elec(int watt){
		this.watt = watt;
	}
	
	void info() {
		System.out.print("소비전력 : " + watt + "w");
	}
}

class Computer extends Elec{
	String model;
	int price;
	
	Computer(String model, int price, int watt){
		super(watt);
		this.model = model;
		this.price = price;
	}
	
	Computer(String model, int price, int battery, int watt) {
		super(watt);
		this.model = model;
		this.price = price;
	}

	@Override
	void info() {
		System.out.print("모델 : " + model + ", 가격 : " + price + "만원, ");
		super.info();
	}
}

class Notebook extends Computer{
	int battery;
	
	Notebook(String model, int price, int battery, int watt){
		super(model, price, watt);
		this.battery = battery;
	}
	
	@Override
	void info() {
		System.out.print("\n배터리용량 : " + battery);
		super.info();
	}
	
}

public class Quiz03 {

	public static void main(String[] args) {
		
		Computer com = new Computer("알라딘", 200, 500);	// 이름, 가격, 소비전력
		com.info();		// 모델 : 알라딘, 가격 : 200만원, 소비전력 : 500w
		
		Notebook note = new Notebook("gram", 150, 80, 400);	
		note.info();	//  배터리용량 : 80w, 모델 : gram, 가격 : 150만원, 소비전력 : 400w

	}

}
