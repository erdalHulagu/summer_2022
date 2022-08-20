package summeR_odevLER;

import java.util.Scanner;

public class Od_IndeksOf {
    /*Grilen String değer içinde istenen sıradaki karakteri bulan Java kodunu yazınız.

    Test Data:
    Java is fun


    Beklenen Çıktı
    0. pozisyondaki karakter : J

        5. pozisyondaki karakter : i
        */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String karakter= scan.nextLine().toLowerCase();
        int sonuc=cumle.indexOf(karakter);
             if(cumle.contains(karakter)){
            System.out.println(karakter.toUpperCase()+"  girdiginiz karakterin indeksi = "+sonuc);
        }else{
                 System.out.println("girdiginiz karakter cumlede yok baskabir karakter giriniz");
             }
    }

}
