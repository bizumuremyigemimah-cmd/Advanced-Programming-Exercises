package Exercise3;
import java.util.Scanner;
public class StudentTranscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter student name: ");
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        System.out.print("Enter mark for Java: ");
        double java = input.nextDouble();

        System.out.print("Enter mark for Database: ");
        double database = input.nextDouble();

        System.out.print("Enter mark for Networking: ");
        double networking = input.nextDouble();

        double total = java + database + networking;
        double average = total / 3;

        System.out.println("\n===== STUDENT TRANSCRIPT =====");
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);

        System.out.println("------------------------------");
        System.out.println("Java:       " + java);
        System.out.println("Database:   " + database);
        System.out.println("Networking: " + networking);

        System.out.println("------------------------------");
        System.out.println("Total:      " + total);
        System.out.println("Average:    " + average);

        if (average >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }

        input.close();
	}

}
