package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		// 문제. 비밀번호를 "1234"로 저장한다.
		// 비밀번호를 입력 받아서 "1234"와 같으면 "성공"
		// "1234"가 아니면 다시 비밀번호를 입력
		// 최대 5번 가능하고 최종적으로 "실패"
		
		Scanner sc = new Scanner(System.in);
//		boolean success = false;	// 어떤 상태를 의미하는 변수(flag)
		
		for(int a=0; a<5; a++) {
			System.out.print("비밀번호를 입력하시오 >> ");
			int pass = sc.nextInt();
			if(pass == 1234) {
				System.out.println("성공");
//				success = true;
				break;
			}else {
				System.out.println("실패");
			}
		}
		
//		if (success) {
//			System.out.println("성공");
//		}else {
//			System.out.println("실패");
//		}
		
		sc.close();

	}

}
