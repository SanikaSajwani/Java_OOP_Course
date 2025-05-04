import java.util.Scanner;

public class AveragePurchase {
    private double[] purchases;

    public AveragePurchase(int size) {
        purchases = new double[size];
    }

    public void inputPurchases() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < purchases.length; i++) {
            System.out.print("Enter purchase amount " + (i + 1) + ": ");
            purchases[i] = scanner.nextDouble();
        }
    }

    public void displayPurchases() {
        System.out.println("Today's Purchases:");
        for (double amount : purchases) {
            System.out.println("Rs. " + amount);
        }
    }

    public double calculateAverage() {
        double total = 0;
        for (double amount : purchases) {
            total += amount;
        }
        return total / purchases.length;
    }

    public static void main(String[] args) {
        AveragePurchase today = new AveragePurchase(3);
        today.inputPurchases();
        today.displayPurchases();
        System.out.println("Average purchase today: Rs. " + today.calculateAverage());
    }
}
