package ex01_oop;

class Song{

	// field
	String title;
	String genre;
	double playTime;
	
	// constructor
	public Song(String title, String genre, double d) {
		this.title = title;
		this.genre = genre;
		this.playTime = d;
		
	}
	
	
	// method
	
	void info() {
		System.out.println(title + ", " + genre + ", " + playTime);
	}
	
	
}
class Singer{

	// field
	String name;
	Song song;
		
	// constructor
	public Singer(String name, Song song) {
		this.name = name;
		this.song = song;
	}

	public Singer(String name, String title, String genre, double d) {
		this.name = name;
		this.song = new Song(title, genre, d);
	}

	// method
	public void info() {
		System.out.print(name + ", ");
		song.info();
		
	}
}

public class Ex04_Singer {

	public static void main(String[] args) {

		Singer singer1 = new Singer("아델", new Song("hello", "balad", 4.5));
		Song song = new Song("dynamite", "dance", 3.5);
		Singer singer2 = new Singer("BTS", song);
		
		Singer singer3 = new Singer("싹쓰리", "다시 여기 바닷가", "dance", 4.0);
		
		singer1.info();	// 이름, 제목, 장르, 재생시간
		singer2.info();	// 이름, 제목, 장르, 재생시간
		singer3.info();	// 이름, 제목, 장르, 재생시간
		
		

	}

}
