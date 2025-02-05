package ex02_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		// 문제. 주민등록번호를 하이픈(-)없이 입력 받아서,
		// "남자", "여자"를 구분하여 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하시오.");
		
		String strSn = sc.next();
		char genderNum = strSn.charAt(6);	// 7번째 글자를 의미한다.
		/*
		 * genderNum 	정수
		 * '1'			49
		 * '2'			50
		 * '3'			51
		 * '4'			52
		 * 
		 * 대표 코드 값
		 * '0'	-> 48
		 * 'A'	-> 65
		 * 'a'	-> 97
		 */
		
		// 숫자 형태로 계산을 한 것이 아니라 문자형식의 정수로 나누어 계산함
		// gender은 String 형식
		// genderNum은 코드값으로 계산된다.
		
		String gender = genderNum % 2 == 0 ? "여자" : "남자";
		
		System.out.println("성별은" + gender + "입니다.");
		
		
		
		/* --------------------------------------------------- */
		
		
		// 2. 정수
		
		long sn = sc.nextLong();
		
		long num = (sn / 1000000)%10;
		
		String gender2 = num % 2 == 0 ? "여자" : "남자";
		
		System.out.println("성별은" + gender2 + "입니다.");
		
		sc.close();

	}

}
