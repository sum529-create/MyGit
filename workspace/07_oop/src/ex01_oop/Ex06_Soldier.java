package ex01_oop;

class Gun{
	// field
	String model;
	int bullet;		// 0 ~ FULL_BULLET
	final int FULL_BULLET = 6;
	
	// constructor
	
	public Gun(String model, int bullet) {
		this.model = model;
		this.bullet = bullet;
		
	}
	// method
	void reload(int bullet) {	// 장전
		if((this.bullet + bullet) <= FULL_BULLET) {
			this.bullet += bullet;
			System.out.println(bullet + "발 장전되었다. 현재" + this.bullet + "발");
			
		}else {
			int realBullet = FULL_BULLET - this.bullet;
			this.bullet = FULL_BULLET;
			System.out.println((realBullet) + "발 장전되었다. 현재" + this.bullet + "발");
			
			
		}
		
	}
	void shoot() {	// 쏘기
		if (this.bullet != 0) {
			System.out.println("빵야! " + --this.bullet + "발 남았다.");
		}else {
			System.out.println("헛빵!");
			System.out.println();
		}
	}
	void info() {
		System.out.println(model + "(" + bullet + ")");
	}
	
}

class Soldier{
	// field
	String name;
	Gun pistol;
	
	// constructor
	
	
	public Soldier(String name, Gun pistol) {
		this.name = name;
		this.pistol = pistol;
	}
	// method
	void reload(int bullet) {
		pistol.reload(bullet);
		
	}
	void shoot() {
		pistol.shoot();
	}
	void info() {
		System.out.print(name + " : ");
		pistol.info();
		
	}
	
}

public class Ex06_Soldier {

	public static void main(String[] args) {

		Gun gun = new Gun("K-2", 2);
		Soldier soldier = new Soldier("람보", gun);
		soldier.shoot(); 	// 빵야! 1발 남았다.
		soldier.shoot(); 	// 빵야! 0발 남았다.
		soldier.shoot(); 	// 헛빵!	
		
		soldier.reload(3); 	// 3발이 장전되었다. 현재 3발
		soldier.reload(6); 	// 3발이 장전되었다. 현재 6발
		soldier.reload(0); 	// 0발이 장전되었다. 현재 6발
		
		soldier.info();
				
	}

}
