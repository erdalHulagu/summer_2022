package day28_staticBlog;

public class C01_StaticBloc {

    static int sayi;
    static{
        /* 1-Static block class uyelerinin tamamindan
         once calisir (main methodtan bile once calisir)

         2-Static block class olustugunda calisir genellikle
         Classla ilgili on ayarlamalar veya
         static blocklara deger atamak icin kullanilir

         3-Static blocklarin class icerisinde nereede oldugu
         onemli degildir once static blocklar calisir.

         4-Birden  fazla static block varsa ustten asagi dogru calisir.
          */
        System.out.println("Static blok calisti");
        sayi=10;
    }
    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static{
        System.out.println("Main method altindaki static block calisti");
    }


}
