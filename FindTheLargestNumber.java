/*
Pseudocode
- display a welcome message to the user and an highlight on what the app is for
- continously ask the user for inputs (10 numbers) and store them in a variable
- create a new variable to store the largest number (LargestNumber)
- print the value holds by the largest variable.
*/

import java.util.Scanner;

public class FindTheLargestNumber{
public static void main (String[] args){
System.out.println("Welcome! This app helps you find the largest number within a set of numbers");
System.out.println("Enter a given set of numbers");

Scanner input = new Scanner(System.in);
int number = 0;
int counter = 0;
int largestNumber = 0;

while (counter < 10){
System.out.print("Enter number: ");
number = input.nextInt();
counter ++;

// checking for the largest number
largestNumber = number;
if (number > largestNumber ){
largestNumber =  number;
}

}

System.out.printf("The lastest number is: %d", largestNumber);
}
}