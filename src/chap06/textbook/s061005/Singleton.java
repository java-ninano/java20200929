package chap06.textbook.s061005;

public class Singleton {
private static Singleton singleton = new Singleton();

private Singleton() { //Ŭ���� �ۿ����� ���Ұ�, ���ٺҰ�	
}
	static Singleton getInstance() { //���� ������ = getInstance()
		return singleton;
	
}
}
