package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book contains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Roy";
		String lastName = "Bennett";
		String SSN = "333221111";
		
		// Print the initials plus last 4 digits of SSN
		
		System.out.println(firstName.substring(0, 1));
		System.out.println(lastName.substring(0, 1));
		System.out.println(SSN.substring(5));

	}

}
