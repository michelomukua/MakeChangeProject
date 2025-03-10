package MakeChange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double amountDue;
		double amountPaid;
		double changeDue;

		System.out.println("How much is the price?");
		amountDue = sc.nextDouble();

		System.out.println("How much was paid?");
		amountPaid = sc.nextDouble();

		if (amountPaid < amountDue) {
			System.out.println("Please this is not enough");
			System.out.println(" Error");
		} 
		else if (amountPaid == amountDue) {
			System.out.println("That is the correct price");
		 
		} else {
			System.out.print("Your change in pennies will be: ");
			
			// For calculations, all money is converted to pennies by (*100) 

			changeDue = amountPaid - amountDue;
			System.out.println(changeDue);

			int twenties, tens, fives, ones;
			
			twenties = (int) (changeDue / 2000);
			changeDue %= 2000;

			tens = (int) (changeDue / 1000);
			changeDue %= 1000;

			fives = (int) (changeDue / 500);
			changeDue %= 500;

			ones = (int) (changeDue / 100);
			changeDue %= 100;

			if (twenties == 1) {
				System.out.println(twenties + " $20 bill");
			}
			if (twenties > 1) {
				System.out.println(twenties + " $20 bills");
			}
			if (tens == 1) {
				System.out.println(tens + " $10 bill");
			}
			if (tens > 1) {
				System.out.println(tens + " $10 bills");
			}
			if (fives == 1) {
				System.out.println(fives + " $5 bill");
			}
			if (fives > 1) {
				System.out.println(fives + " $5 bills");
			}
			if (ones == 1) {
				System.out.println(ones + " $1 bill");
			}
			if (ones > 1) {
				System.out.println(ones + " $1 bills");
			}
			
			int quarters, dimes, pennies, nickels;
			
			quarters = (int) (changeDue / 25);
			changeDue %= 25;

			dimes = (int) (changeDue / 10);
			changeDue %= 10;

			nickels = (int) (changeDue / 5);
			changeDue %= 5;

			pennies = (int) (changeDue / 1);
			changeDue %= 1;
			
			if (quarters == 1) {
				System.out.println(quarters + " quarter");
			}
			if (quarters > 1) {
				System.out.println(quarters + " quarters");
			}
			if (dimes ==  1) {
				System.out.println(dimes + " dime");
			}
			if (dimes > 1) {
				System.out.println(dimes + " dimes");
			}
			if (pennies == 1) {
				System.out.println(pennies + " penny");
			}
			if (pennies > 1) {
				System.out.println(pennies + " pennies");
			}
			if (nickels == 1) {
				System.out.println(nickels + " nickel");
			}
			if (nickels > 1) {
				System.out.println(nickels + " nickels:");
			}
			sc.close();
			}
			

		}
	}

	// User Story #1
	// The user is prompted asking for the price of the item.

	// User Story #2
	// The user is then prompted asking how much money was tendered by the customer.

	// User Story #3
	// Display an appropriate message if the customer provided too little money or
	// the exact amount.

	// User Story #4
	// If the amount tendered is more than the cost of the item, display the number
	// of bills and coins that should be given to the customer. Denominations that
	// are not used will not be displayed.

	// Amount: .67, Tendered: .50, Result: Error message
	// Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
	// Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
	// Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill,
	// 1 one dollar bill, 4 pennies.
	// Amount: any amount less than 20.00, Tendered: anything greater than amount:
	// correct denominations for correct change.









