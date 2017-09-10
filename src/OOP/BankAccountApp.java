package OOP;

public class BankAccountApp {

	public static void main(String[] args) {
		// Creating a new bank account >> instantiate an object
		
		BankAccount acct1 = new BankAccount();
		
		BankAccount acct2 = new BankAccount("Checking Account");
		
		BankAccount acct3 = new BankAccount("Checking Account", 2000);
		
		System.out.println(acct1.routingNumber);
		System.out.println(acct2.routingNumber);
		System.out.println(acct3.routingNumber);

	}

}
