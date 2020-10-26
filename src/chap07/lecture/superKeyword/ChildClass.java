package chap07.lecture.superKeyword;

public class ChildClass extends ParentClass {
@Override // ctrl+space 상위클래스에 접근할때: super
void method1() {
	
	super.method1();
	System.out.println("child method1");
}
}
