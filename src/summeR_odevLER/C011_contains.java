package summeR_odevLER;

import java.util.Scanner;

public class C011_contains {
    /*Kullanicidan bir cumle isteyin. cumle "buyuk" kelimesi iceriyorsa
    tum cumleyi buyuk harf olarak, "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin.
     iki kelimeyide icermiyorsa 2 Cumle buyuk vey kucuk kelimesi icermiyor yazdirin
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("LUtfen bir cumle giriniz");
        String cumle= scan.nextLine();
        String buyuk,kucuk;

        if(cumle.toLowerCase().contains("kucuk")) {
            System.out.println(cumle.toLowerCase());
        } else if (cumle.toLowerCase().contains("buyuk")) {
            System.out.println(cumle.toUpperCase());
        }else{
            System.out.println("Cumle kucuk veya buyuk kelimesi icermiyor");

        }

    }
}
