package chap06.textbook.s061005;

public class Singleton {
private static Singleton singleton = new Singleton();

private Singleton() { //클래스 밖에서는 사용불가, 접근불가	
}
	static Singleton getInstance() { //같은 참조값 = getInstance()
		return singleton;
	
}
}
