package choosuk;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		
		
		
		
		for(int i = 0 ; i<unit.length; i++) {
			System.out.println(unit[i] + "원 짜리 : " + (money / unit[i]) + "개");
			money = money-(unit[i]*(money / unit[i]));
		}
		sc.close();
	}

}
