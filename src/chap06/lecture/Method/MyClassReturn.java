package chap06.lecture.Method;

public class MyClassReturn {

	int var1;
	
	void method1() { 
		System.out.println("�޼ҵ�1 ����");
	}
	
	
	int method2() { // return�� ���� �������� ����Ÿ���� �������־ �Ѵ�.
		System.out.println("�޼ҵ�2 ����");
		
		//return : �޼ҵ� ����, �����ʿ� �ִ� ���� ȣ���� ������ ������
		return var1*2;
	  
	}
	
	
	
	
	
	
	
	
	
	
}
