package ex02_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		// 문제. 두 개의 실수를 입력 받아서,
		// 두 실수의 값을 교환하시오.
		
		double temp;
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("두 실수를 입력 하세요 >>> ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		temp = a;
		a = b;
		b = temp;
				
		System.out.println("두 실수의 값은 " + a + ", " + b + "입니다.");
		
		sc.close();
	}

}
