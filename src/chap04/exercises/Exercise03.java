package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 0; i <= 100; i += 3) {
			if( i % 3 ==0) {
				sum += i;
			}
			
		}
		System.out.println("3의배수의 합" + sum);
	}
}


