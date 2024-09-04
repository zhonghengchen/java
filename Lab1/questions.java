/*
Write a program to determine what happens if you divide a double by 0.
Write a program that asks the user for their name, then says Hello with their name.
Write a program that asks the user for three integers, then outputs their sum in a sentence.
*/

import java.ulti.Scanner;

public class questions {

  public static void main(String[] args){
  //Write a program to determine what happens if you divide a double by 0.
  double a = 1;
  double b = a /0;
  System.out.println(b);

  //Write a program that asks the user for their name, then says Hello with their name.
  Scanner name = new Scanner(System.in);
  System.out.println("What is your name?");
  String username = name.nextLine();
  System.out.println("Hello " + username);
  name.close();

  //Write a program that asks the user for three integers, then outputs their sum in a sentence.
  Scanner integers = new Scanner(System.in);
  int firstint = integers.nextInt();
  int secondint = integers.nextInt();
  int thirdint = integers.nextInt();
  int sum = firstint + secondint + thirdint;
  System.out.println("The sum of your input is " + sum);
  integers.close();

  }
}
