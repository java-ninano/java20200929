package chap06.lecture.textbook.s061401;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	myCar.setSpeed(-50);
	
	System.out.println("����ӵ�: "+ myCar.getSpeed());
	
	myCar.setSpeed(60);
	
	if(myCar.isStop()) {
		myCar.setStop(true);
	}
}
}
