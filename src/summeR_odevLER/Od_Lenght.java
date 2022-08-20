package summeR_odevLER;

import java.util.Scanner;

public class Od_Lenght {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi girin lutfen");
        String isim= scan.nextLine();
        System.out.println("Soyisminizi girin lutfen");
        String soyisim=scan.nextLine();

        String uzun=isim.length()>soyisim.length()?"isminiz daha uzun"
                :"soyisminiz daha uzun";
        System.out.println(uzun);
    }
}
