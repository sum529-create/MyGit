package ch6;

public class Exercise6_22 {

	/* (1) isNumber 메서드를 작성하시오. */
	private static Boolean isNumber(String str) {
		if(str  == null || str.equals("")) {
			return false;
		}
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		
			
		}
		return true;
	}
	

	

	public static void main(String[] args) {
		String str = "123";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));

		str = "1234o";
		System.out.println(str + " 는 숫자입니까? " + isNumber(str));

	}


}
