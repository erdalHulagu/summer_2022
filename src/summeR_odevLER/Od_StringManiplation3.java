package summeR_odevLER;

import java.util.Scanner;

public class Od_StringManiplation3 {
   /* Kullanıcıdan alınan Stringin son karakteirini silep ekrana yazan Java kodunu yazınız.

    Test Data:
    good

    Beklenen Çıktı:
    goo
    */
   public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
       System.out.println("Lutfen bir kelime giriniz");
       String kelime= scan.nextLine();

       String sonKarakter=kelime.substring(kelime.length()-1);

       System.out.println(kelime.replace(sonKarakter,""));


   }
}
