import java.util.Scanner;
public class CinemaTickets05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ticket_price = 50000;
        int num_tickets, total_payment = 0, disc_total_payment, total_num_sales = 0, total_price_sales = 0;

        do { 
            System.out.print("Number of tickets (Enter '0' to close ticket sales today) : ");
            num_tickets = sc.nextInt();
            if (num_tickets > 4 && num_tickets <= 10){
                System.out.println("Customer get Discount 10%");
                total_payment = ticket_price * num_tickets;
                disc_total_payment = (int) (total_payment * (1 - 0.1));
                System.out.println("Total payment : " + total_payment);
                System.out.println("Total after discounted : " + disc_total_payment);
                total_num_sales += num_tickets;
                total_price_sales += disc_total_payment;
                System.out.println(" ");

            } else if (num_tickets > 10){
                System.out.println("Customer get Discount 15%");
                total_payment = ticket_price * num_tickets;
                disc_total_payment = (int) (total_payment * (1 - 0.15));
                System.out.println("Total payment : " + total_payment);
                System.out.println("Total after discounted : " + disc_total_payment);
                total_num_sales += num_tickets;
                total_price_sales += disc_total_payment;
                System.out.println(" ");

            } else if (num_tickets <= 4 && num_tickets > 0){
                total_payment = ticket_price * num_tickets;
                System.out.println("Total payment : " + total_payment);
                total_num_sales += num_tickets;
                total_price_sales += total_payment;
                System.out.println(" ");

            } else if (num_tickets < 0){
                System.out.println("Invalid amount. Please re-enter it ");
                System.out.println(" ");
                continue;

            } 
               

        } while (num_tickets != 0);

        System.out.println("Total amount tickets sales today : " + total_num_sales);
        System.out.println("Total omzet tickets sales today : " + total_price_sales);
        sc.close();
    }
    
}
