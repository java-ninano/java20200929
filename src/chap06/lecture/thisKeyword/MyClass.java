package chap06.lecture.thisKeyword;

public class MyClass {
	int var; //(instance field)
	
	MyClass(){
		
	}
	
	MyClass(int var){
		this.var = var;
	}

	void method1() { // instance method
		int var = 5;
		System.out.println(this.var); // ==int var(필드값)
		System.out.println(var);// int var = 5;
	}

	void method2() {
		this.method1(); // this: 자기자신의 instance를 나타냄
	}
}
