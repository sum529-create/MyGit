package ex02_quiz;

public class Quiz03 {

	public static void main(String[] args) {
		// 문제. 로또
		// 1 ~ 45 사이의 로또 번호 하나만 출력하시오.
		
		int lotto = (int)(Math.random() * 45) + 1;
		System.out.println("로또 번호 : " + lotto);
		

	}

}
