package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		// 문제. 퀴즈 맞추기
		// 대한민국의 수도 맞추기
		// 몇번만에 맞췄는지 출력하기
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while(true) {
			System.out.print("대한민국의 수도는? >> ");
			String cp = sc.next();
			count++;
			if(cp.equals("서울") || cp.equals("seoul")) {
				System.out.println("정답입니다.");
				break;
			}else {
				System.out.println("오답입니다.");
			}
		}
		
		System.out.println("수도문제를 " + count + "번만에 맞추셨습니다.");
		
		sc.close();

	}

}
