package ex02_object_array;

import java.text.DecimalFormat;
import java.util.Arrays;

class Student{
	
	// field
	String name;
	int[] scores;	// 모든 점수들
	double average; // 평균
	char grade;		// 학점
	boolean isPass;
	
	// constructor
	Student(String name){
		this.name = name;
	}
	
	// method
	void setScores(int scoreCount) {
		this.scores = new int[scoreCount];
		for(int i = 0; i<scores.length; i++) {		// i < scoreCount도 가능하다.
			this.scores[i] = (int)(Math.random() * 101);	// 101개 점수 중 하나(0~100)
		}
		this.average = getAverage();
		this.grade = getGrade();
		this.isPass = isPass();
	}
	double getAverage() {
		int total = 0;
		for(int i =0; i < scores.length; i++) {
			total += scores[i];
		}
		return (double)total / scores.length;
		
	}
	char getGrade() {
		if(average >= 90) {
			return 'A';
		}
		else if(average >= 80) {
			return 'B';
		}
		else if(average >= 70) {
			return 'C';
		}
		else if(average >= 60) {
			return 'D';
		}else {
			return 'F';
		}
		
	}
	boolean isPass() {
		return average >= 60;
	}
	

	
	void info() {
		System.out.print(name + ", ");
		System.out.print(Arrays.toString(scores) + ", ");
		DecimalFormat df = new DecimalFormat("0.00");	// 소수점 변환
		System.out.print(df.format(average) + ", ");
		System.out.print(grade + ", ");
		System.out.println(isPass ? "합격" : "불합격");
		System.out.println();
	}
	
}

class Lecture{
	String lectureName;
	Student[] names;
	int i;
	

	public Lecture(String lectureName, int studentCount) {
		this.lectureName = lectureName;
		names = new Student[studentCount];
	}

	public void addStudent(Student student) {
		names[i++] = student;
		
	}

	public void doExam() {
		for(int i = 0; i<names.length; i++) {
			names[i].setScores(3);		// 학생마다 3개과목
		}
		
	}
	
	double getLactureAvg(){
		double total = 0.0;
		for(int i = 0; i<this.i; i++) {
			total += names[i].getAverage();
		}
		return total / i;
	}	

	public void info() {
		System.out.println("강좌명 : " + lectureName + "(" + new DecimalFormat("0.00").format(getLactureAvg()) + "점)");
		for(int i = 0; i<names.length; i++) {
			names[i].info();
		}
	}
	
}


public class Ex04_Student {

	public static void main(String[] args) {
		// 학생5명의 이름
		String[] names = {"alice", "emily", "samanda", "david", "james"};
		
		// 강좌 생성
		Lecture lecture = new Lecture("웹개발자양성과정", names.length);	// 강좌명 : 웹개발자양성과정, 학생수:5
		
		
		// 강좌에 학생 5명 등록
		// lecture.addStudent()를 5번 호출
		
		for(int i=0; i<names.length; i++) {
			lecture.addStudent(new Student(names[i]));
			
		}
		
		// 강좌 시험 개설
		lecture.doExam();
		
		// 강좌 시험 결과
		lecture.info();		// 학생정보 모두 출력 + 강좌 평균 출력
		
	}

}
