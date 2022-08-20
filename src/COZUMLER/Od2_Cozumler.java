package COZUMLER;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Od2_Cozumler {
    public static void main(String[] args) {
        /*Soru=
        Kullanicidan bir cumle isteyin ve kelime sayisini yazdirin.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir cumle girin lutfen");
        String str= scan.nextLine();

        String[]cumle=str.split(" ");

        int kelimeSayisi=0;

        for (int i = 0; i <cumle.length; i++) {

           kelimeSayisi+=i;
        }
        System.out.println("Cumledeki kelimelar :"+Arrays.toString(cumle));
        System.out.println("Cumledeki kelime sayisi :"+kelimeSayisi);
    }
}
