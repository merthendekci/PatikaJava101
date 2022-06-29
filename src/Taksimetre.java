import java.util.Scanner;

public class Taksimetre {
    public Taksimetre() {
    }

    public static void main(String[] args) {
        double KMTL = 2.2;
        double Min = 20.0;
        double Acilis = 10.0;
        Scanner girdi = new Scanner(System.in);
        System.out.print("Gidilen Kilometre : ");
        double KM = girdi.nextDouble();
        double tutar = KM * KMTL + Acilis;
        boolean kosul = tutar <= Min;
        double fiyat = kosul ? Min : tutar;
        System.out.print("Toplam Tutar : " + fiyat);
    }
}
