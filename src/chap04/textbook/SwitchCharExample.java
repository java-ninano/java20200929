package chap04.textbook;

public class SwitchCharExample {
	public static void main(String[] args) {
		int ran =(int) (Math.random() * 3);
		System.out.println("[이번 학점은: "+ran +"입니다]");
		char grade = ' ';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("축하합니다. 열심히 공부하셨군요?.");
			break;
		case 'B':
		case 'b':
			System.out.println(" 더 분발하세요.");
			break;
		default:
			System.out.println("공부하세요");
		}
	}
}
