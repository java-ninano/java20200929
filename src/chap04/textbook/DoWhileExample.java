package chap04.textbook;

import java.util.Scanner;

public class DoWhileExample {
public static void main(String[] args) {
	System.out.println("메세지를 입력하세요.");
	System.out.println("프로그램을 종료하려면 q를 입력하세요.");
	
	Scanner scanner = new Scanner(System.in);
	String inputString;
	
	do {
		System.out.println(">");
		inputString = scanner.nextLine();
		System.out.println(inputString);
	} while(!inputString.equals("q")); //while의 조건이 true이면 위에 조건으로
	
	
	System.out.println();
	System.out.println("프로그램 종료");
			
}
}
