package chap11.string.textbook;

public class StringSubstringExample {
public static void main(String[] args) {
	 String ssn = "880815-1234567 ";
	 
	 String firstNum = ssn.substring(0,6);
	 System.out.println(firstNum);
	 
	 String secondNum =ssn.substring(7); //해당숫자부터 끝까지 출력
	 System.out.println(secondNum);
}
}
