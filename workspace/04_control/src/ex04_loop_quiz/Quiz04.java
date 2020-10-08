package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 문제. 입력 받은 구구단만 출력하시오.
		// 2~9 사이 정수를 입력 받아 해당 구구단만 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오(2~9) >> ");
		int num = sc.nextInt();
		
		for(int a = 1; a<=9; a++) {
			System.out.println(num + " x " + a + " = " + (num*a));
		}
		
		sc.close();
	}

}
