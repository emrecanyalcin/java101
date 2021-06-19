import java.util.Scanner;

public class TaksiMetre {

    public static void main(String[] args) {
        double perKm = 2.2D;
        double total = 10.0D;
        double startPrice = 10.0D;
        Scanner in = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        int km = in.nextInt();
        total = (double)km * perKm;
        total += startPrice;
        total = total < 20.0D ? 20.0D : total;
        System.out.println(total);
    }
}