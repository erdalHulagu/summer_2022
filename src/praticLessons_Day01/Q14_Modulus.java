package praticLessons_Day01;

import java.util.Scanner;

public class Q14_Modulus {
    public static void main(String[] args) {
        /* Modulu demek bir sayinin 10un katlarina bolumundan kalandir

         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi girin");
        int num = scan.nextInt();

        int ilkIki = num / 1000;
        int sonIki = num % 100;// 100'e bolumunden kalani verir

        int ilkIkiTop=(ilkIki/10)+(ilkIki%10);
        int sonIkiTop=(sonIki/10)+(sonIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop+ sonIkiTop));

    }
}