import java.util.Scanner;
public class DikUcgendeHipotenus {
    public static void main(String[] args) {
        // copy - paste
        int a,b,c;
        double alan,cevre,u,alaninkaresi;
        Scanner inp=new Scanner(System.in);

        System.out.print("Birinci Kenar uzunlugu:");
        a=inp.nextInt();
        System.out.print("ikinci Kenar uzunlugu:");
        b=inp.nextInt();
        System.out.print("Ucuncu Kenar uzunlugu:");
        c=inp.nextInt();

        cevre=(a+b+c);
        u=(cevre/2);
        alaninkaresi= u*(u-a)*(u-b)*(u-c);
        alan=Math.sqrt(alaninkaresi);
        System.out.println("Ucgeninizin cevresi:"+cevre);
        System.out.println("Ucgeninizin alanı:"+alan);



    }
}