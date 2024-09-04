/*
Write a guessing game program. The program should pick a random integer from 1 to 100. Then it asks the user for a number and says too low, too high, or correct. The user should be able to keep entering numbers until he/she answers correctly.
*/

import java.util.Random;
import java.util.Scanner;

public class Guessnumber {

	public static void main(String[] args) {

		Random random = new Random();

		int x = random.nextInt(100) + 1;

		Scanner input = new Scanner(System.in);
		int a;

		do {
			System.out.println("Guess number from 1 to 100: ");
			a = input.nextInt();

			if (a > x) {
				System.out.println("Too High！");
			}
			if (a < x) {
				System.out.println("Too Low！");
			}

		} while (a != x);

		System.out.println("Correct！");
		input.close();
	}

}
