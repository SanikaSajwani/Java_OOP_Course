class Accounts {
    double balance = 0;

    void debit(double amount) { // Withdraw Amount
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Debited: " + amount);
        }
    }

    void credit(double amount) { // Deposited Amount
        balance += amount;
        System.out.println("Credited: " + amount);
    }

    double getBalance() {
        System.out.println("Balance: " + balance);
        return balance;
    }
}

class SavingAccount extends Accounts {
    int timeSpan;
    final double interestRate = 0.06; 

    public SavingAccount(int timeSpan) {
        this.timeSpan = timeSpan;
    }

    double calculateInterest() {
        return balance * interestRate * timeSpan;
    }

    @Override
    void credit(double amount) {
        balance += amount; 
        double interest = calculateInterest(); 
        balance += interest; 
        System.out.println("Credited: " + amount + " + Interest: " + interest);
    }
}

public class Lab9 {
    public static void main(String[] args) {
        SavingAccount acc = new SavingAccount(2); 
        acc.credit(20000);
        acc.debit(100);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}
