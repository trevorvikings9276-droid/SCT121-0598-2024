import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Variable to store the user's menu choice
        int choice;

        // do-while loop ensures the menu is displayed at least once
        do {
            // Display the calculator menu
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Process the user's choice (skip input for Exit option)
            if (choice >= 1 && choice <= 4) {
                // Accept two numbers for the calculation
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();

                // Perform the selected operation using a switch statement
                switch (choice) {
                    case 1:
                        // Addition: num1 + num2
                        System.out.printf("Result: %.0f + %.0f = %.0f%n", num1, num2, num1 + num2);
                        break;
                    case 2:
                        // Subtraction: num1 - num2
                        System.out.printf("Result: %.0f - %.0f = %.0f%n", num1, num2, num1 - num2);
                        break;
                    case 3:
                        // Multiplication: num1 * num2
                        System.out.printf("Result: %.0f * %.0f = %.0f%n", num1, num2, num1 * num2);
                        break;
                    case 4:
                        // Division: num1 / num2 with division by zero check
                        if (num2 == 0) {
                            // Handle division by zero error
                            System.out.println("Error: Division by zero is not allowed!");
                        } else {
                            System.out.printf("Result: %.0f / %.0f = %.2f%n", num1, num2, num1 / num2);
                        }
                        break;
                }
            } else if (choice == 5) {
                // User chose to exit
                System.out.println("Thank you for using the calculator!");
            } else {
                // Handle invalid menu choices
                System.out.println("Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5); // Loop continues until user enters 5 (Exit)

        // Close the scanner
        scanner.close();
    }
}
