import java.util.Scanner;

/**
 * This program asks the user for the radius of a sphere
 * and calculates the volume using try-catch error handling.
 *
 * @author Shem
 * @version 1.0
 * @since 2026-12-09
 */
public final class TryCatch {

    /**
     * This is a private constructor used to satisfy the style checker.
     *
     * @throws IllegalStateException Utility class
     */
    private TryCatch() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(final String[] args) {
        // Welcome the user
        System.out.println("Welcome to Shem's program");
        System.out.print("Enter the radius of the sphere (cm): ");

        // Using try-with-resources to automatically close the scanner
        try (Scanner scanner = new Scanner(System.in)) {
            final String radString = scanner.nextLine();

            try {
                // Convert the string to a double
                final double radDouble = Double.parseDouble(radString);

                // Check for negative radius
                if (radDouble < 0) {
                    System.out.println("The radius cannot be negative.");
                } else {
                    // Calculate the volume of a sphere: (4/3) * pi * r^3
                    final double volume = (4.0 / 3.0) * Math.PI * Math.pow(radDouble, 3);

                    // Display the formatted result
                    System.out.printf("The volume of a sphere with radius %s cm is %.2f cm^3.%n",
                            radString, volume);
                }
            } catch (NumberFormatException error) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
    }
}
