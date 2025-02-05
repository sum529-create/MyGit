package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// 문제. 평점 입력 받아서 해당 평점만큼 ★을 출력하시오.
		// 평점은 1 ~ 5 사이 정수로 입력 받는데, 벗어난 범위는 다시 입력받는다.
		
		Scanner sc = new Scanner(System.in);
		int grade = 0;
		String stars = null;	// 문자열 + 연산자로 연결되는 경우 ""로 초기화를 한다.
		
		// 평점 입력(반복 : do ~while)
		do {
			System.out.print("숫자를 입력하시오. >> ");
			grade = sc.nextInt();
		}while(grade < 1 || grade > 5);

		
		// 출력 (반복 : while)
		while (grade > 0 ) {
			stars += "★";
			grade--;
		}

		System.out.print(stars);
		sc.close();
	}

}
