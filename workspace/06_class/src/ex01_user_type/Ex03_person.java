package ex01_user_type;

// 클래스 Person
// 이름, 나이, 성별, 키, 성인 유무(나이가 20이상이면 성인)

class person{
	String name;
	int age;
	String gender;
	double height;
	boolean adult;
}

public class Ex03_person {

	public static void main(String[] args) {
		
		person info = new person();
		info.name = "수민";
		info.age = 24;
		info.gender = "여자";
		info.height = 162;
		info.adult = info.age >= 20;
		
		System.out.println(info.name);
		System.out.println(info.age);
		System.out.println(info.gender);
		System.out.println(info.height);
		System.out.println(info.adult? "성인" : "청소년");
		

	}

}
