package chap06.lecture.accessModifier;

public class MyClass {
    //����������
    //public, protected, (default/ package private), private
	//public : ��� �ܺ� Ŭ�������� ��밡��
	//(default): ���� ��Ű�� ���� �ܺ�Ŭ�������� ��밡��
	//private : Ŭ���� �������� ��밡��
	
	//field 3��
	public int var1;
	int var2;
	private int var3;
	
	void method1(){
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
	}
}
