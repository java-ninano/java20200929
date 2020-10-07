package chap04.textbook;

public class WhilePrintFrom1To10Example {
public static void main(String[] args) {
	int i =1;
	System.out.println("=========1번========");
	while (i<=10) { //조건이 true일때만 실행
		System.out.println(i);
		i++;
	}
	
	System.out.println("=========2번========");
	// 11~20
	while (i<=20) {
		System.out.println(i);
		i++;
	}
	
	
	System.out.println("=========3번========");
	// 1~9 홀수만
	int j =1;
	while (j<=9 ) {
		System.out.println(j);
		 j +=2;
	}
	
	System.out.println("=========4번========");
	//10~1
	int h =10;
	while (h>=1) {
		System.out.println(h);
		h--;
	}
	System.out.println("=========4번========");
	//10~2 짝수만
	int s=10;
	while (s>=2) {
		System.out.println(s);
		s -=2;
	}
}
}
