import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r;
        double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        r = in.nextInt();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
    }
}
