package ex03_loop;

import java.util.Scanner;

public class Ex06_continue {

	public static void main(String[] args) {
		
		// continue 문
		// 실행 중인 loop문으로 되돌아 감
		
		// 1. 1 ~ 10 사이 정수 중에서 4 ~ 6만 제외하고 출력
		
		for(int a= 1; a<=10; a++) {
			if ( a >= 4 && a <= 6) {
				continue;	// 제외하고 싶은 것을 continue로 출력
			}
			
			System.out.println(a);
		}
		
		// 2. 애들 밥 먹이기
		// 김치 빼고 5번 먹이기
		// 김치는 안 먹고, 나머지는 모두 먹는 상황
		Scanner sc = new Scanner(System.in);
		int a= 0;
				
		while(a< 5) {
			// 반찬 입력
			System.out.print("먹을 반찬 입력 >> ");
			String eat = sc.next();
			
			if(eat.equals("김치")) {
				System.out.println("안먹어");
				continue;
			}else {
				a++;
			}
			System.out.println(eat + " 잘 먹겠습니다.");
		}
		sc.close();

	}

}
