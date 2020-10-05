package chap03.textbook;

public class OverflowExample {
public static void main(String[] args) {
	long x = 1000000;
	long y = 1000000;
	long z = x * y;
	System.out.println(z);
	
	// int로 지정하면 오버플로우 발생!
	// int x = 1000000;
	// int y = 1000000;
	// int z = x * y;
	// System.out.println(z);
}
}
