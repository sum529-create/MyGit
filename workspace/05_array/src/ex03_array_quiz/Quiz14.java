package ex03_array_quiz;

public class Quiz14 {

	public static void main(String[] args) {
		// 문제. 빙고
		// 5 x 5
		// 1. 1 ~ 25 사이 정수를 2차원 배열 bingo에 순차적으로 저장
		// 2. 섞는다.
		//	1) 총 25번의 교환이 발생된다.
		// 	2) bingp[0][0] <-> 랜덤
		// 	   bingp[0][1] <-> 랜덤
		//		...
		// 	   bingo[4][4] <-> 랜덤
		
		int[][] bingo = new int[5][5];
		// final int SIZE = 5;
		int a = 1;
		
		for(int i=0; i < bingo.length; i++) {
				for(int j = 0; j< bingo[i].length; j++) {
					bingo[i][j] = a;
					a++;
				}
		}
		
		for(int i=0; i < bingo.length; i++) {
			for(int j = 0; j< bingo[i].length; j++) {
				int x = (int)(Math.random()*5);
				int y = (int)(Math.random()*5);
				int temp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = temp;
			}
		}
		
		for(int i=0; i < bingo.length; i++) {
			for(int j = 0; j< bingo[i].length; j++) {
				System.out.print(bingo[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
