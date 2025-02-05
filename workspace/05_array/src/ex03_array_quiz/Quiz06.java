package ex03_array_quiz;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		// 문제. 5명의 키를 입력받아서 가장 큰 키를 가진 사람의
		// 이름을 출력하시오.
		// 실행 예)
		// james의 키 입력 >>> 155.5
		// alice의 키 입력 >>> 155.5
		// amanda의 키 입력 >>> 155.5
		// jessica의 키 입력 >>> 155.5
		// emily의 키 입력 >>> 155.5
		// 가장 키가 큰 사람은 emily입니다.
		
		Scanner sc = new Scanner(System.in);
		
		String[] names = {"james", "alice", "amanda", "jessica", "emily"};
		double[] key = new double[names.length];
		int max = (int) key[0];
		String name = null;
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i] + "의 키 입력 >>> ");
			key[i] = sc.nextDouble();
		}
		for(int i=0; i<names.length; i++) {
			if(key[i] >= max) {
				max = (int) key[i];
				name = names[i];
			}
		}
		System.out.println("가장 키가 큰 사람은 " + name);
		
		sc.close();
	}

}
