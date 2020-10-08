package ex03_array_quiz;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		// 문제. 식당 대기표 
		// 5팀 예약
		// 실행 예)
		// 1번 손님 좌석 예약 >>> 3
		// 2번 손님 좌석 예약 >>> 4
		// 3번 손님 좌석 예약 >>> 2
		// 4번 손님 좌석 예약 >>> 4
		// 5번 손님 좌석 예약 >>> 1
		// 예약 현황
		// 1번 : 0 0 0
		// 2번 : 0 0 0 0
		// 3번 : 0 0
		// 4번 : 0 0 0 0
		// 5번 : 0
		
		int [][]re = new int[5][];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<re.length; i++) {
			System.out.print((i+1) + "번 손님 좌석 예약 >>> ");
			re [i] = new int[sc.nextInt()];
		}
		System.out.println("\n예약현황");
		
		for(int i=0; i<re.length; i++) {
			String graph = "";
			for(int j =0; j<re[i].length; j++) {
				graph += "0" + " ";
			}
			System.out.println((i+1) + "번 : " + graph);
		}
		sc.close();
	}

}
