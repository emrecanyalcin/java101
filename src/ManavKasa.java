import java.util.Scanner;

public class ManavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;

        Scanner in = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ?: ");
        armut = in.nextDouble();
        System.out.print("Elma Kaç Kilo ?: ");
        elma = in.nextDouble();
        System.out.print("Domates Kaç Kilo ?: ");
        domates = in.nextDouble();
        System.out.print("Muz Kaç Kilo ?: ");
        muz = in.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ?: ");
        patlican = in.nextDouble();
        toplam = (armut * 2.14) + (elma * 3.67) * (domates * 1.11) * (muz * 0.95) + (patlican * 5);
        System.out.println("Toplam Tutar : " + toplam + " TL");


    }
}
