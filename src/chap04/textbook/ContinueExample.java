package chap04.textbook;

public class ContinueExample {
public static void main(String[] args) {
	for(int i=1; i<=10; i++) {
		if(i%2 !=0) {
			continue; //loope안에 다음 실행해야했던 
		}
		System.out.println(i);
	}
}
}
