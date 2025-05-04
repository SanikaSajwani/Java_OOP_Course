import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number as string: ");
            String str = scanner.nextLine();

            int number = Integer.parseInt(str);

            System.out.print("Enter another number to divide by: ");
            int divisor = scanner.nextInt();

            int result = number / divisor;
            System.out.println("Result = " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format. Please enter digits only.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        scanner.close();
    }
}
