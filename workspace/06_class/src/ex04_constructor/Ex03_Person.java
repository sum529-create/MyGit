package ex04_constructor;

class Person{
	// field
	String name;
	String sn;	// 주민등록번호 (하이픈 포함)
	int age;	// 나이 자동 sn이용	(1, 2, 5, 6 : 1900년대, 3, 4, 7, 8 : 2000년대)
	char gender;	// sn자동 (1, 3, 5, 7 : 남, 2, 4, 6, 8 : 여)
	boolean isKorean;	// sn자동 (1, 2, 3, 4 : 한국인, 5, 6, 7, 8 : 외국인)
	
	Person(String name, String sn){
		this.name = name;
		this.sn = sn;
		if(sn.charAt(7) == '1' || sn.charAt(7) == '2' || sn.charAt(7) == '5' || sn.charAt(7) == '6') {
			this.age = 2020 - (1900+Integer.parseInt(sn.substring(0,2)))+1;
		}else if(sn.charAt(7) == '3' || sn.charAt(7) == '4' || sn.charAt(7) == '7' || sn.charAt(7) == '8')  {
			this.age = 2020 - (2000+Integer.parseInt(sn.substring(0,2)))+1;
		}
		if (sn.charAt(7) == '1' || sn.charAt(7) == '3') {
			this.gender = '남';
		}else if (sn.charAt(7) == '2' || sn.charAt(7) == '4') {
			this.gender = '여';
		}
		this.isKorean = sn.charAt(7) >= '1' && sn.charAt(7) <= '4';
		
	}
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("주민등록번호 : " + sn.substring(0,8) + "******");
		System.out.println("나이 : " + age + "살");
		System.out.println("성별 : " + gender);
		System.out.println(isKorean?"한국인":"외국인");
		System.out.println();
	}
	
}

public class Ex03_Person {

	public static void main(String[] args) {

		Person man = new Person("철수", "951212-1234567");
		Person woman = new Person("영희", "051212-4567891");
		
		man.print();
		woman.print();
		
		// 이름 : 철수
		// 주민등록번호 : 951212 - 1******
		// 나이 : 26살
		// 성별 : 남
		// 한국인

	}
	
	// 클래스, 메소드의 소스 코드를 확인하려면,
	// ctrl키를 누르고 확인한다.
	

}
