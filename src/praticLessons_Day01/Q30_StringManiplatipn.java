package praticLessons_Day01;

import java.util.Scanner;

public class Q30_StringManiplatipn {
// Kullanicidan isim ve soyismini girmesini isteyin ve
// hangisinin daha uzun oldugunu yazdirin.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz :\nisim");
        String isim= scan.nextLine();
        System.out.println("soyisim");
        String soyisim= scan.nextLine();

        if(isim.length()>soyisim.length()){
            System.out.println("Isminiz soyisminizden uzun");
        } else if (isim.length()==soyisim.length()) {
            System.out.println("Isim ve soy isminiz esit");
        }else{
            System.out.println("soy isminiz isminizden uzun");
        }

    }
}
