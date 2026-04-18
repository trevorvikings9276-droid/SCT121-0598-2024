import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        // Create Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Display section header
        System.out.println("=== LINEAR SEARCH ===");

        // Create and initialize the array with 10 predefined integers
        int[] arr = {23, 45, 12, 67, 34, 89, 56, 78, 90, 33};

        // Display the array contents
        System.out.print("Array: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", "); // Comma separator between elements
            }
        }
        System.out.println("]");

        // Accept the search key from the user
        System.out.print("Enter number to search: ");
        int searchKey = scanner.nextInt();

        // Linear search variables
        boolean found = false;     // Flag: true if element is found
        int foundIndex = -1;       // Index where element was found (-1 if not found)
        int comparisons = 0;       // Counter for number of comparisons made

        // Perform linear search: check each element from start to end
        for (int i = 0; i < arr.length; i++) {
            comparisons++; // Increment comparison counter for each element checked

            // Compare the current element with the search key
            if (arr[i] == searchKey) {
                found = true;      // Element found, set flag to true
                foundIndex = i;    // Record the index where it was found
                break;             // Exit the loop (we found the first occurrence)
            }
        }

        // Display the search results
        if (found) {
            // Element was found: display the index position
            System.out.println(searchKey + " found at index " + foundIndex);
        } else {
            // Element was not found
            System.out.println("Element not found");
        }

        // Display the total number of comparisons made during the search
        System.out.println("Total comparisons: " + comparisons);

        // Close the scanner
        scanner.close();
    }
}
