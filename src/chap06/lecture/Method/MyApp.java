package chap06.lecture.Method;

public class MyApp {
public static void main(String[] args) {
	MyClass o1= new MyClass();
	o1.var1 = 3;
	o1.myMethod();
// o1.yourMethod();
	
	MyClass o2 = new MyClass();
	o2.myMethod();
	
	o2.myMethod2(5); // 설계도에서 int param의 값을 넣는다고 설계했으니 int 값 추가
	o2.myMethod2(7); // o2 var1 == 0이므로 7+0=7
	
	o1.myMethod2(7); 
	
	o1.myMethod3(1, 2);
}
}
