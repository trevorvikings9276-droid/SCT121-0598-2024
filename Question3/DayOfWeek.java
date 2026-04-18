import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Accept a number from 1 to 7
        System.out.print("Enter number (1-7): ");
        int day = scanner.nextInt();

        // Use switch statement to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break; // Exit switch after printing Monday
            case 2:
                System.out.println("Tuesday");
                break; // Exit switch after printing Tuesday
            case 3:
                System.out.println("Wednesday");
                break; // Exit switch after printing Wednesday
            case 4:
                System.out.println("Thursday");
                break; // Exit switch after printing Thursday
            case 5:
                System.out.println("Friday");
                break; // Exit switch after printing Friday
            case 6:
                System.out.println("Saturday");
                break; // Exit switch after printing Saturday
            case 7:
                System.out.println("Sunday");
                break; // Exit switch after printing Sunday
            default:
                // Default case handles invalid input (any number not 1-7)
                System.out.println("Invalid input! Please enter a number between 1 and 7.");
                break;
        }

        // Close the scanner
        scanner.close();
    }
}
