import java.util.Scanner;
class student{
	public static void main(String args[]){
		System.out.println("STUDENT DETAILS: ");
		Scanner details = new Scanner(System.in);
		System.out.println("Enter your Name: ");
		String name = details.nextLine();
		System.out.println("Enter your Roll num: ");
		String rollnum =details.nextLine();
		System.out.println("Enter your Gender: ");
		String gender = details.nextLine();
		System.out.println("Enter your Date of Birth: ");
		String dob = details.nextLine();
		System.out.println("Enter your Age: ");
		int age = details.nextInt(); 
		System.out.println("Enter your Percentage: ");
		float percentage = details.nextFloat(); 
		System.out.println("Student name is:"+name);
		System.out.println("Student roll number is:"+rollnum);
		System.out.println("Student gender is:"+gender);
		System.out.println("Student age is:"+age);
		System.out.println("Student date of birth is:"+dob);
		System.out.println("Student percentage is:"+percentage+"%");
		details.close();
	}
}
