package chap06.lecture.s060705;

public class Car {
String company = "현대자동차";
String model;
String color;
int maxSpeed;

Car(){
	
}
Car(String model){
	this(model, "은색", 250); // this()==다른생성자, this.==필드
}
Car(String model, String color){
	this(model, color,250);
}
Car(String model, String color, int maxSpeed){
	this.model = model;
	this.color = color;
	this.maxSpeed = maxSpeed;
			
}
}
