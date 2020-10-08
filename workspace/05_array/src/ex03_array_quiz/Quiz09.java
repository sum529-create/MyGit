package ex03_array_quiz;

import java.util.Scanner;

public class Quiz09 {

	public static void main(String[] args) {
		
		// 문제. 2행3열의 정수 타입 2차원 배열을 선언하고,
		// 값을 입력받아서 저장한뒤, 출력하시오.
		// 실행 예)
		// 1행 1열의 값을 입력 >>> 1
		
		Scanner sc = new Scanner(System.in);
		int[][] num = new int[2][3];
		
		
		for(int i=0; i< num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(i + "행" + j + "열의 값을 입력 >>> ");
				num[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		for(int i=0; i< num.length; i++) {
			for(int j=0; j<num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
