package chap04.exercises;

public class Exercise06 {
public static void main(String[] args) {
	String star = "*";
	
	for(int i =0; i<=5; i++) {
		for( int j=0; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	
	
	/*for(int i=1; i<=5; i++) {
		if(i <=5) {
			System.out.println(star );
			star =star + "*";
		}
	}*/
	
}
}
