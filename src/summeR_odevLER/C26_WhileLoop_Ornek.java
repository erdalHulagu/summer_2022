package summeR_odevLER;

import java.util.Scanner;

public class C26_WhileLoop_Ornek {

    /*
      Kullanicidan tam sayilar alin
      kullanici cift sayi girdigi muddetce sayiyilari yazdirin
      tek sayi girdiginde islemi bitirin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int tekSayi = 0, ciftSayi = 0, tamSayi = 0;


        while (tamSayi % 2 == 0) {
            tekSayi = tamSayi % 3;
            System.out.println("lutfen sayi giriniz");
            tamSayi = scan.nextInt();


            if (tamSayi < 0) {
                System.out.println("yanlis sayi girdiniz sayi giriniz lutfen");
                tamSayi = scan.nextInt();
            } else if (tamSayi % 2 == 0) {
                System.out.println("toplam tam sayi:" + tamSayi);
                tamSayi = scan.nextInt();
                System.out.println(tamSayi + "  lutfen bir sayi daha giriniz");
            } else {
                System.out.println("tek sayi girdiniz");
            }
        }
    }
}
