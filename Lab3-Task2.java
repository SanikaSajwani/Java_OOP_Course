import java.util.*;

public class SwapNumber {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int num1 = s.nextInt();

    System.out.print("Enter Second Number: ");
    int num2 = s.nextInt();

    int temp = num1;
    num1 = numw2;
    num2 = temp;

    System.out.println("\nAfter Swapping: ");
    System.out.println("First Number: " + num1);
    System.out.println("Second Number: " + num2);
  }
}
