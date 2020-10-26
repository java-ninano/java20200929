package chap06.lecture.Method;

public class MyClassReturn {

	int var1;
	
	void method1() { 
		System.out.println("메소드1 실행");
	}
	
	
	int method2() { // return할 값이 있을때는 리턴타입을 지정해주어여 한다.
		System.out.println("메소드2 실행");
		
		//return : 메소드 종료, 오른쪽에 있는 값을 호출한 곳으로 돌려줌
		return var1*2;
	  
	}
	
	
	
	
	
	
	
	
	
	
}
