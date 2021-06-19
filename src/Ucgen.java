import java.util.Scanner;

public class Ucgen {
    public static void main(String[] args) {
        int a,b;
        double c,u,alan;

        Scanner in = new Scanner(System.in);

        System.out.println("1. Kenarı Giriniz: ");
        a = in.nextInt();
        System.out.println("2. Kenarı Giriniz: ");
        b = in.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs: " + c);

        u = (a+b+c)/2;
        alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));
        System.out.println("Üçgenin Çevresi: " + 2*u);
        System.out.println("Üçgenin Alanı: " + alan);

    }
}
