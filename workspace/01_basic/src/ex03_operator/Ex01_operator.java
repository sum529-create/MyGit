package ex03_operator;

public class Ex01_operator {

	public static void main(String[] args) {
		
		/*
		 * 1. 산술 연산자
		 * 		1) +
		 * 		2) -
		 * 		3) *
		 * 		4) / : 정수 (몫), 실수(나누기)
		 * 		5) % : 정수(나머지)
		 * 
		 * 2. 증감 연산자
		 * 		1) a++ : a를 사용하고 1 증감
		 * 		2) ++a : a를 증가시키고 사용
		 * 		3) a-- : a를 사용하고 1 감소
		 * 		4) --a : a를 감소시키고 사용
		 * 
		 * 3. 대입 연산자
		 * 		1) = : 오른쪽의 값을 왼쪽 변수에 대입
		 * 		2) += : 왼쪽 변수가 오른쪽 값 만큼 증가한다.
		 * 		3) -= : 왼쪽 변수가 오른쪽 값 만큼 감소한다.
		 * 		4) *= 
		 * 		5) /= 
		 * 		6) %= 
		 * 
		 *     * 주의
		 *     거꾸로 쓰기 불가
		 */
		
		int a = 7;
		int b = 2;
		
		// 라인 복사 : 커서를 두고 Ctrl + Alt + 방향키(↓)
		
		System.out.println(a+ "+" + b + "=" + (a+b));
		System.out.println(a+ "-" + b + "=" + (a-b));
		System.out.println(a+ "*" + b + "=" + (a*b));
		System.out.println(a+ "/" + b + "=" + (a/b));
		System.out.println(a+ "%" + b + "=" + (a%b));
		
		System.out.println("");
		
		int c =10;
		int d = c++;	// c를 d에 저장하고 c를 1증가시킨다.
		System.out.println(c);	// 11
		System.out.println(d);	// 10
		
		int e =10;
		int f = ++e;	// e를 d에 증가시키고 e를 f에 저장한다.
		System.out.println(e);	// 11
		System.out.println(f);	// 11
		
		System.out.println("");
		
		int piggy_bank = 0;
		piggy_bank += 1000;
		piggy_bank -= 500;
		
		// 자동 완성 ctrl + spacebar
		System.out.println(piggy_bank + "\n");
		
		// 문제1. 45를 일의자리와 십의자리로 분리해서 출력하시오.
		int n = 45;
		int units; // 일의자리
		int tens; // 십의자리
		
		tens = n/10;
		units = n%10;
		
		System.out.println("십의 자리는 " +  tens + "이고, \n일의 자리는 " + units + "입니다.\n");
		
		// 문제2. 1분 = 60초, 1시간 = 60분 = 3600초
		// 3690초를 1시간 1분 30초로 변환해서 출력하시오.
		
		int totalSecond = 3690;
		int hour; // 시간
		int minute; // 분
		int second; // 초
		
		minute = totalSecond / 60; 
		hour = minute / 60;
		second = totalSecond % 60;
		minute = minute % 60;
		
		System.out.println(hour +"시간 " + minute + "분 " + second + "초\n");
	
		// 문제3. 두 변수 x와 y에 저장된 값을 서로 교환하시오.
		int x = 10;
		int y = 20;
		int temp;	// 임시변수
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("x의 값은 " + x + "\ny의 값은 " + y);
		
		// 라인 이동 단축키
		// alt + 방향키(↓)
		
	}

}
