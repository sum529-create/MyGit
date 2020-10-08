package ex04_loop_quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		// 1. 세로로 출력하는 전체 구구단
		// 2 x 1 = 1
		// 2 x 2 = 4
		
		for(int a = 2; a<=9; a++) {
			System.out.println(a + "단\n");
			for(int b= 1; b<=9; b++) {
				System.out.println(a + "x" + b + "=" + (a*b));
			}
			System.out.println("\n------------------");
		}
		
		System.out.println();
		
		
		// 2. 가로로 출력하는 전체 구구단
		// 2 x 1 = 1	3 x 1 = 3
		
		for(int a = 1; a<=9; a++) {
			for(int b= 2; b<=9; b++) {
				System.out.print(a + "x" + b + "=" + (a*b) + "\t");
			}
			System.out.println();
		}
		
	}

}
