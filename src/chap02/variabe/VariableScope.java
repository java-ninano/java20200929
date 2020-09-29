package chap02.variabe;

public class VariableScope {
	public static void main(String[] args) {
		// 변수의 사용 범위
		// 선언된 코드 블럭 안에서만 사용 가능
		
	int a = 3;
	
	if(true) {
		int b = 5;
		System.out.println(a);
		System.out.println(b);
	}
	
	System.out.println(a);
	// System.out.println(b);
	// if 함수에 선언된 b는 코드블럭안에서만 사용 가능
	// 두번째 println에서 b는 오류
	}
}

