package ex02_package;

import ex01_package.Father;

// Father 클래스의 서브 클래스

public class Baby extends Father{

	void viewFather() {
//		System.out.println(secret); 	// private
//		System.out.println(tv1); 		// default : ex01_package에서만 볼 수 있다.
		System.out.println(perID);
		System.out.println(name);
	}

}
