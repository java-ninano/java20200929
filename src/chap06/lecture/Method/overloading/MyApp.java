package chap06.lecture.Method.overloading;

public class MyApp {
public static void main(String[] args) {
	MyClass o1 =new MyClass();
	o1.method1();
	o1.method1(3);
	o1.method1(3.14);
	o1.method1(4,5);
	o1.method1(4,5);
}
}
