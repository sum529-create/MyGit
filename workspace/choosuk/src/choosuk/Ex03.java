package choosuk;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피 드릴까요? >> ");
		String coffee = sc.next();
		
		
		switch(coffee) {
		case "에스프레소":
		case "카페라떼":
		case "카푸치노" : System.out.println(coffee + "는 3500원 입니다."); break;
		case "아메리카노" : System.out.println(coffee + "는 2000원 입니다."); break;
		default : System.out.println(coffee + "는 메뉴에 없습니다."); break;
		}
		
		sc.close();
		
		
	}

}
