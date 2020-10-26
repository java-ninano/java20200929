package chap07.lecture.s070706;

public class InstanceofExample {
	public static void method1(Parent parent) {
		if (parent instanceof Child) { //Parent !== Child, Child == Parent
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}

	public static void method2(Parent parent) {
		Child child = (Child) parent; //실행후 False값이 나와서 그대로 실행 종료
		System.out.println("method2 - Child로 변환 성공");
	}

	public static void main(String[] args) {
		Parent parentA = new Child(); //Parent == Child
		method1(parentA);
		method2(parentA);
	

	Parent parentB = new Parent();

     method1(parentB);
     method2(parentB);
}
}
