package day43_interfaces_iterators;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);

        System.out.println(liste);// [10,20,30]

        // listedeki tum elementleri INDEX KULLANMADAN 3 arttirin
        for (Integer each : liste) {
            each += 3;
            System.out.print(each + 3 + " ");

        }
        System.out.println("");
        System.out.println(liste);
        /* java index yapisi olmayan collention'lardaki elementlere ulasmak veya
        degistirmek icin iterator interface'ini olusturmustur

        Iterator interface oldugundan
        ondan oblje olusturmamiz mumkun degildir
        bunun yerine bise Iterator donduren liste.iterator methodunu kullaniyoruz
         */
        System.out.println(liste);// [10,20,30]

        Iterator it1 = liste.iterator();
        System.out.println(it1.next());  //10
        System.out.println(it1.next());  //20
        System.out.println(it1.next());  //30
        //System.out.println(it1.next());// 30'dan sonra eleman kalmadigindan next() RTE verir

        /* Iteratorda geri donus yok
        adim adim sona ulastiktan sonra basa donmek icin yeniden
        bir Iterator olusturmaniz gerekir*/
        Iterator it2 = liste.iterator();

        // yeni iterator 2'yi kullanarak elementlerini silelim
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); /* iterator ile elementleri gezip
                                      remove yapinca liste kalici olarak degisti*/
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste "+liste);
        Iterator it3 = liste.iterator();
        while (it3.hasNext()){
            it3.next();
            it3.remove();
        }
        System.out.println("loop'dan sonra liste: "+liste);
        /*
        Goruldugu gibi Iterator kullanarak yapabildigim
        1- Tum collection elementlerini yazdirmak
        2-Tum collection elementlerini silmek
        buda bize yetmez
         */

    }
}