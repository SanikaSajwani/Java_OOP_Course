import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a positive integer to calculate factorial: ");
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);

            if (number <= 0) {
                throw new IllegalArgumentException("Number must be greater than zero.");
            }

            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter numeric values only.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
