package choosuk;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 >> ");
		String name = sc.next();
		
		System.out.print("나이를 입력하세요 >> ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요 >> ");
		double height = sc.nextDouble();
		
		System.out.print("성별을 입력하세요 >> ");
		char gender = sc.next().charAt(0);
		
		System.out.println(name + ", " + age + ", " + height + ", " + gender);
		
		sc.close();
	}
}
