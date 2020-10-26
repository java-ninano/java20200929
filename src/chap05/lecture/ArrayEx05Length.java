package chap05.lecture;

public class ArrayEx05Length {
public static void main(String[] args) {
	int[] arr1 = {99,88,77};
	int[] arr2 = {5,4,3,2,1};
	
	
	System.out.println(arr1.length); //method에 접근할때 .
	System.out.println(arr2.length);
	
	System.out.println("====================================");
	
	for(int i =0; i<arr1.length; i++) { //== for(int i =0; i<3; i++)
		System.out.println(arr1[i]);
	}
	
}
}
