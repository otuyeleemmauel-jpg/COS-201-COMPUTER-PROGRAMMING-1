import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int qty = sc.nextInt();

        System.out.println("Item: " + name);
        System.out.println("Total cost: " + (price * qty));
        sc.close();
    }
}
