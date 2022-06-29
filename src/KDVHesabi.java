import java.util.Scanner;

public class KDVHesabi {
    public static void main(String[] args) {
        double tutar;
        Scanner inp = new Scanner(System.in);

        System.out.print("KDV'siz Fiyat : ");
        tutar = inp.nextDouble();

        boolean kosul = tutar <= 1000;
        double a = 0.08;
        double b = 0.18;
        double KDVT = kosul ? (tutar * (1+a)) : (tutar * (1+b));
        double KDVa = kosul ? (tutar * (+a)) : (tutar * (+b));
        System.out.println("KDV'li Fiyat : " + KDVT);
        System.out.println("KDV Tutari : " + KDVa);


        /*double KDVli, KDV;
        KDVli = tutar * 1.18;
        KDV = tutar * 0.18;
        System.out.println("KDV'li Fiyat : " + KDVli);
        System.out.println("KDV Tutari : " + KDV);*/
    }
}