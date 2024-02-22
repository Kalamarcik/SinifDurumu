import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        Scanner a = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat= a.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik= a.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya= a.nextInt();
        System.out.println("Türkçe notunuzu giriniz:");
        turkce= a.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih= a.nextInt();
        System.out.println("Müzik notunuzu giriniz:");
        muzik= a.nextInt();

        int toplam=(mat+fizik+kimya+turkce+tarih+muzik);
        double ortalama= (toplam/6.0);
        System.out.println(ortalama);

        boolean ortYuksekMi = (ortalama >=60 );
        String str = ortYuksekMi ? "Sınıfı geçti" : "Sınıfta kaldı";
        System.out.println(str);

    }

}