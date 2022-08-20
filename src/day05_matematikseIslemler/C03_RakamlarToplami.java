package day05_matematikseIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        // soru= Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen dort basamakli tam bir ayi giriniz");
        int sayi = scan.nextInt();// 5267 sayisini girecegiz
        int BirlerBasamagi = 0;
        int RakamlarToplami = 0;
        int IlkGirilenSayi = sayi;

        // su anda sayi   =5262
        //BirlerBasamagi  =0
        //RakamlarToplami =0

        BirlerBasamagi = sayi % 10; //suanda BirlerBasamagi = 7 olacak
        RakamlarToplami += BirlerBasamagi; //su anda RakamlarToplami = 7 olacak
        sayi /= 10; //su anda  kalan sayi = 526 olacak

        BirlerBasamagi = sayi % 10;  // suanda BirlerBasamagi 6 olacak
        RakamlarToplami += BirlerBasamagi; //suanda RakamlarToplami 13 olacak
        sayi /= 10;  // suanda kalan sayi 52 olacak

        BirlerBasamagi = sayi % 10;   // suanda BirlerBasamagi 2 olacak
        RakamlarToplami += BirlerBasamagi;  // suanda RakamlarToplami 15 olacak 
        sayi /= 10;  // suanda sayi 5 olacak

        BirlerBasamagi = sayi % 10;  // suanda BirlerBasamagi 5 olacak
        RakamlarToplami +=BirlerBasamagi;  //  suanda RakamlarToplami 20 olacak
        sayi/=10; // suanda sayi 0 olacak

        System.out.println(IlkGirilenSayi+ " Sayinin Rakamlar Toplami "+RakamlarToplami);


    }
}
