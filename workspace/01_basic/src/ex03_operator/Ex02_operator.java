package ex03_operator;

public class Ex02_operator {

	public static void main(String[] args) {
		/*
		 * 4. 관계 연산자
		 * 		1) >	: 초과, 크다
		 * 		2) >=	: 이상, 크거나 같다
		 * 		3) <	: 미만, 작다
		 * 		4) <=	: 이하, 작거나 같다
		 * 		5) !=	: 같지 않다
		 * 		6) ==	: 같다 (primitive type)
		 * 			equals : 같다 (reference type)
		 * 		7) 결과 : true 또는 false
		 * 
		 * 5. 논리 연산자
		 * 		1) && : 모든 조건식의 결과자 True이면 True, 아니면 False (and)
		 * 		2) || : 조건식의 결과가 하나라도 True이면 True, 아니면 False (OR)
		 * 		3) !  : 조건식의 결과를 반대롤 변경 (Not) 
		 * 		4) short circuit evaluation을 지원한다.
		 * 			(1) && : 조건식의 결과가 false가 나타나면 더 이상 진행하지 않는다. 어처피 결과는 false이므로.
		 * 			(2) || : 조건식의 결과가 true가 나타나면 더 이상 진행하지 않는다. 어처피 결과는 True이므로.
		 * 
		 * 6. 조건 연산자
		 * 		1) 조건식의 결과가 true일 때와 false일 때 모두 한 번에 처리하는 연산자이다.
		 * 		2) 조건식 ? true일 때 실행문 : false일 때 실행문
		 * 		3) 항이 3개가 필요하기 때문에 삼항 연산자라고도 한다.
		 * 		4) 조건문인 if - else문의 대용으로 널리 사용된다.
		 */
		
		int a = 10;
		int b = 11;
		
		System.out.println(a > b); 		// false
		System.out.println(a >= b); 	// false
		System.out.println(a < b); 		// true
		System.out.println(a <= b);		// true
		System.out.println(a == b);		// false
		System.out.println(a != b);		// true
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);	// false (두 Hello가 저장된 위치를 비교)	
		System.out.println(str1.equals(str2));	// true (두 Hello의 내용을 비교)
		
		int c = 10;
		int d = 11;
		
		boolean r1 = c > d && c == 10;	// false
		@SuppressWarnings("unused")
		boolean r2 = c > d || c == 10;	// true
		@SuppressWarnings("unused")
		boolean r3 = !r1;	// true
		
		String str3 = "Hello";
		String str4 = "Hello";
		@SuppressWarnings("unused")
		boolean r4 = !str3.equals(str4);	// str3과 str4의 내용이 다른가? false
		
		System.out.println();
		
		// Shirt Curcuit Evaluation
		int x = 10;
		int y = 10;
		boolean r5 = x > 10 && y++ > 10;
		
		System.out.println(r5); 	// False y = 10, 뒤 y++문은 읽지 않는다. 앞문이 True이기 떄문에
									// 10 : x >10의 결과가 false이고 && 연산이므로 false가 된다. 
									// 최종 결과가 정해지고 나면 더 이상 조건식은 처리하지 않는다.
		
		System.out.println();
		
		int score = 85; // 80점 이상은 "합격", 80점 미만은 "불합격"
		String pass = score >= 80 ? "합격" : "불합격";
		System.out.println(pass);
		
		
		System.out.println();
		
		// 문제1. 국어점수와 영어점수가 모두 80점 이상이고, 평균이 85점이상이면 True, 아니면 False를 출력하시오.
		int kor = 80;
		int eng = 90;
		
		
		boolean result = kor >= 80 && eng >= 80 && (kor + eng)/2 >= 85; // 평균 구하기를 안 할 수도 있기 때문에 효율적
																		// 평균 구하기를 먼저하면 무조건 진해하기 때문에 비효율적
		System.out.println(result);
		
		System.out.println();
		
		
		// 문제2. 나이가 20살 이상이면 요금 5000원, 20살 미만이면 요금 2500원을 출력하시오.
		int age = 25;
		
		int fee = age >= 20 ? 5000 : 2500;
		
		System.out.println(fee);
		
		System.out.println();
		
		// 문제3. id가 "admin"이면 관리자, 아니면 일반유저라고 출력하시오.
		String id = "admin";
		
		System.out.println(id.equals("admin")? "관리자":"일반유저");
		
		System.out.println();
		
		
		// 문제4. 2자리 정수(10 ~ 99)중 하나를 선언하고,
		// 그 수가 '카프리카 수'인지 판단해서 맞으면 "맞다" 아니면 "아니다"룰 출력하시오.
		// 45, 55, 99는 '카프리카 수'이다.
		// 45 -> 45 * 45 -> 2025 -> 20 25 -> 20 + 25 -> 45
		
		int num = 55;
		int kpn = ((num*num) / 100) + ((num*num) % 100);
		String a1 = String.valueOf(kpn);
		String a2 = String.valueOf(num);
		
		System.out.println(a1.equals(a2)? "맞다":"아니다");
	}

}
