package chap10.textbooks.s100203;

public class NumberFormatExceptionExample {
public static void main(String[] args) {
	String data1= "100";
	String data2 = "200"; //a100
	
	int value1 = Integer.parseInt(data1); //integer로 변환시켜줌 : Integer.parseInt
	int value2 = Integer.parseInt(data2);
	
	int result = value1 +value2;
	System.out.println(data1 + "+" + data2 + "="+ result);
}
}
