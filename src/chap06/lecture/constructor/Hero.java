package chap06.lecture.constructor;

public class Hero { // ���赵
	String name;
	int power;
	
	public Hero(String name, int power) {
		this.name = name; // this : instance ��ü Ű����
		this.power= power;
	}
	
	public Hero(String name) {
		this(name, 100);
		
	}

}
