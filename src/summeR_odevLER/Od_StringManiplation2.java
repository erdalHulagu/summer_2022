package summeR_odevLER;

import java.util.Scanner;

public class Od_StringManiplation2 {

       /* 10-----Kullanıcıdan alınan String kümesi içerisinde aranan  String i bulan Java Kodunu yazınız.

        Test Data:
        Java is easy

        Aranan String: is

        Bektenen Çıktı:
        True

        Aranan String: and

        Beklenen Çıktı:False

        */
       public static void main(String[] args) {
           Scanner scan=new Scanner(System.in);
           System.out.println("Lutfen bir cumle giriniz");
           String cumle= scan.nextLine();
           System.out.println("Lutfen bir kelime giriniz");
           String kelime= scan.nextLine();
           boolean sonuc=cumle.contains(kelime);

           System.out.println(sonuc);
       }
}
