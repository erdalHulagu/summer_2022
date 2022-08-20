package summeR_odevLER;

import java.util.Scanner;

public class Ornek_ForLoop {
    public static void main(String[] args) {

        //Soru 10 ) Kullanicidan iki sayi isteyin. Girilen sayilar ve aralarindaki
        // tum tamsayilari toplayip, sonucu yazdiran bir program yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1= scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2= scan.nextInt();

        aradakiSayilariTopla(sayi1,sayi2);


    }


    private static void aradakiSayilariTopla(int sayi1, int sayi2) {
        int topla=0;
        if(sayi1==sayi2) {
            System.out.println("yanlis girdiniz");
        } else if (sayi1<sayi2) {
            for (int i = sayi1; i <=sayi2; i++)
            topla+=i;
            System.out.println("aralarindaki sayilarin toplami :"+topla);
        }else if(sayi2<sayi1){
            for (int i = sayi2; i <= sayi1; i++)
                topla+=i;
            System.out.println("aralarindaki sayilarin toplami :"+topla);

        }
    }
}



