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
