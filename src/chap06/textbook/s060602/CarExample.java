package chap06.textbook.s060602;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	
	
	System.out.println("����ȸ��: "+ myCar.company);
	System.out.println("�𵨸�: "+ myCar.model);
	System.out.println("����: "+ myCar.color);
	System.out.println("�ְ�ӵ�: "+ myCar.maxSpeed);
	System.out.println("����ӵ�: "+ myCar.speed);
	
	myCar.speed = 60;
	myCar.color = "������";
	System.out.println("������ �ӵ�: "+ myCar.speed);
	System.out.println(myCar.color);
}
}
