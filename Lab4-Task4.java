import java.util.*;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner s = new Scanner(System.in);

    int randomNo = random.nextInt(100) + 1;
    int guess;

    System.out.println("Guess a number between 1 and 100: ");

    while (true) {
      System.out.print("Enter yout guess: ");
      guess = s.nextInt();

      if (guess > randomNo) {
        System.out.println("Too high, try again!");
      } else if (guess < random) {
        System.out.println("Too low, try again!");
      } else {
        System.out.println("Congratulations! Guessed it correctly.");
        break;
      }
    }
  }
}
