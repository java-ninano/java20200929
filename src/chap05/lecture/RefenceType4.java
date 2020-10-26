package chap05.lecture;

public class RefenceType4 {
public static void main(String[] args) {
	
	String str1 = "java";
	String str2 = "java";
	String str3 = new String("java");
	
	System.out.println(str1== str2);
	System.out.println(str2== str3); //문자 자체를 비교
	
	System.out.println(str1.equals(str3)); // 저장 instant 비교
}
}
