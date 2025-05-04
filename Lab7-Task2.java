import java.util.Scanner;

public class StationaryBilling {
    private int[][] stock = new int[2][2]; 

    public void initializeStock() {
        stock[0][0] = 1; stock[0][1] = 20; 
        stock[1][0] = 2; stock[1][1] = 25;
    }

    public int calculateTotal(int productCode, int quantity) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i][0] == productCode) {
                return stock[i][1] * quantity;
            }
        }
        return 0;
    }

    public void showInvoice(int productCode, int quantity) {
        int total = calculateTotal(productCode, quantity);
        System.out.println("------ Invoice ------");
        System.out.println("Product Code: " + productCode);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Price  : Rs. " + total);
    }

    public static void main(String[] args) {
        StationaryBilling shop = new StationaryBilling();
        shop.initializeStock();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product code (1 or 2): ");
        int code = scanner.nextInt();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        shop.showInvoice(code, quantity);
    }
}
