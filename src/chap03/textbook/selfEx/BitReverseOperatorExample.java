package chap03.textbook.selfEx;

public class BitReverseOperatorExample {
public static void main(String[] args) {
	int v1 = 10;
	int v2 = ~v1;
	int v3 = ~v1 +1;
	System.out.println(v1);
	System.out.println(v2);
	System.out.println(v3);
}
}
