import javax.swing.JOptionPane;// gives ready-made dialog boxes(input, message, confirm)

public class DialogBoxIO {
    public static void main(String[] args) {
            // Use showInputDialog() to ask the user for their favorite food
        // This creates a pop-up dialog box with an input field
        String food = JOptionPane.showInputDialog("Enter your favorite food:");

        // Use showInputDialog() to ask the user for their favorite color
        String color = JOptionPane.showInputDialog("Enter your favorite color:");

        // Build the result message using string concatenation
        String message = "Your favorite food is " + food
                + " and favorite color is " + color;

        // Use showMessageDialog() to display the result in a message dialog box
        // Parameters: parent component (null), message, title, message type
        JOptionPane.showMessageDialog(null, message,
                "Your Favorites", JOptionPane.INFORMATION_MESSAGE);

        // Also print the result to the console for reference
        System.out.println("[Dialog box shows: " + message + "]");

        // Exit the application (needed when using Swing components)
        System.exit(0);
    }
}
