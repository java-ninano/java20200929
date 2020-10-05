package chap03.binary;

public class InfinityAndNaNCheckExample {
public static void main(String[] args) {
	int x = 5;
	double y = 0.0;
	
	double z = x / y; // z: 5/0=infinite
	double a = x % y;
	
	System.out.println(Double.isFinite(z));
	System.out.println(Double.isNaN(z));
	
	System.out.println(Double.isFinite(a));
	System.out.println(Double.isNaN(a));
	
	System.out.println(z+2);
	
	// ctrl + f : 검색
	// shift + enter : back
	
}
}
