import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = 6079;
        int[] arr = new int[size];

        try {
            System.out.println("Accessing element at index " + size);
            arr[size] = 100; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("You tried to access an index beyond array size.");
        }

        scanner.close();
    }
}
