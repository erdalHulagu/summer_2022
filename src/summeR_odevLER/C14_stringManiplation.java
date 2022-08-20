package summeR_odevLER;

import java.util.Scanner;

public class C14_stringManiplation {
    /*Kullanicidan ismini ve soyisimi girmesini isteyin,
    sonrasinda konsola tam ismini buyuk harfler ile yazdirin*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi girin");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi girin");
        String soyisim= scan.nextLine();

        System.out.println("Isim Soyisim : "+(isim+" "+soyisim).toUpperCase());
    }


}


