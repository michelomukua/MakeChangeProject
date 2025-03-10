# Make Change Project

## Description of the Application
	- Create an application that will take in amount of money paid by the customer, compare it against the price of the item to be purchased and refund change in appropriate denominations where possible

	User Story #1
	-The user is prompted asking for the price of the item.

	User Story #2
	- The user is then prompted asking how much money was tendered by the customer.
        User Story #3
	- Display an appropriate message if the customer provided too little money or
	the exact amount.
	User Story #4
	- If the amount tendered is more than the cost of the item, display the number
	of bills and coins that should be given to the customer. Denominations that
	 are not used will not be displayed.
	Amount: .67, Tendered: .50, Result: Error message
	Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
	Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
	Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill,
	1 one dollar bill, 4 pennies.
	Amount: any amount less than 20.00, Tendered: anything greater than amount:
	correct denominations for correct change.
	
	To run the program, enter the price of the item and the amount tendered by the customer. Return change if there are in denominations. if the tendered amount is less than the price, the program gives an error
## Technologies used
 - Java
 - Eclipse
 - Git/GitHub
 - Sublime Text Editor

## Concepts Applied
	- Conditional Statements: if and else
	- Scanner

## Lessons learned
	- Curly braces are very important
	- Use of scanner