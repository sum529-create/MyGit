package ex01_oop;

// 좌표
class Coord {

	// field
	int x;
	int y;
	
	// constructor
	Coord(int x, int y) {
		this.x = x;
		this.y = y;
	}
	Coord(Coord coord1) {
		// 매개변수가 2개인 다른 생성자를 호출
		this(coord1.x, coord1.y);
	}

	
	// method
	public void info() {
		System.out.print("좌표 [" + x + ", " + y + "] ");
		
	}
}

// 원
class Circle{
	
	// field
	double r;
	Coord center;



	// constructor
	public Circle(double r) {
		// 매개변수가 3개인 다른 생성자를 호출
		this(1,1,r);
	}
	
	public Circle(int x, int y, double r) {
		this.r = r;
		// center의 생성이 필요하다. 언제나 객체 생성은 new로 처리한다.
		center = new Coord(x, y);
		// this.center.x = x;	NullPointerException 발생
		// this.center.y = y;	center가 null이라는 의미이다.
	}

	double getArea() {
		return Math.PI * Math.pow(r, 2);
	}
	
	// method
	public void info() {
		center.info();
		System.out.println(", 반지름 " + r + ", 크기 " + getArea());
	}
	
	
}

public class Ex02_Circle {

	public static void main(String[] args) {
		Coord coord1 = new Coord(3, 5);
		Coord coord2 = new Coord(coord1);
		
		coord1.info();		// 좌표 [3, 5]
		coord2.info();		// 좌표 [3, 5]
		
		Circle circle1 = new Circle(1.5);
		Circle circle2 = new Circle(33, 55, 1.5);
		
		System.out.println();
		
		circle1.info();		// 좌표 [1,1], 반지름 1.5, 크기 7.xxx
		circle2.info();		// 좌표 [33, 55],  반지름 1.5, 크기 7.xxx

	}

}
