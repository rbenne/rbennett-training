package basics;

public class Factorials {

	public static void main(String[] args) {
		//The sum of numbers 1 to n
		int n = 2;
		System.out.println("The sum of the value " + n + " returns " + sum(n));
		
		// Factorial values
		int x = 5;
		System.out.println("The factorial of " + x + " equals " + fact(x));
		
		
		// Functions that take an array as a parameter
		int maxArray[] = { 500, 20, 115, 1000 };
		// Returns the Minimum value of the array
		maxValue(maxArray);
		// Returns the average value of the array
		minValue(maxArray);
		// Returns the maximum value of the array
		avgValue(maxArray);

	}
		
	public static int maxValue(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("The maximum value of this array is: " + max);
		return max;
	}
	
	public static int minValue(int[] array) {
		int min = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("The minimum value of this array is: " + min);
		return min;
	}
	
	public static int avgValue(int[] array) {
		int avg = 0;
		int arrayAvg = array.length;
		for(int i = 0; i < array.length; i++) {
			avg = array[i] + avg;
		}
		avg = avg / arrayAvg;
		System.out.println("The average of this array is: " + avg);
		return avg;
	}
	
	// Takes a value 'n' and returns the sum of numbers 1 to n
	public static int sum(int n) {
		int x = n + 1;
		return x;
	}
	
	// Computes the factorial value
	public static int fact(int n) {
		
		if(n == 0) {
			return 1;
		}
		else if (n == 1) {
			return 1;
		}
		return (fact(n - 1) * n);
	}
	
	


}
