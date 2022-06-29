import java.util.Scanner;

public class NotOrtalama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat,fizik,turkce,tarih,muzik;

        // scanner sınıfımızı tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz :");
        fizik = inp.nextInt();

        System.out.print("Turkce notunuz    :");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz :");
        tarih = inp.nextInt();

        System.out.print("Muzik notunuz :");
        muzik = inp.nextInt();

        int toplam =  (mat+fizik+turkce+tarih+muzik);
        double sonuc = (toplam/5);
        System.out.println("Ortalamaniz = " + sonuc);

        //Sınıf Geçti mi
        boolean kosul = sonuc >= 60;
        String gectiMi = kosul ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.println(gectiMi);
    }
}