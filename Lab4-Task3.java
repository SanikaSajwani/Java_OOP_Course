import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter base: "); int base = s.nextInt();
    System.out.print("Enter Exponent: "); int exp = s.nextInt();

    System.out.print(base + " raised to the power " + exp + " is: "); 
    int result = 1;
    for (int i = 0; i < exp; i++) {
      result *= base;
    }

    System.out.print(result);
  }
}
