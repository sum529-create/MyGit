package ex02_quiz;

import java.util.Scanner;

// import javax.swing.JOptionPane;

public class Quiz04 {

	public static void main(String[] args) {
		
		// 문제. 매출액(정수)과 등급("VIP", "일반")을 입력 받아서,
		// "VIP" 등급은 매출액의 20%를 할인하고,
		// "일반" 등급은 매출액의 5%를 할인하여 실제 매출액을 출력하시오.
//		
//		String strCost = JOptionPane.showInputDialog("매출액을 입력하세요.");
//		double cost = Integer.parseInt(strCost);
//		
//		String strGrade = JOptionPane.showInputDialog("등급을 입력하세요.(VIP, 일반)");
//		
//		JOptionPane.showMessageDialog(null, strGrade.equals("VIP") ? cost-(cost * 0.2): cost - (cost * 0.05));
		
		/* ----------------------------------------------- */
		Scanner sc = new Scanner (System.in);
		System.out.print("매출액을 입력하세요 >> ");
		double cost1 = sc.nextInt();	// 10000\n 입력하면 sales는 10000저장, \n은 저장되지 않는다.
		
		sc.nextLine();	// 스트림에 남아 있는 \n 입력 받아서 그냥 버린다.
		
		System.out.print("등급을 입력하세요 >> ");
		String grade = sc.nextLine();
		
		System.out.println(grade.equalsIgnoreCase("VIP") ? cost1 * 0.8 : cost1 * 0.95 + "원");	// equalsIgnoreCase() 대소문자 구분 안함
		
		sc.close();
	}

}
