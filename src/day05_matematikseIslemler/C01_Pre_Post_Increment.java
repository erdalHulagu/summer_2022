package day05_matematikseIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {

        int sayi1=10;
        int sayi2= sayi1+1; //sayi2 = 11
        sayi2 +=5; // sayi2 =16

        /* pree veya post increment/decrement sadece
        ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan once ve sonra yazilmasina gore farkli iki isleyis olur */

        int sayi3= sayi2++;    /* sayi'2nin degeri sayi uce aktarilir bir sonraki islem icin
                               // sayi2 1 arttirilir /*

         /* ++ veya -- variable'dan once ise buna pre.... denir.
         bu durumda o satirda yapilan iki islemden oncelikli olan
         arttirma veya azaltmadir.*/

        int sayi4=++sayi1;  //1- sayi bir 1 arttirilacak
                            //2- sayi1 degeri sayi4 de 1 attirildiktan sonra atanacak
         /* Eger ++ veya -- variable'dan once ise buna pre... denir
         bu durumda o satirda yapilan iki islemden oncelikli olan arttirma
         veya azaltmadir
          */
        System.out.println( "sayi4 = "  + sayi4);  // 11 olur
        System.out.println("sayi1 = "  + sayi1);  // 11 olur



    }
}
