package praticLessons_Day01;

import java.util.Scanner;

public class Q26_StringMniplation {
    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cumle olusturmak icin ilk kelime girin");
        String str1= scan.nextLine().toLowerCase();
        System.out.println("cumle olusturmak icin ikinci kelime girin");
        String str2= scan.nextLine().toLowerCase();
        System.out.println("cumle olusturmak icin ucuncu kelime girin");
        String str3= scan.nextLine().toLowerCase();
        System.out.println("cumle olusturmak icin dorduncu kelime girin");
        String str4= scan.nextLine().toLowerCase();
        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+
                " "+str2+" "+str3+" "+str4+".");
    }
}
