package ex03_method;

/*
 * 메소드의 재귀 호출
 * 1. recursive call
 * 2. 메소드 내부에서 자신을 호출하는 것
 * 
 */

class Counter {
	// field
	int count;
	
	// method
	void countDown(int count){
		
		if(count == 0) {
			// 메소드 실행을 중지 한다.
			// 1. 결과타입이 없는 경우에 
			// 2. 방법
			//		return;
			return;
			
			
			// 시스템 종료 : System.exit(0);
		}
		System.out.println(count);
		countDown(count - 1);
	}
	
}



public class Ex06_recursive {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Counter count = new Counter();
		
		// 클래스(타입) : Counter
		// 객체 (변수)	: count;
		
		count.countDown(5);

	}

}
