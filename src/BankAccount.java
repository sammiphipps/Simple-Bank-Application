import java.util.Scanner;

public class BankAccount {

	private String customerName; 
	private int customerId; 
	private int balance; 
	private int previousTransaction; 
	
	BankAccount(String customerName, int customerId){
		this.customerName = customerName; 
		this.customerId = customerId; 
	}
	
	public void checkBalance() {
		System.out.println("Balance : " + this.balance); 
	}
	
	public void deposit(int amount) {
		if (amount >= 0) {
			this.balance += amount; 
			this.previousTransaction = amount; 
			System.out.println("Your new balance is " + this.balance); 	
		} else {
			System.out.println("Cannot deposit a negative amount."); 
		}
	}
	
	public void withdrawl(int amount) {
		if (amount >= 0) {
			if (amount < this.balance) {
				this.balance -= amount; 
				this.previousTransaction = -amount; 
				System.out.println("Your new balance is " + this.balance); 	
			} else {
				System.out.println("Amount you would like to withdrawl exceeds the current account balance."); 
			}
		} else {
			System.out.println("Cannot withdrawl a negative amount."); 
		}
	}
	
	public void previousTransaction() {
		if (this.previousTransaction > 0) {
			System.out.println("Deposited : " + Math.abs(this.previousTransaction)); 
		} else if (this.previousTransaction < 0) {
			System.out.println("Withdrawn : " + Math.abs(this.previousTransaction)); 
		} else {
			System.out.println("No transaction has occured."); 
		}
	}
	
	public void showMenu(Scanner sc) {
		int option = 0; 
		
		System.out.println(); 
		System.out.println("************************************************************"); 
		System.out.println(); 
		System.out.println("Welcome " + this.customerName); 
		System.out.println("Your Id is " + this.customerId); 
		System.out.println("\n"); 
		System.out.println("Available Menu Options: "); 
		System.out.println("1. Check Balance"); 
		System.out.println("2. Deposit"); 
		System.out.println("3. Withdrawl"); 
		System.out.println("4. View Previous Transaction"); 
		System.out.println("5. Exit"); 
		System.out.println();
		System.out.println("************************************************************"); 
		
		do {
			System.out.println("\n"); 
			System.out.print("Enter option: "); 
			option = sc.nextInt(); 
			sc.nextLine(); 
			
			switch(option) {
			
				case 1: 
					this.checkBalance();
					break; 
				case 2: 
					System.out.print("Enter amount which you would like to deposit : "); 
					int depositAmount = sc.nextInt(); 
					System.out.println(); 
					sc.nextLine(); 
					this.deposit(depositAmount);
					break; 
				case 3: 
					System.out.print("Enter amount which you would like to withdrawl : ");
					int withdrawlAmount = sc.nextInt(); 
					System.out.println(); 
					sc.nextLine(); 
					this.withdrawl(withdrawlAmount); 
					break;
				case 4: 
					this.previousTransaction(); 
					break;
				case 5: 
					System.out.println("Thank you for using our services."); 
					break; 
				default: System.out.println("Invalid Option. Please choose a valid menu option."); 
					
			}
			
		} while (option != 5); 
	}
}
