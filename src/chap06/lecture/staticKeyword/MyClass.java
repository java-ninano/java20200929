package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1;
	
	static { // ���α׷� ����� �������� ����, static �ʱⰪ�� �������ִ� �ڵ��Է°���
		System.out.println("static block");
		var2 = 3000;
		
	}

	void method1() {
		System.out.println(var1);
	}
	
	static void method2() { //class�� ������ �ִ� ���
		// System.out.println(var1); // static -> instance�� ���� �Ұ�
		System.out.println(var2); //instance member ->class member�� ���ٰ���
		
	}
}
