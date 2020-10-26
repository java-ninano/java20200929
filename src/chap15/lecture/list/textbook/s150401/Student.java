package chap15.lecture.list.textbook.s150401;

public class Student {
public int sno;
public String name;

public Student(int sno, String name) {
	this.sno = sno;
	this.name =name;
}
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		Student student = (Student) obj;
	}
}
}
