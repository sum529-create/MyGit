package ex01_upcasting;

// 슈퍼클래스
class Elec{
	
	// field
	private int watt;
	
	// constructor
	public Elec(int watt) {
		this.watt = watt;
	}
	public Elec() {}
	
	// method
	public void info() {
		System.out.println("소비전력 : " + watt + "w");
	}
	
}

// 서브 클래스
class TV extends Elec{
	
	// field
	private int size;
	
	// constructor
	public TV(int size, int watt) {
		super(watt);
		this.size = size;
	}
	
	// method
	@Override
	public void info() {
		System.out.println("크기 : " + size + "인치");
		super.info(); 	// Elec의 info메소드
	}
	
}

public class Ex01_Elec {

	public static void main(String[] args) {
		
		// 서브클래스 객체 생성
	// 어제까지는
		TV tv = new TV(100, 50);
		tv.info();
				
		
		// upcasting
		// 1. 서브 클래스 객체는 슈퍼클래스 타입으로 저장이 가능하다.
		// 2. 강제 변환이 아니라 자동으로 변환된다.
		
		Elec elec = new TV(100, 50);	// 관리가 쉽다는 장점!
		elec.info(); 	// 호출할 때 Elec의 info()를 호출하는 것으로 보이지만
						// 실제로는 new TV()로 생성된 객체이기 때문에
						// TV의 info가 호출된다.
		
	}

}
