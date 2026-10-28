import java.util.Scanner;
public class ParkingSystem05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int type, duration;
        int total = 0;

        do { 
            System.out.print("Input vehicle type (1 = Car, 2 = Motorcycle, 0 = Exit) : ");
            type = sc.nextInt();
            if (type == 1 || type == 2){
                System.out.print("Input durations parking : ");
                duration = sc.nextInt();
                if (duration > 5){
                    System.out.println("Amount payment per hour = Rp12.500");
                    total += 12500 * duration;
                } else if (duration <= 5 && type == 1){
                    System.out.println("Amount payment per hour = Rp3.000");
                    total += 3000 * duration;
                } else if (duration <= 5 && type == 2){
                    System.out.println("Amount payment per hour = Rp2.000");
                    total += 2000 * duration;
                }
            }
            
        } while (type != 0);

        System.out.println("Total Parking omzet today : " + total);
        sc.close();



    }
}
