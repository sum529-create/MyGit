package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// 문제. 권한을 정수(1~3)을 입력받아서 
		// 권한1 : "실행, 쓰기, 읽기"
		// 권한2 : "쓰기, 읽기"
		// 권한3 : "읽기"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(1~3) >> ");
		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("실행");
		case 2 : System.out.println("쓰기");
		default: System.out.println("읽기");
		}
		
		sc.close();

	}

}
