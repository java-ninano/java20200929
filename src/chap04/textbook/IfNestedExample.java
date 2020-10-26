package chap04.textbook;

public class IfNestedExample {
public static void main(String[] args) {
	int score = (int) (Math.random()*20) +81;
	
	String grade;
	if(score>=90) {
		if(score>=95) {
			grade = "A+";
		}else {
			grade = "A";
		}
	}else {
		if(score>=85) {
			grade = "B+";
		}else {
			grade ="B";
		}
	}
	System.out.println("학점은: "+ grade +"입니다. " +"점수는: "  + score+"입니다.");
}
}
