package ex03_array_quiz;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		// 문제. 영한 사전
		// 사계절을 영어로 묻고 답하기
		// 실행 예)
		// 봄을 영어로 하면? >>> spring
		// 정답
		// 여름을 영어로 하면 >>> Summer
		// 정답
		// 가을을 영어로 하면 >>> fall
		// 정답
		// 겨울을 영어로 하면 >>> walter
		// 오답
		// String 타입의 2차원 배열 dictionary를 이용하시오.
		
		Scanner sc = new Scanner(System.in);
		String answer = null;
		
		String[][] dictionary = {
				{"봄", "여름", "가을", "겨울"},
				{"spring", "summer", "fall", "winter"}
			};
		for(int i =0 ; i< dictionary.length-1; i++) {
			for(int j=0; j<dictionary[i].length; j++) {
				System.out.print(dictionary[0][j] + "을 영어로 하면 >>> ");
				answer = sc.next();
				if(answer.equals(dictionary[1][j])) {
					System.out.println("정답");
				}else {
					System.out.println("오답");
				}
			}
		}
		sc.close();
	}

}
