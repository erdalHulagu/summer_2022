package summeR_odevLER;

import java.util.Locale;
import java.util.Scanner;

public class C013_subString {
    // KUllanicidan bir kelime isteyin Bunu tersten yazdirin
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dort haneli bir kelime giriniz lutfen");
        String kelime = scan.next();
        String harf1, harf2, harf3, harf4;
        harf4 = kelime.substring(3, 4);
        harf3 = kelime.substring(2, 3);
        harf2 = kelime.substring(1, 2);
        harf1 = kelime.substring(0, 1);
        String sonuc;

        if (kelime.length() > 4) {
            System.out.println("Yanlis girdiniz lutfen 4 haneli giriniz");
        } else {

            System.out.println("tersten kelime esittir = " + harf4 + harf3 + harf2 + harf1);

        }

    }
}
