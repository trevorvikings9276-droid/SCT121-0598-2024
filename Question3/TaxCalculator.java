import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Accept the employee's gender
        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().toUpperCase().charAt(0);

        // Accept the employee's monthly salary
        System.out.print("Enter monthly salary: ");
        double salary = scanner.nextDouble();

        // Variables for tax rate and tax amount
        double taxRate = 0;
        double taxAmount = 0;
        String genderName = "";

        // Outer if-else: Check gender
        if (gender == 'M') {
            genderName = "Male";
            // Inner if-else: Check salary range for males
            if (salary < 30000) {
                taxRate = 0.10; // 10% tax for males earning less than 30000
            } else {
                taxRate = 0.15; // 15% tax for males earning 30000 and above
            }
        } else if (gender == 'F') {
            genderName = "Female";
            // Inner if-else: Check salary range for females
            if (salary < 25000) {
                taxRate = 0.08; // 8% tax for females earning less than 25000
            } else {
                taxRate = 0.12; // 12% tax for females earning 25000 and above
            }
        } else {
            // Handle invalid gender input
            System.out.println("Error: Invalid gender entered! Please enter M or F.");
            scanner.close();
            return; // Exit the program
        }

        // Calculate the tax amount: salary * tax rate
        taxAmount = salary * taxRate;

        // Calculate the net salary: salary - tax
        double netSalary = salary - taxAmount;

        // Display the results formatted as currency
        System.out.println("Gender: " + genderName);
        System.out.printf("Salary: KES %.2f%n", salary);
        System.out.printf("Tax (%.0f%%): KES %.2f%n", taxRate * 100, taxAmount);
        System.out.printf("Net Salary: KES %.2f%n", netSalary);

        // Close the scanner
        scanner.close();
    }
}
