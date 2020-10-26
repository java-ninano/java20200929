package chap05.lecture;

public class ReferenceType05 {
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = new String("java");

		str2 = null; // 참고하고 있는 instance가 없다. 
		
		//java virtual machine은
		//불필요한 instance를 모아 제거함
		//==> garbage collector(GC)

		int i = 3;
		i = 0;

	}
}
