package basics;

public class NumbersCalc {
	
	public static void main(String[] args) {
		System.out.println("The program is starting.");
		printName();
		
		int numA = 20;
		int numB = 20;
		addNumbers(numA, numB);
		
		int product = multiplyNumbers(numA, numB);
		System.out.println("The product of two numbers is: " + product);
	}
	
	static void printName() {
		System.out.println("My name is Roy.");
	}
	
	// This function will add two numbers
	static void addNumbers(int a, int b) {
		int c = a + b;
		System.out.println("The sum of the numbers " + a + " and " + b + " is " + c);
	}
	
	// Has an int return type which stores the product into the method
	static int multiplyNumbers(int a, int b) {
		addNumbers(a,b);
		int c = a * b;
		return c;
		
	}
	

}
