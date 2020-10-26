package chap06.lecture.Method.overloading;

public class MyClass {
void method1() {
	System.out.println("method1.......");
}

void method1(int i) { // parameter를 달리 해야한다. 
	System.out.println("method1####");
}

void method1(double j) { // parameter의 타입이 달라야한다.
	System.out.println("method1**************");
}
void method1(int i, int j) {
	System.out.println("method1 int, int");
}
void method1(int i, double j) {
	System.out.println("method1 int, double");
}
void method1(double i, int j) { //overloading 
	System.out.println("method1 double, int");
}
//int method1(double i , int j) {
//System.out.println("method1 double, int");
//return; //return 타입으로 차이를 줄 수 없음.
}

