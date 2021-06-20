import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        int r,alpha;
        double PI = 3.14;
        Scanner in = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r = in.nextInt();
        System.out.print("Merkez açı ölçüsünü giriniz: ");
        alpha = in.nextInt();

        double alan = PI * r * r;
        double cevre = 2 * PI * r;
        double alphaAlan = (PI * (r*r) * alpha) / 360;

        System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre);
        System.out.println("Merkez Açının Alanı: " + alphaAlan);
    }
}
