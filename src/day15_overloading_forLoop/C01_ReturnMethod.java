package day15_overloading_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //verilen iki sayinin carpinimi bul
        //sonucu bise donusturen bir medtod olusturun

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1, sayi2);
        System.out.println("illada sonuc gorelim diyenlere gelsin =" + sonuc);
        /* sonuc normalde yazdirlmadiginda yani sout yapilmadiginda ekrand gozukmez. ama retun maine gelmis olur.
        deger mainde saklidir. soutu mainde yapati ve sonuc sikti*/

    }

    /*ustteki main metod ve ve alttaki olusturdugumuz metod komple farklidirlar
    burada bu ikisini birbirine baglayan RETURN'dur. REURN degeri alip main metoda aktarir ve
     boylece mein metodda sonuc gizlenir gereksimlere gore yani yukardaki soruda istenene gore
    yazdiririlir veya yazdirilmaz.*/
    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc=sayi1*sayi2;
        System.out.println("illada sonuc gorelim diyenlere gelsin ="+sonuc);// gordugunuz gibi buradada yazdirirlir



        return sonuc;
    }


}

