import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    String stored_username = "User123";
    String stored_password = "Pass123";
    double balance = 1000.00;

    System.out.print("Enter Username: ");
    String username = s.nextLine();

    System.out.print("Enter Password: );
    String password = s.nextLine();

    if(!username.equals(stored_username) || !password.equals(stored_password)) {
      System.out.println("Invalid Credentials! Access Denied.");
      return;
    }

    while(true) {
      System.out.println("Main Menu \n**Welcome to Bank of Pakistan**");
      System.out.println("1. Deposit Money");
      System.out.println("2. Withdraw Amount");
      System.out.println("3. Account Status");
      System.out.println("4. Select your choice: ");
      int choice = s.nextLine();

      switch(choice) {
        case 1:
          System.out.print("Enter amount to deposit: ");
          double deposit = s.nextDouble();

          if (deposit > 0) {
            balance += deposit;
            System.out.println("Deposit Successful! New Balance is " + balance);
          } else {
            System.out.println("Invalid Amount!");
          } 
          break;

        case 2:
          System.out.println("Enter amount to withdraw: ");
          double withdraw = s.nextDouble();

          if (withdraw > 0 && withdraw <= balance) {
            balance -= withdraw;
            System.out.println("Withdrawal Successful! New balance: " + balance);
          } else {
            System.out.println("Invalid or insufficient funds!");
          }
          break;
          
        case 3:
          System.out.println("Account Holder: " + username);
          System.out.println("Current Balance: " + balance);
          break;

        case 4:
          System.out.println("Thank you for using our service! ");
          return;

        default:
          System.out.println("Invalid choice! Try again.");
      }
    }
  }
}
      
    
