/*
Write a static method that has an integer as a parameter and returns the sum of the digits in that number. Then write code in a main method to test it.
*/
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = input.nextInt();
		System.out.println("The sum of the digits is : " + sums(a));
		input.close();
	}
	
	public static int sums(int num) {
		int tempsum = 0;
		do {
			tempsum += num % 10;
			num = num / 10;
		} while (num > 0);
		return tempsum;
	}

}
