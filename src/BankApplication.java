import java.util.Scanner; 

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in).reset(); 
		
		//Request customer Name and customerId
		System.out.print("Please provide name: "); 
		String customerName = sc.next();
		sc.nextLine();
		
		System.out.print("What is your customerId: "); 
		int customerId = sc.nextInt(); 
		sc.nextLine(); 
		
		//Initialize Bank Account 
		BankAccount account = new BankAccount(customerName, customerId); 
		
		account.showMenu(sc);
		
		sc.close(); 
		
	}

}
