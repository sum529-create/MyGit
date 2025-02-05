package ex03_array_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		
		// 문제. 친구 3명을 저장할 수 있는 배열을 생성하고,
		// 초기화를 통해 배열에 입력한다.
		// 새로 사귄 친구의 수를 입력 받아서,
		// 기존 친구들이 저장된 배열의 길이를 늘린다.
		
		String[] friendList = {"타요", "띠띠뽀", "뽀로로"};
		Scanner sc = new Scanner(System.in);
		System.out.print("새로 사귄 친구의 수를 입력하세요 >> ");
		int friend = sc.nextInt();
		String[] newfriend = new String[friendList.length + friend];
		
		System.arraycopy(friendList, 0, newfriend, 0, friendList.length);
		
		friendList = newfriend;
		
		for(int i = 0; i<friendList.length; i++) {
			System.out.println("배열요소 : " + friendList[i]);
		}
		
		sc.close();
	}

}
