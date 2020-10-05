package chap02.type.casting;

public class FromInToDouble {
public static void main(String[] args) {
	int num1 = 1234556780;
	int num2 = 1234556780;
	
	double num3 = num2;
	num2 = (int) num3;
	
	int result = num1 - num2;
	System.out.println(result);
}
}
