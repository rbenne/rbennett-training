package StudentDatabase;

public class StudentDatabase {

	public static void main(String[] args) {
		
		Student newStudent = new Student("Roy Bennett", "55555555");
		
		System.out.println("Adding code to my project");
		System.out.println("Adding code to my project from GitHub");

		
		newStudent.setPhone("732-351-3517");
		newStudent.setCity("Tinton Falls");
		newStudent.setState("New Jersey");
		newStudent.enroll("Discrete Mathematics");
		newStudent.checkBalance();
		newStudent.showCourses();
		newStudent.pay(300.00);
		
		
		System.out.println(newStudent.toString());
		

	}

}
