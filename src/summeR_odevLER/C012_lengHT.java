package summeR_odevLER;

import java.util.Scanner;

public class C012_lengHT {
    // Kullanicidan isim soy isim isteyin hangisinin daha uzun oldugunu yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("LUtfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        if(isim.length()==soyisim.length()){
            System.out.println("Isim ve soy isminizin uzunlugu esit");
        } else if (isim.length()>soyisim.length()) {
            System.out.println("isminiz daha uzun");
        }else{
            System.out.println("Soyisminiz daha uzun");

        }
    }
}
