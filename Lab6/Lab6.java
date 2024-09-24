/*
Write a method that has a 2D array of Strings as a parameter that returns the length of the longest String in the array.
Write a method that has a square 2D array as the parameter. The method returns a 1D array containing all the elements from the diagonal from the top left to the bottom right of the 2D array.
(Challenge Problem) Write a method that has a square 2D array as a parameter that returns a 2D array of the same size, but rotated 90 degrees clockwise.
*/

package labs;

public class Lab6 {

	public static void main(String[] args) {
		String[][] stringArray = {{"One", "Two", "Three"}, {"Four", "Five", "Six"}};
		System.out.println(getLongestStringLength(stringArray));
		int[][] squareArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		printArray(getDiagonal(squareArray));
		printArr2D(rotateArray(squareArray));
	}
	
	public static void printArray(int[] arr) {
		for(int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	public static void printArr2D(int[][] arr) {
		for(int[] row : arr) {
			printArray(row);
		}
	}
	//Write a method that has a 2D array of Strings as a parameter that returns the length of the longest String in the array.
	public static int getLongestStringLength(String[][] arr) {
		int result = arr[0].length;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length > result) {
				result = arr[i].length;
			}
		}
		return result;
	}
	//Write a method that has a square 2D array as the parameter. The method returns a 1D array containing all the elements from the diagonal from the top left to the bottom right of the 2D array.
	public static int[] getDiagonal (int [][] arr) {
		int sizes = arr.length; 
		int [] result = new int [sizes];
		for (int i = 0; i < sizes; i++) {
				result[i] = arr[i][i];

		}
		return result;
	}
	//(Challenge Problem) Write a method that has a square 2D array as a parameter that returns a 2D array of the same size, but rotated 90 degrees clockwise.
	public static int[][] rotateArray (int [][] arr){
		int sizes = arr.length;
		int [][] result = new int [sizes][sizes];
		for (int i = 0; i< sizes; i++) {
			for (int j = 0; j < sizes; j++) {
			result[i][j] = arr[sizes-1-j][i];
			}
		}
		return result;
	}		
}

/* outcome:
3
1 5 9 
7 4 1 
8 5 2 
9 6 3 
*/
