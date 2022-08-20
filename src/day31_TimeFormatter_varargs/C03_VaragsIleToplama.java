package day31_TimeFormatter_varargs;


public class C03_VaragsIleToplama {
    public static void main(String[] args) {
        // verilen iki integier'i toplayip sonucu yazdiran bir metod olusturun
        // hepsini toplayip sonucu yazdiran bir metod olusturun
        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);




    }
    public  static void toplaYazdir(int... sayi){
        /*
        int...  sayi bu gosterim int variales dan olusan bir varargs demektir
         */
        int toplam=0;
        int sayiadedi=sayi.length;
        for (int each:sayi
             ) {
            toplam+=each;

        }

        System.out.println("girilen"+sayiadedi+"sayilarin toplam = " + toplam);
        }
    }

