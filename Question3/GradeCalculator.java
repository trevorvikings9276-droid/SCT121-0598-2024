import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);
        
        // Accept the student's marks
        System.out.print("Enter student's marks: ");
        int marks = scanner.nextInt();

        // Variables to store the grade and remark
        String grade;
        String remark;

        // Validate the input: marks must be between 0 and 100
        if (marks < 0 || marks > 100) {
            // Handle invalid marks with an error message
            System.out.println("Error: Invalid marks! Marks must be between 0 and 100.");
        } else if (marks >= 70) {
            // Grade A: marks between 70 and 100
            grade = "A";
            remark = "Excellent";
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        } else if (marks >= 60) {
            // Grade B: marks between 60 and 69
            grade = "B";
            remark = "Very Good";
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        } else if (marks >= 50) {
            // Grade C: marks between 50 and 59
            grade = "C";
            remark = "Good";
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        } else if (marks >= 40) {
            // Grade D: marks between 40 and 49
            grade = "D";
            remark = "Pass";
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        } else {
            // Grade E: marks between 0 and 39
            grade = "E";
            remark = "Fail";
            System.out.println("Grade: " + grade);
            System.out.println("Remark: " + remark);
        }

        // Close the scanner
        scanner.close();
    }
}
