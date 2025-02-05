package ex03_loop;

import java.util.Scanner;

public class Ex01_while {

	public static void main(String[] args) {
		/*
		 * while문
		 * 1. 조건식의 결과가 True이면 반복되는 제어문
		 * 2. 형식
		 * 	while(조건식){
		 * 		반복 실행문;
		 * 	}
		 */
		
		// 1. 1 ~ 3 출력하기
		
		int a =1;
		
		while(a <= 3) {
			System.out.println(a);
			a++;
		}
		
		// 변수 a  	조건식 a<=3		조건식 결과		실행문
		// 1		1 <= 3			true			System.out.println(a);
		// 2		2 <= 3			true			System.out.println(a);
		// 3		3 <= 3			true			System.out.println(a);
		// 4		4 <= 3			false			종료
		
		System.out.println();
		
		// 2. 3 ~ 1 출력하기
		int b = 3;
		
		while (b>=1) {
			System.out.println(b);
			b--;
		}
		
		System.out.println();
		
		
		// 3. 'A' ~ 'Z' 출력하기
		
		char c = 'A';
		
		while (c<='Z') {
			System.out.println(c);
			c++;
		}
		
		System.out.println();
		
		// 4. 사용자가 0을 입력할 때까지 계속 입력 받아서 합계를 구하시오.
		// 사용자 입력 : n
		// 합계 : total
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int n = 10;
		
		while(n != 0) {
			System.out.print("정수를 입력하세요. >> ");
			n = sc.nextInt();
			total += n;
		}
		System.out.println("합계 : " + total);
		sc.close();
		
	}

}
