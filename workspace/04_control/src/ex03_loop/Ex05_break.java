package ex03_loop;

import java.util.Scanner;

public class Ex05_break {

	public static void main(String[] args) {
		
		// break문
		// switch문이나 loop문(while, do-while- for)을 종료한다.
		
		// 무한 루프 (infinite loop)
		// 1. while (true) {	}
		// 2. for( ; ;) {	}
		
		
		// 1. 1 ~ 100
		int a = 1;
		
		while (true) {
			System.out.println(a);
			if (a == 3) {
				break;
			}
			a++;
		}
		
		// 2. 0이 입력될때까지 계속 입력 받으시오.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수를 입력하세요(0은 종료입니다.) >> ");
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
		}
		sc.close();
		
		// 3. 1부터 모든 정수의 합계를 구하시오.
		// 합계가 3000 이상이면 멈추고 어디까지 더한 결과가 3000 이상인지 출력하시오.
		int n1 = 1;
		int count = 0;
		
		while(true) {
			count += n1;
			if(count >= 3000) {
				break;
			}
			n1++;
		}
		System.out.println("1부터 " + n1 + "까지의 합은" + count + "입니다.");
		
		
		
		
		

	}

}
