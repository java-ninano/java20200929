package chap08.lecture.textbook.s080601;

public interface InterfaceC extends InterfaceA,InterfaceB  {
public void methodA() {
	System.out.println("InplementationC-methodA() 실행");
}


public void methodB() {
	System.out.println("InplementationC-methodB() 실행");
}


public void methodC() {
	System.out.println("InplementationC-methodC() 실행");
}
}
