package StudentDatabase;
import java.util.Random;

public class Student {
	
	private String name;
	private String userId;
	private static int iD = 1000;		// Set a private static ID 
	private String eMail;
	private String SSN;
	private String phone;
	private String city;
	private String state;
	private double balance;
	private String course;
	
	// Student constructor that takes name and SSN in the arguments
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		iD++;
		
		setStudentEmail(); // Method to automatically create an e-mail address base on the name
		setStudentId(); 	// Method to generate a random userID
	}
	
	//Automatically create an email ID based on the name
	private void setStudentEmail() {
		eMail = name.toLowerCase().replaceAll(" ", "_") + "@university.com";
		System.out.println("Your Student E-mail Address: " + eMail);
	}
	
	// Generate a userID that is in combination of userId + 
	// random 4-digit number between 1000-9000 + last 4 of SSN
	private void setStudentId() {
		Random random = new Random();
		int randomNumber = random.nextInt(9000) + 1000;
		userId = iD + "" + randomNumber + SSN.substring(5, 9);
		System.out.println("Your Student UserID: " + userId);
	}
	
/*---------------------------------------------------------------------------------------*/
	
	// Use encapsulation to set variables (phone, city, state)
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

/*---------------------------------------------------------------------------------------*/

	// Methods: enroll(), pay(), checkBalance(), toString(), showCourses()
	public void enroll(String course) {
		System.out.println("You have enrolled into: " + course);
		this.course = course;
		this.balance = this.balance + 10000;
	}
	
	public void pay(double amount) {
		balance = balance - amount;
		System.out.println("Payment received: $" + amount);
		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Current Balance: $" + balance);
	}
	
	public void showCourses() {
		System.out.println("Currently enrolled in: " + this.course);
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + "]\n[Student Number: " + userId + "]\n" +
				"[Student E-Mail: " + eMail + "]\n" + "[Phone Number: " + phone + "]\n" +
				"[City: " + city + "]\n" + "[State: " + state + "]\n" + "[Courses: " + course + "]\n" + 
				"[Balance: $" + balance + "]\n";
	}

}
