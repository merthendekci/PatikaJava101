import java.util.Scanner;

public class VucutKitleEndeksi {
    public static void main(String[] args) {
        double kg, boy, VKE ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = inp.nextDouble();
        VKE = kg/(boy*boy);


        System.out.println("Vücut Kitle İndeksiniz :" + VKE);

    }
}
