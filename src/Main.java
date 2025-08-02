//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Main Branch!\n");

        System.out.println("Activity_1\n");

        System.out.println("Enter your Student ID:");
        String studentid = scan.nextLine();
        System.out.println("Enter Student's First Name:");
        String firstName = scan.nextLine();
        System.out.println("Enter Student's Last Name:");
        String lastName = scan.nextLine();
        System.out.println("Enter Course:");
        String course = scan.nextLine();
        System.out.println("Enter Section:");
        String section = scan.nextLine();

        System.out.println("\nSTUDENT INFORMATION");
        System.out.println("Student Id: " + studentid);
        System.out.println("Student name: " + firstName + " " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);


        System.out.print("\nEnter Midterm Exam Score: ");
        int midtermScore = scan.nextInt();

        System.out.print("Enter Final Exam Score: ");
        int finalScore = scan.nextInt();

        System.out.print("Enter Project Score: ");
        int projectScore = scan.nextInt();

        System.out.print("Enter Attendance Percentage: ");
        int attendanceScore = scan.nextInt();

        double averageScore = (midtermScore + finalScore + projectScore + attendanceScore) / 4.0;
        String remarks = averageScore < 75 ? "FAILED" : "PASSED";

        System.out.println("\nSTUDENT SCORE");
        System.out.println("Midterm Exam Score: " + midtermScore);
        System.out.println("Final Exam Score: " + finalScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);

        System.out.println("\nAverage Score: " + averageScore);
        System.out.println("Remarks: " + remarks);
    }
}