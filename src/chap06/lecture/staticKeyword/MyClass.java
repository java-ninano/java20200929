package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1;
	
	static { // 프로그램 실행시 가정먼저 실행, static 초기값을 설정해주는 코드입력가능
		System.out.println("static block");
		var2 = 3000;
		
	}

	void method1() {
		System.out.println(var1);
	}
	
	static void method2() { //class가 가지고 있는 기능
		// System.out.println(var1); // static -> instance로 접근 불가
		System.out.println(var2); //instance member ->class member로 접근가능
		
	}
}
