package chap03.textbook;

public class CheckOverflowExample {
public static void main(String[] args) {
	try {
		int result =safeAdd(2_000_000_000, 2_000_000_000);
		System.out.println(result);
		// 실행이 가능한지 try! parameter값( , ) 
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
}

public static int safeAdd(int left, int right) {
	if(right>0) {
		if(left>(Integer.MAX_VALUE-right)) {
			throw new ArithmeticException("오버플로우 발생");	
		}
	}else {
		if(left<(Integer.MIN_VALUE-right)) {
			throw new ArithmeticException("오버프롤우 발생");	
		}
	}
	return left + right;
}
}
