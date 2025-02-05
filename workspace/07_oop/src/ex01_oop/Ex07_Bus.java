package ex01_oop;

class Driver{

	// field
	String name;
	
	public Driver(String name) {
		this.name = name;
	}
	
}
class Bus{
	// field
	Driver driver;
	int speed;
	final int FULL_SPEED = 80;
	
	public Bus(Driver driver) {
		this.driver = driver;
	}
	public void speedUp(int speed) {
		if(speed < 0) {
			return;
		}
		if(this.speed + speed <= FULL_SPEED) {
			this.speed += speed;
		}else {
			this.speed = FULL_SPEED;
		}
			System.out.println("현재 속도 " + this.speed + "km");
		
	}
	public void speedDown(int speed) {
		if(speed < 0) {
			return;
		}
		this.speed -= speed;
		if(this.speed < 0) {
			this.speed = 0;
		}
		System.out.println("현재 속도 " + this.speed + "km");
		
	}
}

public class Ex07_Bus {

	public static void main(String[] args) {

		Driver driver = new Driver("김기사");
		Bus bus = new Bus(driver);	// speed 는 0
		
		bus.speedUp(50);	// 현재 속도 50km
		bus.speedUp(50);	// 현재 속도 80km
		
		bus.speedDown(50);	// 현재 속도 30km
		bus.speedDown(50);	// 현재 속도 0km
		
		
		
	}

}
