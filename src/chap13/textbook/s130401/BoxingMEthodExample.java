package chap13.textbook.s130401;

public class BoxingMEthodExample {
public static void main(String[] args) {
	Box<Integer>box1 = Util<Integer>boxing(100);
	int intvalue = box1.get();
	
	Box<Integer>box2 = Util boxing("홍길동");
	String  str = box2.get();
}
}
