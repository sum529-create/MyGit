package ex03_array_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 문제. 길이가 5인 double 타입의 배열을 선언하고,
		// 5개의 키(실수)를 입력 받아서 배열에 저장하고 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		double [] a = new double [5];
		
		for(int b = 0; b<a.length; b++) {
			System.out.print(b + "번째 키를 입력하시오 >> ");
			a[b] = sc.nextDouble();
		}		
		for(int b = 0; b<a.length; b++) {
			System.out.println(a[b]);
		}		
		
		
		sc.close();
	}

}
