package chap02.textbook;

public class TypeCastingEx2 {
	public static void main(String[] args) {
		int intValue = 3;
		long longValue = 55;
		
		// int intValue2= intValue + longValue
		long longValue2= intValue +longValue;
		
		double doubleValue = 3.14;
		
		// int intValue3 = intValue + doubleValue; (결과: 실수임으로 int type 불가)
		double doubleValue2= intValue + doubleValue;
		
		// 정수형의 연산결과는 int
		short shortValue1 = 3;
		short shortValue2 = 5;
		
		// short shortValue3 = shortValue1 + shortValue2; // 정수형의 연산결과는 int
		int intValue4 = shortValue1 + shortValue2;
		
		// longtype을 제외하고 정수형은 int (short+short = int)
		
	}
}
	
	
	
	
	

}
