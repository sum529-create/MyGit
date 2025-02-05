package ex04_loop_quiz;

import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
		
		// 문제. UpDown 게임
		// 범위는 1 ~ 10000 사이 난수를 발생시키고,
		// 해당 난수를 맞히는 게임
		// 입력마다 "Up!", "Down!"
		
		// 난수 : 4500
		// 입력 >> 5000
		// Down!
		// ..
		// 입력 >> 4500
		// 정답! . 총 5번만에 성공.
		
		int rd = (int)(Math.random() * 10000) + 1;
		int count = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 다른 방법으로 사용
		
		while(rd != num) {
			System.out.print("난수를 입력하세요 >> ");
			num = sc.nextInt();
			if (num < 1 || num > 10000) {
				System.out.println("1~10000 사이만 유효함");
				continue;
			}else if(rd < num){
				System.out.println("Down!");
				count ++;
			}else if(rd > num) {
				System.out.println("Up!");
				count ++;
			}
			else {
				count ++;
				System.out.println("정답!, 총 " + count + "번만에 성공!");
				break;
			}
		}
		
		
		sc.close();
		

	}

}
