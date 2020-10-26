package chap04.textbook;

public class WhileKeyControlExample {
	public static void main(String[] args) throws Exception {
		/*
		System.out.println("입력>");
		int i = System.in.read();
		int j = System.in.read();
		int k = System.in.read();
		
		System.out.println("출력");
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		*/
		
		boolean run = true;
		int speed = 0;
		int KeyCode= 0;
		
		while(run) {
			if(KeyCode !=13 && KeyCode !=10) {
				System.out.println("------------------------------");
				System.out.println("1.증속 | 2.가속 |3.중지");
				System.out.println("------------------------------");
				System.out.print("선택:");
				
				
			}
			KeyCode = System.in.read();
			
			if(KeyCode == 49) {
				speed++;
				System.out.println("현재속도="+ speed);
			}else if (KeyCode == 50) {
				speed--;
				System.out.println("현재속도="+speed);
			}else if (KeyCode==51) {
				run=false;
			}
		}
		System.out.println("프로그램 종류");
	}
}
