package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 문제. 사용자로부터 문자열을 계속 입력 받는다.(next 메소드)
		// "종료" 문자열을 입력하면 종료한다.
		// 총 몇번만에 종료되었는지 그 횟수를 마지막에 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		String next = "";
		
//		String str = null;	// str 자체가 없다.
//		String str1 = "";	// str은 있는데 내용물이 없다.
		
		while(!next.equals("종료")) {
			System.out.print("문자열을 입력하세요. >> ");
			next = sc.next();	
			total++;
		}
		System.out.println("지금까지 " + total + "번 실행되었습니다.");
		
		sc.close();
		
		

	}

}
