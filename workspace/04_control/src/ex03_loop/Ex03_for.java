package ex03_loop;

public class Ex03_for {

	public static void main(String[] args) {
		
		/*
		 * for문
		 * 1. 반복되는 값의 범위가 명확할 때 사용
		 * 2. 주로 배열에서 사용
		 * 3. 형식
		 * 		for(초기값 ;조건식 ; 증감문){
		 * 			반복실행문;
		 * 		}
		 */
		
		// 변수의 스코프(scope)
		// 변수가 선언된 위치에서만 사용할 수 있다.
		// 위치의 기준은 중괄호{} 이다.
		
		// 1. 1 ~ 3
		for(int a = 1; a<= 3; a++) {
			System.out.println(a);
		}
		
		// 2. 3 ~ 1
		for(int b = 3; b>=1; b--) {
			System.out.println(b);
		}
		
		// 3. 반복 횟수 정하기
		int d = 5;
		for(int c = 1; c<=d; c++) {
			System.out.println("hi");
		}

	}

}
