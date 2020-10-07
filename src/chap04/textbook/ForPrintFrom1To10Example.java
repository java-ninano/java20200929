package chap04.textbook;

public class ForPrintFrom1To10Example {
	public static void main(String[] args) {
		// 1 ->2 ->code ->3 ->2
		System.out.println("==========1번 문제=============");
		for(int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("==========2번 문제=============");
		// 11~20
		for (int i = 11; i<=20; i++) {
			System.out.println(i);
		}
		System.out.println("==========3번 문제=============");
		// 1~10 홀수만
		for(int i=1; i<=9; i=+2) {
			System.out.println(i);
		}
		/* for (int i =1; i<=10; i++) {
			if(i%2==1) System.out.println(i+ "");
		}*/
			
		System.out.println("==========4번 문제=============");
	   // 10~1
		for (int i =10; i>=1; i--) {
			System.out.println(i);
		}
		System.out.println("==========5번 문제=============");
				//10~2 짝수만
		for(int i=10; i>=2; i-=2) {
			System.out.println(i);
		/* for(int i=10; i<=2; i++) {
			if(i%2==0) System.out.println(i+ "");*/
		}
	}
}
