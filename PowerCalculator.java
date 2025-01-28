import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input base and exponent
        System.out.print("Enter the base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();

        // Calculate the power
        double result = Math.pow(base, exponent); // Intentional error: Incorrect method name (poww)

        // Display the result
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);

        scanner.close();
    }
}

