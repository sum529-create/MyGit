package ex02_object_array;

import java.util.Scanner;

// 하루
class Day{
	// field
	String schedule;	// 기본값 null
	
	// constructor
	Day() {	}
	
	// method
	// 1. 스케줄 확인
	String getSchedule() {
		return schedule;
	}
	
	// 2. 스케줄 저장
	void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	
	// 3. 스케줄 출력
	void printDaySchedule() {
		if (schedule == null || schedule.isEmpty()) {
			System.out.println("없음.");
		}else {
			System.out.println(schedule);
		}
	}
	
}

// 일주일 스케줄
class WeekScheduler{
	// field
	Day[] week;
	String[] weekName = {"일", "월", "화", "수", "목", "금", "토"};
	int nthWeek;	// 1주차 ~ n주차
	Scanner sc;
	
	// constructor
	public WeekScheduler(int nthWeek) {
		this.nthWeek = nthWeek;
		// week 배열의 길이 결정하기
		// Day 객체 7개 생성해 두기
		// sc 생성해 두기
		week = new Day[7];
		for(int i=0; i<week.length; i++) {
			week[i] = new Day();	// Day 객체 7개(스케줄이 없는) 생성해 둠
		}
		sc = new Scanner(System.in);
	}	
		// method
		
		// 1. 스케줄 만들기 (스케줄이 없으면 만들고, 있으면 취소)
	void makeSchedule() {
		boolean isExist = false;	// 입력한 요일이 있으면 true 없으면 false
		System.out.print("스케줄을 등록할 요일(일~토) 입력 >> ");
		String a = sc.next();
		sc.nextLine();	// 입력 스트림에 남아 있는 enter 읽어서 버리기
		for(int i = 0; i<week.length; i++) {
			if(a.equals(weekName[i])) {
				if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.print("스케줄 입력 >> ");
					String b = sc.nextLine();	// next()와의 차이점 빈칸이 들어 갈 수 있음.
					week[i].setSchedule(b);
					System.out.println(weekName[i] + "요일에 새 스케줄이 저장되었습니다.");
				}else{
					System.out.println(weekName[i] + "요일은 이미 스케줄이 있습니다.");
				}
				isExist = true;
				break;	// return;
				
			}
		}
		if(!isExist) {
			System.out.println(a + "요일은 존재하지 않습니다. 다시 시도하세요.");
		}
	}
	
		// 3. 스케줄 수정하기 (기존 스케줄이 있으면 수정, 없으면 새로등록)
	void changeSchedule() {
		boolean isExist = false;
		System.out.print("스케줄을 수정할 요일(일~토) 입력 >> ");
		String weekDay = sc.nextLine();
		for(int i = 0; i<week.length; i++) {
			if(weekDay.equals(weekName[i])) {
				if(week[i].getSchedule() != null) {
					
					System.out.println("수정할 스케줄을 확인합니다.");
					System.out.println(week[i].getSchedule());
					System.out.print("수정할 스케줄 입력 >>> ");
					String update = sc.nextLine();
					
					System.out.print("수정할까요(Y/N)");
					String a = sc.nextLine();
					if(a.equals("Y")) {
						week[i].setSchedule(update);
						System.out.println(weekName[i] + "요일의 스케줄이 수정되었습니다.");				
					}else if(a.equals("N")) {
						System.out.println("스케줄을 수정하지 않았습니다.");
					}
				}else if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName[i] + "요일은 스케줄이 없습니다.");
				}
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.println(weekDay + "요일은 존재하지 않습니다. 다시 시도하세요.");
		}
	}
		// 2. 스케줄 삭제하기 (기존 스케줄이 있으면 삭제, 없으면 취소)
	void deleteSchedule() {
		boolean isExist = false;
		System.out.print("스케줄을 삭제할 요일(일~토) 입력 >> ");
		String weekDay = sc.nextLine();
		for(int i= 0; i<week.length; i++) {
			if(weekDay.equals(weekName[i])) {
				if(week[i].getSchedule() != null) {
					System.out.println("삭제할 스케줄을 확인합니다.");
					System.out.println(week[i].getSchedule());
					System.out.print("삭제할까요(Y/N)? >> ");
					String a = sc.nextLine();
					if(a.equals("Y")) {
						week[i].setSchedule(null);
						System.out.println(weekName[i] + "요일의 스케줄을 삭제하였습니다.");
					}else if(a.equals("N")) {
						System.out.println("삭제하지 않았습니다.");
					}
				}else if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
					System.out.println(weekName[i] + "요일은 스케줄이 없습니다.");
				}
				isExist = true;
			}
		}
		if(!isExist) {
			System.out.println(weekDay + "요일은 존재하지 않습니다. 다시 시도하세요.");
		}
	}

		
		
		// 4. 일주일 전체 스케줄 출력하기 (요일별 스케줄 출력)
	void printWeekSchedule() {
		System.out.println(nthWeek + "주차 스케줄 안내.\n");
		for(int i =0 ; i<week.length; i++) {
			if(week[i].getSchedule() == null || week[i].getSchedule().isEmpty()) {
				System.out.println(weekName[i] + "요일은 스케줄이 없습니다.");	// week[i].printDaySchedule();
			}else {
				System.out.println(weekName[i] + "요일은 " +week[i].getSchedule() + "의 스케줄이 있습니다.");
			}
		}
		
	}
		// 5. 프로그램 종료
	void exit() {
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}
		// 6. 메뉴 출력
	void menu() {
		System.out.println();
		System.out.println("1. 스케줄 만들기");
		System.out.println("2. 스케줄 삭제하기");
		System.out.println("3. 스케줄 수정하기");
		System.out.println("4. 스케줄 전체 출력하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println();
	}
	
	
	// 7. 스케줄러 실행
	void run() {
		while(true) {
			menu();		// 메뉴 출력
			System.out.print("메뉴 선택 >> ");
			int choice = sc.nextInt();
			sc.nextLine();	// Enter 읽어서 버리기
			// String str = sc.nextInt();
			
			switch(choice) {
			case 1 : makeSchedule(); break;	// break는 switch문 종료
			case 2 : deleteSchedule(); break;	
			case 3 : changeSchedule(); break;	
			case 4 : printWeekSchedule(); break;	
			case 0 : exit(); return;	// run 메소드 종료하는 방법
			default : System.out.println("없는 메뉴입니다. 다시 입력하세요.");
			}
			
		}
	}
	
}

public class Ex05_Scheduler {

	public static void main(String[] args) {
		WeekScheduler firstWeek = new WeekScheduler(1);		// 1주차
		firstWeek.run();
	}

}
