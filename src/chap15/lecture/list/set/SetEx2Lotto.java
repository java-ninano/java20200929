package chap15.lecture.list.set;

import java.util.HashSet;
import java.util.Set;

public class SetEx2Lotto {
public static void main(String[] args) {

	Set<Integer> set = new HashSet<>();
	
	
	
	while(set.size() <6) {
	int num = getNumber();
	System.out.println(num);
	}
	
	System.out.println("size: "+ set.size());
	
}
public static int getNumber() {
	return (int) (Math.random() *45) +1;
}

}
