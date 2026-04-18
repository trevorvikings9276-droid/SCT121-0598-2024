import java.util.Scanner;

public class ModulusOperator {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Display section header
        System.out.println("=== EVEN/ODD CHECKER ===");

        // Accept a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd using the modulus operator
        // If number % 2 equals 0, the number is even; otherwise, it is odd
        if (number % 2 == 0) {
            System.out.println(number + " is EVEN");
        } else {
            System.out.println(number + " is ODD");
        }

        // Check if the number is divisible by 5
        // If number % 5 equals 0, there is no remainder, so it's divisible by 5
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5");
        } else {
            System.out.println(number + " is NOT divisible by 5");
        }

        // Display the remainder when the number is divided by 3
        int remainder = number % 3;
        System.out.println(number + " divided by 3 gives remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
