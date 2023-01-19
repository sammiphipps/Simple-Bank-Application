import java.util.Scanner;

public class BankAccount {

	private String customerName; 
	private int customerId; 
	
	BankAccount(String customerName, int customerId){
		this.customerName = customerName; 
		this.customerId = customerId; 
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
			
			System.out.println(option); 
			
		} while (option != 5); 
	}
}
