package chap03.binary;

public class DivideByZero {
public static void main(String[] args) {
	int x = 5;
	int y = 0;
	
	// int z = x / y;
	// int z = x % y;
	System.out.println("어떤 실행문......");
	
	double a = 5.0;
	double b = -0.0;
	
	// limit 0으로 나눔
	double c = a / b;
	System.out.println(c);
	
	double d = a % b;
	System.out.println(d);
	// Not A Number : NAN
}
}
