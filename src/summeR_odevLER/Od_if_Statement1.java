package summeR_odevLER;

import java.util.Locale;
import java.util.Scanner;

public class Od_if_Statement1 {
    public static void main(String[] args) {

      /*  6----     Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
                değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
​
        Sesli harfler: a,e,i,o,u
​
        Test Data:
        a
​
        Beklenen Çıktı:
        a harfi sesli harfdir.
​
        Test Data:
        d
​
        Beklenen Çıktı:
        d harfi sesiz harftir.
​
        Test Data:
        we  yada %
​
        Beklenen Çıktı:
        Yanlis karakter girdiniz!

       */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sesli bir harf giriniz");
        String harf = scan.next().toLowerCase();
        String sesliHarf = "aeiou";
        String sessizHarf = "bcdfghjklmnpqrstvwxyz";
        if (sesliHarf.contains(harf)) {
            System.out.println(harf.toUpperCase() + " harfi sesli harfdir");
        } else if (sessizHarf.contains(harf)) {
            System.out.println(harf.toUpperCase() + " harfi sessiz harftir");
        } else {
            System.out.println("Yanlis karakter girdiniz");
        }
    }
}
