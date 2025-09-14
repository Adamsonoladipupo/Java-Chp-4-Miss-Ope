/*
Pseudocode
*/
import java.util.Scanner;
public class CreditLimitCalculator{
public static void main(String[] args){
System.out.println("Welcome! This app helps you know your credit limit");

Scanner input = new Scanner(System.in);

System.out.print("Enter account number: ");
int accountNumber = input.nextInt();

System.out.print("Enter account balance at the beginning of the month: ");
int accountBalance = input.nextInt();

System.out.print("Enter total item charged by the customer: ");
int itemsCharges = input.nextInt();

System.out.print("Enter total of all credits applied to: ");
int creditApplied = input.nextInt();

System.out.print("Enter allowed credit limite: ");
int creditLimit = input.nextInt();

int newBalance = accountBalance + itemsCharges - creditApplied;

System.out.printf("Your new account balance is %d %n", newBalance);

if (newBalance > creditLimit){
System.out.printf("Credit limit exceeded!");
}

}
}