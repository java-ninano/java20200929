package chap10.lecture.throwsKeyword;

public class ThrowsEx1 {
public static void main(String[] args) throws ClassNotFoundException {
	method1();
}

public static void method1() throws ClassNotFoundException{
	method2();
}
public static void method2()throws Exception{
	method3();
}
public static void method3() throws ClassNotFoundException, FileNotFoundExeption {
	Class.forName("java.lang.String");
	FileReader fr = new FileReader("file.txt")
}
}
