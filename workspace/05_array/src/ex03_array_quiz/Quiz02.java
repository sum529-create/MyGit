package ex03_array_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 문제. 가위바위보
		// 실행
		// 가위바위보 >> 가위
		// 당신은 가위, 컴퓨터는 보, 이겼습니다.
		// Hint : 가위는 0, 바위는 1, 보는 2
		
		// String[] player1 = {"가위", "바위", "보"};
		// String[] player2 = {"가위", "바위", "보"};
		
		
		Scanner sc = new Scanner(System.in);
		int ran = (int)(Math.random() * 3);

		String[] crsp = {"가위", "바위", "보"};
		
		System.out.print("가위바위보! >> ");
		
		
		// switch문
		
		int gbb2 = 0;
		switch (sc.next()) {
		case "가위" : gbb2 = 0; break;
		case "바위" : gbb2 = 1; break;
		default : gbb2 = 2;
				
		}
		
		String result = null;
		switch (gbb2 - ran) {
		case 0 : result = " 비겼습니다."; break;
		case -2:
		case 1 : result = " 이겼습니다."; break;
		default : result = " 졌습니다."; break;
		}
		
		System.out.println("당신은 " + crsp[gbb2] + ", 컴퓨터는 " + crsp[ran] + result);
		
		sc.close();

	}

}
