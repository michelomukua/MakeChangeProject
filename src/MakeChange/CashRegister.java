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

		}
		else if (amountPaid == amountDue) {
			System.out.println("THis is price is right");
		}
		else {
			System.out.println("You will get some change back");
			//USER STORY 4 BEGIN
			
					
			changeDue = amountPaid - amountDue;
			System.out.println(changeDue);
			System.out.println("This is little");
			int twenties, tens, fives, ones; 
			
			twenties = (int) (changeDue/ 20); 
			changeDue %= 20;
			
			tens = (int)(changeDue/ 10); 
			changeDue %= 10;
			
			fives = (int) (changeDue/ 5);
			changeDue %= 5;
			
			ones = (int)(changeDue/ 1);
			changeDue %= 1;
		
			if (twenties > 0) {
				System.out.println("Twenties: " + twenties);
			if (tens >0) {
				System.out.println("Tens:" + tens);
			if (fives > 0) {
				System.out.println("Fives:" + fives);
			if (ones > 0) {
				System.out.println("Ones:" + ones);
				}
			}
			}
				
			}
			
			
			
			

			
			//USER STORY 4 END
			
			
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

}