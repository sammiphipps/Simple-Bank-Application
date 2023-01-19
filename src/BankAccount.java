import java.util.Scanner;

public class BankAccount {

	private String customerName; 
	private int customerId; 
	
	BankAccount(String customerName, int customerId){
		this.customerName = customerName; 
		this.customerId = customerId; 
	}
	
	public void checkBalance() {
		System.out.println("Check Balance Method"); 
	}
	
	public void deposit() {
		System.out.println("Deposit Amount"); 
	}
	
	public void withdrawl() {
		System.out.println("Withdrawl Amount"); 
	}
	
	public void previousTransaction() {
		System.out.println("View Previous Transaction"); 
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
					this.deposit();
					break; 
				case 3: 
					this.withdrawl(); 
					break;
				case 4: 
					this.previousTransaction(); 
					break; 
					
			}
			
		} while (option != 5); 
		
		System.out.println("Thank you for using our services."); 
	}
}
