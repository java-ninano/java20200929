package chap13.textbook.s130402;

public class CompareMethodExample {
public static void main(String[] args) {
	Pair <Integer. String>p1 = new Pair<Integer,String>(1, "사과");
	Pair <Integer. String>p2 = new Pair<Integer,String>(1, "사과");
	boolean result1 = Util.<Integer, String>compare(p1,p2);
}
}
