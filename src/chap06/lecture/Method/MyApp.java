package chap06.lecture.Method;

public class MyApp {
public static void main(String[] args) {
	MyClass o1= new MyClass();
	o1.var1 = 3;
	o1.myMethod();
// o1.yourMethod();
	
	MyClass o2 = new MyClass();
	o2.myMethod();
	
	o2.myMethod2(5); // ���赵���� int param�� ���� �ִ´ٰ� ���������� int �� �߰�
	o2.myMethod2(7); // o2 var1 == 0�̹Ƿ� 7+0=7
	
	o1.myMethod2(7); 
	
	o1.myMethod3(1, 2);
}
}
