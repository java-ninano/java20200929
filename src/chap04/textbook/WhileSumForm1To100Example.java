package chap04.textbook;

public class WhileSumForm1To100Example {
public static void main(String[] args) {
	int sum = 0;
	
	int i =1;
	
	while(i<=100) {
		sum+=i;
		i++;
	}
	System.out.println("1~" +(i-1)+ "합:"+sum);
	// i = 101 -> (i-1)
}
}
