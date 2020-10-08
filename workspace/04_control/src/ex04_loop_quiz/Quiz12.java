package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz12 {

	public static void main(String[] args) {
		
		// 문제. 10000원 모두 쓰기
		// 사용할 금액을 입력 받아서 10000원에서 공제하기
		// 현재 10000원 있습니다.
		// 결제금액 >> 5000
		// 현재 5000원 있습니다.
		// 결제금액 >> 10000
		// 5000원이 부족합니다.
		// 현재 5000원이 있습니다.
		// 결제금액 >> 5000
		// 현재 0원 있습니다.
		
		int money = 10000;
		
		// 내가 적은 코드.. 
		// 이거 평가문제 나올수 있음
		
		Scanner sc = new Scanner(System.in);
		
		while(money != 0) {
			System.out.print("결재금액 >> ");	// random으로 결제
			int sub = sc.nextInt();
			
			if(money < sub) {
				System.out.println((sub-money) + "원이 부족합니다.");
			}else if(money == 0){
				break;
			}else {
				money -= sub;
				System.out.println("현재 " + money + "원 있습니다.");
			}
		}
		
		sc.close();

	}

}
