import java.util.Scanner;
public class KafeDoWhile05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coffee, tea, breads, totalPrice;
        String customerName;
        int coffeePrice =  12000, teaPrice = 7000, breadsPrice = 20000;

        do{
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
            if (customerName.equalsIgnoreCase("cancel")){
                System.out.println("Transaction canceled");
                break;
            }

            System.out.print("Number of coffees: ");
            coffee = sc.nextInt();
            System.out.print("Number of teas: ");
            tea = sc.nextInt();
            System.out.print("Number of breads: ");
            breads = sc.nextInt();

            totalPrice = (coffee * coffeePrice) + (tea * teaPrice) + (breads * breadsPrice);
            System.out.println("Total to be paid : Rp " + totalPrice);
            sc.nextLine(); // consume the newline character after nextInt()

        } while (true);

        System.out.println("All transactions completed.");
        sc.close();
    } 
}
