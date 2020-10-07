package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전연산자(단항, o과 1을 반대로 변경)
		int i = 10; // 0000 0000 0000 0000 0000 0000 0000 1010
		int j = ~i; // 1111 1111 1111 1111 1111 1111 1111 0101
		System.out.println(j);

		// 이항
		// & and : 같은 자리의 bit가 1인 경우만 1, 나머지는 0
		// | or : 같은 자리의 bit가 1인 경우만 1, 나머지는 0
		// ^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 0
		// 피연산자 & 결과 : integer

		int a = 45;
		int b = 25;
		int c = a & b;
		System.out.println(c);

		c = a | b;
		System.out.println(c);

		c = a ^ b;
		System.out.println(c);

		// and 45: 0010 1101
		// and 25: 0001 1001

		// and : 0000 1001
		// or : 0011 1001
		// xor : 1100 1001

		// bit shift 연산자
		// << : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움
		// >> : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit)최상위 비트로 채움
		// >>>: 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움

		int val = 3; // 0000 0000 0000 0000 0000 0000 0000 0001
		int res = val << 3;
		System.out.println(res); // << 변수값의 *2(<<1)

		val = 16;
		res = val >>1;
		System.out.println(res);// >>1=*2 >>2=*4
		
		val = -17;
		res = val >>1;
		System.out.println(res);
		
		val = 98;
		res = val >>>2;
		System.out.println(res);
		
		val = -17;
		res = val>>>1;
		System.out.println(res);

	}
}
