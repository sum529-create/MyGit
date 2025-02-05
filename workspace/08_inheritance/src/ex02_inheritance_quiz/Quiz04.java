package ex02_inheritance_quiz;


class Song{
	String title;
	String genre;
	double playTime;
	
	public Song(String title, String genre, double playTime) {
		this.title = title;
		this.genre = genre;
		this.playTime = playTime;
		
	}
	
	void info() {
		System.out.println(title + ", " + genre + ", " + playTime);
	}
}
class Singer extends Song{
	String name;
	
	Singer(String name, String title, String genre, double playTime){
		super(title, genre, playTime);
		this.name = name;
	}
	
	@Override
	void info() {
		System.out.print(name + ", ");
		super.info();
	}
}

public class Quiz04 {

	public static void main(String[] args) {
		Singer singer1 = new Singer("아델", "hello", "balad", 4.5);
		Singer singer2 = new Singer("BTS", "dynamite", "dance", 3.5);
		Singer singer3 = new Singer("싹쓰리", "다시 여기 바닷가", "dance", 4.0);
		
		singer1.info();	// 이름, 제목, 장르, 재생시간
		singer2.info();	// 이름, 제목, 장르, 재생시간
		singer3.info();	// 이름, 제목, 장르, 재생시간

	}

}
