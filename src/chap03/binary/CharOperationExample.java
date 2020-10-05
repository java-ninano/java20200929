package chap03.binary;

public class CharOperationExample {
public static void main(String[] args) {
	char c1 = 'A'+1; //리터럴 값끼리의 합은 계산가능
	char c2 = 'A';
	char c3 = (char) (c2+1); 
	//char + int =int
	System.out.println("c1="+c1);
	System.out.println("c2="+c2);
	System.out.println("c3="+c3);
}
}
