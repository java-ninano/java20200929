package chap05;

public class MatrixArrayEx01 {
	public static void main(String[] args) {
		int [][] matrix = new int [3][2]; //integer arr를 저장할수 있는 arr, matrix의 각 값은 배열, [행][열]
		
		int[] arr = new int [3];
		System.out.println(arr.length);
		
		System.out.println(matrix[0].length);
		System.out.println(matrix[1].length);
		System.out.println(matrix[2].length);
		
		arr[0] = 99;
		arr[1] = 88;
		arr[2] = 77;
		
		matrix[0][0] = 9;
		matrix[2][0] = 1;
		
	    // matrix[3][0] = 3;
		// matrix[2][2] = 4;
		
	}

}
