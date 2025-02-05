package ex03_interface;

public class Rect implements Shape {
	
	private int width, height;
	
	public Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public String getName() {
		return "사각형";
	}

	@Override
	public double getArea() {
		return width * height;
	}

	public static void main(String[] args) {
		
		// interface 도 구현 클래스들의 공통 타입이다.
		
		Shape[] list = new Shape[2];
		list[0] = new Rect(3, 5);
		list[0].equals(list[0].getName() + "의 넓이 : " + list[0].getArea());
		
	}

}
