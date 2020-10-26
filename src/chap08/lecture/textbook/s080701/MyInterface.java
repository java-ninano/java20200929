package chap08.lecture.textbook.s080701;

public interface MyInterface {
public void method1();

public default void method2() { //몸통이 있으니깐 override 하지않아도 된다. 
	System.out.println("MyInterface-method2");
}
}
