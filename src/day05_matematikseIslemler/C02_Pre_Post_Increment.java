package day05_matematikseIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi = 10;

        System.out.println("Pre Increment  =  " + ++sayi);// sayi=11 olur
        System.out.println("Pre Increment  =  " + sayi++); /*  sayi=11 olur cunku ilk olarak sayi solda
                                                            oldugu icin onu atar, biri ondan sonra arttirir*/

        System.out.println("Pre Increment'den sonra  =  " + sayi);// sayi= 12 oldu.
        // POSTda sonradan arttirma olur

        sayi++;// 13 olur
        ++sayi;//14 olur  yani (++ sayi) variableden yami'sayidan' once olursa direk arttirip atama yapar
               // fakat (sayi++) variableden sonra gelirse once atama sonra arttirma hyapar



    }
}
