package day16_forLoop;

import java.util.Scanner;

public class C05_ForlLoop {
    //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
    // tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen baslangic ve  bitis degerlerini girin");

        int bas= scan.nextInt();
        int bit= scan.nextInt();

        aralariTopla(bas,bit);


    }

    public static void aralariTopla(int bas, int bit) {
        int toplam=0;
        if(bas<=bit){

            for (int i = bas; i <=bit; i++) {
                toplam += i;
            }
        }else {
            for (int i = bit; i <=bas ; i++) {
                    toplam+=i;
            }

        }
            System.out.println("Aradaki sayilarin toplami :"+toplam);
    }
}

