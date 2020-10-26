package chap06.lecture.constructor;

public class Hero { // 설계도
	String name;
	int power;
	
	public Hero(String name, int power) {
		this.name = name; // this : instance 대체 키워드
		this.power= power;
	}
	
	public Hero(String name) {
		this(name, 100);
		
	}

}
