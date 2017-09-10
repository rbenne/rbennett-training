package basics;

public class Cities {

	public static void main(String[] args) {
		/*
		// Declare and define an array
		String[] cities = { "New York", "San Francisco", "Miami", "Dallas" };
		
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		// Declare array
		String[] countries;
		
		// Define the array
		countries = new String[3];
		countries[0] = "USA";
		countries[1] = "Canada";
		countries[2] = "UK";
		System.out.println(countries[1]);
		*/
		
		// Declare and define the array (only size)
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		
		// Do Loop: enters the loop THEN tests condition
		int i = 0;
		do {
			System.out.println("STATE: " + states[i]);
			i++;
		} while (i < 5); 
		
		// While Loop: Tests condition first then enters loop
		int n = 0;
		boolean stateFound = false;
		while (!stateFound) {
			String state = states[n];
			System.out.println(state);
			if (state == "Texas") {
				System.out.println("STATE FOUND!");
				stateFound = true;
			}
			n++;
		}
		
		// For Loop: best structure for iterating through an array
		for (int x = 0; x < 5; x++) {
			System.out.println("FOR LOOP STATE: " + x + " " + states[x]);
		}
		
		
		
		
	}

}
