package chap06.lecture.annotation;

public class AnnocationEX1 {
	
	private int i;
	
    //주석들........
	
	// annotation 
	
	@Override 
	@MyAnnotation
	//메소드에만 사용가능
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@MyAnnotation(value="abc", number =5, names= {"c", "d"}) //==("abc")
	public static void mymethod() {
		
	}
}
