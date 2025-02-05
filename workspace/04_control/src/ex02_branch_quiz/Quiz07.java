package ex02_branch_quiz;

import java.util.Scanner;

public class Quiz07 {

	public static void main(String[] args) {
		
		// 문제. 가위바위보
		// 실행
		// 가위바위보 >> 가위
		// 당신은 가위, 컴퓨터는 보, 이겼습니다.
		// Hint : 가위는 0, 바위는 1, 보는 2
		
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 3);

		String crsp = null;
		
		System.out.print("가위바위보! >> ");
		String prsp = sc.next();
		
		switch(ran) {
		case 0 : crsp = "가위"; break;
		case 1 : crsp = "바위"; break;
		case 2 : crsp = "보"; break;
		}
		
		// if문 사용
		
//		if (prsp.equals(crsp)) {
//			System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + ", 비겼습니다.");
//		} 
//		else if(crsp.equals("가위") && prsp.equals("바위")) {
//			System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + ", 이겼습니다.");
//		} 
//		else if(crsp.equals("바위") && prsp.equals("보")) {
//			System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + ", 이겼습니다.");
//		} 
//		else if(crsp.equals("보") && prsp.equals("가위")) {
//			System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + ", 이겼습니다.");
//		}else {
//			System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + ", 졌습니다.");
//		}
		
		
		// switch문
		
		int gbb2 = 0;
		switch (prsp) {
		case "가위" : gbb2 = 0; break;
		case "바위" : gbb2 = 1; break;
		case "보" : gbb2 = 2;
		
		}
		
		String result = null;
		switch (gbb2 - ran) {
		case 0 : result = " 비겼습니다."; break;
		case -2:
		case 1 : result = " 이겼습니다."; break;
		default : result = " 졌습니다."; break;
		}
		
		System.out.println("당신은 " + prsp + ", 컴퓨터는 " + crsp + result);
		
		sc.close();
		

	}

}
