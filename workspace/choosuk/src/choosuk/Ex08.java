package choosuk;

import java.util.Scanner;

class Player{
	Scanner sc = new Scanner(System.in);
	String playerName;
	int[] playerNum = new int[3];
	
	
	Player(String playerName){
		this.playerName = playerName;
	}
	String getName() {
		return playerName;
	}
	

	
	void getEnter() {
		sc.nextLine();
	}
	
	boolean gamePlay() {
		System.out.print("[" + playerName + "]:<Enter>");
		getEnter();
		
		for(int j =0; j < playerNum.length; j++) {
			playerNum[j] = (int)(Math.random()*3)+1;
		}

		System.out.print("\t\t");
		
		for(int i = 0; i<playerNum.length; i++) {
			System.out.print(playerNum[i] + "\t");
		}
		
		boolean result = true;
		for(int i = 0; i<playerNum.length; i++) {
			if(playerNum[i] != playerNum[0]) {
				result = false;
				break;
			}
		}
		return result;
		
	}
}
class Game{
	
	Scanner sc = new Scanner(System.in);
	Player[] player;
	
	Game() {
		System.out.print("겜블링 게임에 참여할 선수 숫자를 입력하세요 >> ");
		int num = sc.nextInt();
		sc.nextLine();
		player = new Player[num];
		
		for(int i =0; i < player.length; i++) {
			System.out.print((i+1) + "번째 선수 이름 >> ");
			String name = sc.nextLine();
			player[i] = new Player(name);
			
		}
	}
	void info(){
		int i = 0;
		while(true) {
			if(player[i].gamePlay()) {
				System.out.println(player[i].getName() + " 승리!");
				break;
			}else {
				System.out.println("아쉽군요!");
			}
			i++;
			i = i % player.length;	// players 배열에 저장된 Player가 번갈아 가면서 게임을 진행
		}
	}
}

public class Ex08 {

	public static void main(String[] args) {
		
		Game game = new Game();
		game.info();
		
	}

}
