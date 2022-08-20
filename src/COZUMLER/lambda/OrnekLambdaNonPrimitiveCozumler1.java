package COZUMLER.lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class OrnekLambdaNonPrimitiveCozumler1 {
    public static void main(String[] args) {
        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Amanda");
        liste.add("Christopher");
        liste.add("Jackson");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Benjamin");
        System.out.println(liste);
        elemanlariBuyukHarfIleYazdir(liste);
        System.out.println();
        elemanlariUzunluklarinaGoreSiraylaYazdir(liste);
    }
    //1) Tüm elemanları büyük harf ile yazdıran bir method oluşturun.
    static void elemanlariBuyukHarfIleYazdir(List<String>list){
        list.stream().distinct().map(String::toUpperCase).forEach(t-> System.out.print(t+" "));
    }
    //2) Elemanları uzunluklarına göre sıralayıp yazdıran bir method oluşturun.
    static void elemanlariUzunluklarinaGoreSiraylaYazdir(List<String>list){
       list.stream().
               distinct().
               sorted(Comparator.comparing(String::length)).
               forEach(t-> System.out.print(t+" "));
    }
}
