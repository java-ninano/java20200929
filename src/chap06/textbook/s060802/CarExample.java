package chap06.textbook.s060802;

public class CarExample {
public static void main(String[] args) {
	Car myCar =new Car();
	
	myCar.setGas(5);
	
	boolean gasState = myCar.isLeftgas();
	if(gasState) {
		System.out.println("����մϴ�.");
		myCar.run();
	}
	if(myCar.isLeftgas()) {
		System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
	}else {
		System.out.println("gas�� �����ϼ���.");
	}
}
}
