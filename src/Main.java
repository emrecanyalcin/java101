import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner in = new Scanner(System.in);

        System.out.println("Matematik Notunuz : ");
        mat = in.nextInt();

        System.out.println("Fizik Notunuz : ");
        fizik = in.nextInt();

        System.out.println("Kimya Notunuz : ");
        kimya = in.nextInt();

        System.out.println("Türkçe Notunuz : ");
        turkce = in.nextInt();

        System.out.println("Tarih Notunuz : ");
        tarih = in.nextInt();

        System.out.println("Muzik Notunuz : ");
        muzik = in.nextInt();

        int top = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        boolean sonuc = top>60;

        System.out.println("Sınıfı geçme durumu " + sonuc);

       

    }
}
