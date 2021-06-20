import java.util.Scanner;

public class vucutKitleIndexi {
    public static void main(String[] args) {
        double boy, kilo, vke;
        Scanner in = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = in.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = in.nextDouble();

        vke = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vke);
    }
}
