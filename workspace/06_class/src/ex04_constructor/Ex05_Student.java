package ex04_constructor;

class Student {
	
	// field
	String name;
	String school;
	int[] score;
	double average;
	boolean isPass;
	
	// constructor
	Student(String name, String school) {
		this.name = name;
		this.school = school;
	}
	
	// method
	void doExam() {
		
		score = new int[3];
		
		int total = 0;
		
		for (int i = 0; i < score.length; i++) {
			score[i] = (int)(Math.random() * 51) + 50;	// 50~100 -> 51개
			total += score[i];
		}
		// score[0] = (int)(Math.random() * 51) + 50;
		// score[1] = (int)(Math.random() * 51) + 50;
		// score[2] = (int)(Math.random() * 51) + 50;
		// total += score[0];
		// total += score[1];
		// total += score[2];
		
		average = (double)total / score.length;
		
		isPass = average >= 80;
		
	}
	
	void info() {
		System.out.println("이름: " + name);
		System.out.println("학교: " + school);
		System.out.print("점수: [");
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i]);
			if (i == score.length - 1) {
				System.out.println("]");
			} else {
				System.out.print(", ");
			}
		}
		System.out.println("평균: " + average);
		System.out.println(isPass ? "합격" : "불합격");
	}
	
}

public class Ex05_Student {

	public static void main(String[] args) {
		
		// 클래스, 메소드의 소스 코드를 확인하려면,
		// Ctrl 키를 누르고 클릭한다.
		
		Student student = new Student("제임스", "서강대");
		
		student.doExam();  // 시험본다. (50~100 사이 랜덤 3개 생성)
		student.info();
		
		// 이름: 제임스
		// 학교: 서강대
		// 점수: [50, 75, 100]
		// 평균: 75.0점
		// 불합격  (평균 80점 이상 합격)

	}

}
