package chap15.lecture.exercise.p08;

public class Student {
public int studentNum;
public String name;

public Student(int student, String name) {
	this.studentNum =studentNum;
	this.name =name;
}
@Override
	public int hashCode() {
		return studentNum.hashCode() + name;
		
	}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Student) {
		Student student =(Student)obj;
		return Student.studentNum.equal(name) && (student.name== name);
	}
}else {
	return false;
}
}
