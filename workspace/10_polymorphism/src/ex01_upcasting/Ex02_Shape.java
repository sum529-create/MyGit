package ex01_upcasting;

// 슈퍼 클래스 : 도헝
class Shape{
	
	// field
	private String name;	// 원, 삼각형, 사각형, 마름모 ...


	// constructor
	public Shape(String name) {
		super();
		this.name = name;
	}


	// method
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public double getArea() {
		return 0;
	}
	
	
}

// 서브클래스 : 원
class Circle extends Shape{
	
	// field
	private double r;

	// constructor
	public Circle(String name, double r) {
		super(name);
		this.r = r;
	}
	
	// method
	@Override
	public double getArea() {
		return Math.PI * Math.pow(r, 2); 
	}
}

// 서브 클래스 : 사각형
class Rect extends Shape{
	
	// field
	private int width;	// 너비
	private int height;	// 높이

	
	// constructor
	public Rect(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}
	
	// method
	@Override
	public double getArea() {
		return width * height;
	}
	
}

public class Ex02_Shape {

	public static void main(String[] args) {
		
		// circle하고 rect를 한곳에 모아 두고 싶다.
		
		Shape[] shapeList = new Shape[5];	// 5개의 shape을 저장할 수 있다.
		
		shapeList[0] = new Circle("구슬", 0.5);
		shapeList[1] = new Rect("색종이", 12, 12);
		shapeList[2] = new Circle("피자", 100);
		shapeList[3] = new Circle("도넛", 10.5);
		shapeList[4] = new Rect("스케치북", 100, 150);
		
		for(Shape shape : shapeList) {
			System.out.println(shape.getName() + "의 크기 : " + shape.getArea());
		}
		

	}

}
