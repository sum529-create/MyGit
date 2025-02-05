package ex01_inheritance;

// has - a 관계
// 1. 상속 관계로 구현할 수 있다.
// 2. 대부분은 상속 말고, 포함 관계로 구현한다.

// Circle has a Coord
// 슈퍼클래스 : coord
// 서브클래스 : Circle

// 슈퍼클래스
class Coord{
	
	// field
	int x, y;
	
	// constructor
	
	
	// method
	void setCoord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void coordInfo() {
		System.out.println("[" + x + "," + y +"]");
	}
}


// 서브 클래스
class Circle extends Coord{
	
	// field
	double r;
	
	// constructor
	
	// method
	// Circle클래스는 Coord클래스의 메소드를 사용할 수 있다.
	void setCircle(int x, int y, double r) {
		setCoord(x, y);	// Coord클래스의 메소드이지만, 내 것처럼 사용할 수있다.
		this.r = r;
	}
	
	void circleInfo() {
		System.out.print("중심좌표 : ");
		coordInfo();
		System.out.println("반지름 : " + r);
	}
	
}

public class Ex03_has_a {

	public static void main(String[] args) {

		// 슈퍼클래스
		Coord c = new Coord();
		c.setCoord(1, 1);
		c.coordInfo();
		
		// 서브클래스
		Circle circle = new Circle();
		circle.setCircle(2, 2, 1.5);	// 실제로는 setCoord 메소드가 함께 호출된다.
		circle.circleInfo();			// 실제로는 coordInfo 메소드가 함께 호출된다.
		
	}

}
