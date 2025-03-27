import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter a number: "); int num = s.nextInt();
    if (num <= 1) {
      System.out.println(num + " is not a prime number.");
      return;
    }

   boolean isPrime = true;
   for (int i = 2; i * i <= num; i++) {
     if (num % i == 0) {
       isPrime = false;
       break;
     }
   }

  if (isPrime) {
    System.out.println(num + " is a prime number.");
  } else {
    System.out.println(num + " is not a prime number.");
  }
}
}
