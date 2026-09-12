import java.util.Scanner;

/**
 * This program asks the user for the radius of a circle 
 * and tells the area.
 * @author Shem
 * @version 1.0
 * @since 2026-12-09
 */

public final class TryCatch {
    /**
     * This is a private constructor used to satisfy the 
     * style checker.
     * 
     * @exception IllegalStateException Utility class
     * @see IllegalStateException
     */
    private TryCatch() {
        throw new IllegalStateException("utility class");
    }

    /**
     * This is the main method.
     * 
     * @param args Unused
     */
    public static void main(String[] args) {
        // Welcome the user
        System.out.println("Welcome to Shem's program");
        System.out.print("Enter the radius of the circle (cm): ");

        // Using the scanner to get the input from user
        final Scanner scanner = new Scanner(System.in);
        final String radstring = scanner.nextLine();
    
        try {
            // Convert the string to a double 
            final double radDouble = Double.parseDouble(radstring);

            // If radius is negative, tell the user 
            if (radDouble < 0) {
                System.out.println("The radius cannot be negative.");
            } else {
                // Calculate the area 
                final double area = Math.PI * Math.pow(radDouble, 2);

                // Display the area, rounded to 2 decimal places
                System.out.print("The area of a circle with radius, ");
                System.out.print(radstring + "cm, is ");
                System.out.format("%.2f", area);
                System.out.println("cm^2.");
            }
        } catch (NumberFormatException error) {
            System.out.println("Please enter a valid radius. " + error.getMessage());
        } 
        
        // Closing Scanner
        scanner.close();
    }
}