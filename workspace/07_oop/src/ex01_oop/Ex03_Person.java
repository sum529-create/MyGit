package ex01_oop;

class Book{

	// field
	String title;
	String author;
	
	// constructor
	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public Book(String title) {
		this(title, "미상");
	}
	
	// method
	void info() {
		System.out.print(title + ", " + author);
	}
	
	
}

class Person{
	// field
	String name;
	Book book;
	

	public Person(String name, String s1, String s2) {
		this.name = name;
		this.book = new Book(s1, s2);
		
	}
	public Person(String name, String s1) {
		this.name = name;
		this.book = new Book(s1);
		// this(name, s1, "미상")	다른방법
	}
	public Person(String name, Book book) {
		this.name = name;
		this.book = book;
		// book = new Book(book.title, book.author); garbage값.. 불필요하게 사용할 필요 없음. 선언시에 이미 new Book으로 호출했음!
	}
	public void info() {
		System.out.print(name + ", ");
		book.info();
		System.out.println();
		
	}
}

public class Ex03_Person {

	public static void main(String[] args) {
		
		Person p1 = new Person("제임스", "자바책", "김영희");
		Person p2 = new Person("앨리스", "홍길동전");
		Person p3 = new Person("데이빗", new Book("스프링5", "김철수"));
		Person p4 = new Person("에밀리", new Book("구미호전"));
		
		p1.info();	// 제임스, 자바책, 김영희
		p2.info();	// 앨리스, 홍길동전, 미상
		p3.info();	// 데이빗, 스프링5, 김철수
		p4.info();	// 에밀리, 구미호전, 미상
		

	}

}
