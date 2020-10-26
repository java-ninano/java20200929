package chap06.textbook.s060801;

public class CalculatorExample {
public static void main(String[] args) {
	Calculator myCalc = new Calculator();
	myCalc.powerOn();
	
	int result1= myCalc.plus(5, 6);
	System.out.println("result1:" + result1);
	
	byte x = 10;
	byte y = 4;
	double result2 = myCalc.divide(x, y); //parameter가 있기 때문에 divide(x, y)입력
	System.out.println("result2: "+ result2);
	
	myCalc.powerOff();
}
}
