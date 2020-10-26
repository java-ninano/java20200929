package chap06.textbook.s060801;

public class Calculator {
void powerOn() {
	System.out.println("전원을 킵니다"); 
	// powerOn은 return 값이 없어도 됨으로 리턴타입에 void가 온것이다. 
}

int plus(int x, int y) {// 리턴타입 메소드명 + return값, int= result의 타입이 같아야한다. 
	int result = x+y;
	return result;
}

double divide(int x, int y) {
	double result = (double)x / (double)y;
//   int result   =divide(10, 20); : 컴파일 에러
	return result;
}

void powerOff() {
	System.out.println("전원을 끕니다.");
}
}
