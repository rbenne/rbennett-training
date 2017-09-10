package OOP;

public class BankAccount {
	
	// Define Variables
	String accountNumber;
	
	// static >> belongs to the CLASS not the object instance
	// final >> constant (often static final) 
	static final String routingNumber = "0151486";
	String name;
	String SSN;
	String accountType;
	
	// Constructor Definitions: unique methods
		// 1. They are used to define / setup / initialize properties of an object
		// 2. Constructors are IMPLICITLY called upon INSTANTIATION
		// 3. The same name as the class itself
		// 4. Constructors have NO return type
	BankAccount() {
		System.out.println("New account created!");	
	}
	// Overloading: call same method name with different arguments
	BankAccount(String accountType) {
		System.out.println("New account: " + accountType );
		
	}
	BankAccount(String accountType, double initDeposit) {
		System.out.println("NEW ACCOUNT: " + accountType);
		System.out.println("INITAL DEPOSIT: $" + initDeposit);
	}
	
	
	// Define Methods
	void deposit() {
		
	}
	
	void withdraw() {
		
	}
	
	void checkBalance() {
		
	}
	
	void getStatus() {
		
	}

}
