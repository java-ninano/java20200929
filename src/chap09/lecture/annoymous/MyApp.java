package chap09.lecture.annoymous;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();
		
		Parent p2 = new Parent() {
			@Override
			public void method1() {
				System.out.println("annoymous method1");
				
			}
		};
		
		p2.method1();
		
		Parent p3 = new Parent() {
			
		};
	}
}
