package ex02_downcasting;

class Car{
	
	// field
	private String model;

	// constructor
	public Car(String model) {
		super();
		this.model = model;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public void drive() {
		System.out.println(model + "타고 드라이브 한다.");
	}
	
}

class EV extends Car{
	
	// field
	
	private int battery;

	public EV(String model, int battery) {
		super(model);
		this.battery = battery;
	}
	// method

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	public void charge(int battery) {
		this.battery += battery;
		System.out.println(getModel() + "의 배터리 : " + this.battery); 	// 모델명 확인 : getModel()
	}
}

class Hybrid extends EV{
	
	// field
	private int oil;
	private final int FULL_OIL = 60;	// 가득한 연료통 60

	// constructor
	public Hybrid(String model, int battery, int oil) {
		super(model, battery);
		this.oil = oil;
	}

	// method
	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}
	
	public void addOil(int oil) {
		this.oil += oil;
		if(this.oil > FULL_OIL) {
			this.oil = FULL_OIL;
		}
		System.out.println(getModel() + "의 현재 주유 : " + this.oil);
	}
	
}

public class Ex02_Car {

	public static void main(String[] args) {
		
		// Car 클래스타입의 배열 선언
		Car[] motors = new Car[2];
		
		motors[0] = new EV("코나", 80);
		motors[1] = new Hybrid("그랜저", 40, 60);

		// motors[0]의 모든 메소드 호출하기
		// motors[1]의 모든 메소드 호출하기
		for(Car car : motors) {
			car.drive();
			// 가장 아래 후손부터 확인한다. 
			if(car instanceof Hybrid) {
				((Hybrid)car).charge(10);
				((Hybrid)car).addOil(5);
			}else if(car instanceof EV) {
				((EV)car).charge(10);				
			}
			System.out.println(car.getModel() + " " + ((EV)car).getBattery());
		}
		
		
	}

}
