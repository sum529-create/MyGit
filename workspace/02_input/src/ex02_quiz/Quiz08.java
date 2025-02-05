package ex02_quiz;

import java.util.Scanner;

public class Quiz08 {

	public static void main(String[] args) {
		
		// 문제. 체질량지수(bmi)를 구하고 건강 상태 출력하기
		// 체질량지수 = 몸무게(kg) / 키(m)의 제곱
		// 건강상태 = 체질량지수 25이상이면 "과체중", 24~20 "정상", 20이만이면 "저체중"
		// 몸부게는 kg단위로 입력 받고, 키는 cm단위로 입력 받는다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 >> ");
		double kg = sc.nextDouble();
		
		System.out.print("키를 입력하세요 >> ");
		double cm = sc.nextDouble();
		double m = cm*0.01;
		
		double bmi = kg / ( m * m );
		
		System.out.println(bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중");
		
		sc.close();
	}

}
