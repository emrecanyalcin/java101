import java.util.Scanner;

public class KDV {
    public static void main(String[] args) {
        double tutar, kdvOran18 = 0.18, kdvOran8 = 0.08, kdvTutar, kdvliTutar;

        Scanner in = new Scanner(System.in);

        System.out.println("Ücret Tutarını Giriniz: ");
        tutar = in.nextDouble();

        if (tutar>=0 && tutar<=1000){
            kdvTutar = tutar * kdvOran18;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: " + kdvOran18);
        }else {
            kdvTutar = tutar * kdvOran8;
            kdvliTutar = tutar + kdvTutar;
            System.out.println("KDV Oranı: " + kdvOran8);
        }


        System.out.println("KDV'siz Tutar: " + tutar);

        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);
    }
}
