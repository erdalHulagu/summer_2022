package COZUMLER.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrnekLambdaPrimitiveCozumler1 {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);
        tekrarsizCiftElemanlarinKareToplami01(liste);
        tekrarsizCiftElemanlarinKupleriniCarpimi(liste);
        maxElemaniBul(liste);
        minElemaniBul(liste);
        yedidenBuyukCiftMin(liste);
        tersSiralamaylaTekrarsizElemanlarinYarisi(liste);
    }
    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.
    //1. yol

    static void tekrarsizCiftElemanlarinKareToplami01(List<Integer>list){

        Integer toplam=list.stream().
                distinct().
                filter(LambdaReusable::ciftElemanlar).
                map(LambdaReusable::karesiElemanlar).reduce(Math::addExact).get();
        System.out.println("toplam = " + toplam);

        //2. yol
        /*
          Integer toplam=list.stream().
                distinct().
                filter(LambdaReusable::ciftElemanlar).
                map(LambdaReusable::karesiElemanlar).reduce(0,Math::addExact);
        System.out.println("toplam = " + toplam);
         */
        //3.yol
        /*
         Integer toplam=list.stream().
                distinct().
                filter(LambdaReusable::ciftElemanlar).
                map(LambdaReusable::karesiElemanlar).reduce(0,Integer::sum);
        System.out.println("toplam = " + toplam);
         */
    }
    //6) Tekrarsız çift elemanların küpünün çarpımını hesaplayan bir method oluşturun.

   static void tekrarsizCiftElemanlarinKupleriniCarpimi(List<Integer>list){

        Integer carpim=list.stream().
                distinct().
                filter(LambdaReusable::ciftElemanlar ).map(LambdaReusable::kupuElemanlar).
                reduce(Math::multiplyExact).get();
        System.out.println("carpim = " + carpim);
    }
    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
    static void maxElemaniBul(List<Integer>list){
         Integer max=list.stream().distinct().reduce(Math::max).get();
        System.out.println("max = " + max);
    }
    //Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(Method Reference)
    static void minElemaniBul(List<Integer>list) {
        Integer min = list.stream().distinct().reduce(Math::min).get();
        System.out.println("min = " + min);
    }
    //9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.
   static void yedidenBuyukCiftMin(List<Integer>list){
        Integer sonuc=list.stream().
                distinct().
                filter(LambdaReusable::ciftElemanlar ).
                filter(t->t>7).
                reduce(Math::min).get();
        System.out.println("sonuc = " + sonuc);
    }
    //10) Ters sıralama ile tekrarsız
    // ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.
    static void tersSiralamaylaTekrarsizElemanlarinYarisi(List<Integer>list){
        List<Double>sonuc=list.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                filter(t->t>5).map(LambdaReusable::yarisiElemanlar).
                collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);

    }

}

