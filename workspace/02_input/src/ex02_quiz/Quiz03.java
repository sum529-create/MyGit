package ex02_quiz;

import javax.swing.JOptionPane;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문제. JOptionPane 클래스를 이용하여
		// 나이를 입력 받고 20 이상이면 "성인", 20 미만이면 "미성년자"를 출력하세요.
		
		String strAge = JOptionPane.showInputDialog("나이를 입력하세요.");
		int age = Integer.parseInt(strAge);
		JOptionPane.showMessageDialog(null, age >= 20 ? "성인": "미성년자");
		
	}

}
