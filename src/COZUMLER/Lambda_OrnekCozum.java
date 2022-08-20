package COZUMLER;

import java.util.ArrayList;
import java.util.List;

public class Lambda_OrnekCozum {
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
        aralarindaBoslukVeVirgulILeYazdir(liste);
        System.out.println();
        tekSayiKareleriVeToplamlariniBul(liste);
        System.out.println();
        tekrarsizTeksayiKarelerininBolumunuBul(liste);

    }
    //1) Ardışık list elementlerini aynı satırda
// aralarında virgul ve bosluk bırakarak yazdıran
// bir method oluşturun.(Structured)
    public static void aralarindaBoslukVeVirgulILeYazdir(List<Integer> sayi){
        sayi.stream().forEach(t-> System.out.print(t+", "));
    }
    /*3) Ardışık tek list elementlerinin karelerini ve toplamlarini bulun aynı satırda
    aralarında boşluk bırakarak yazdıran bir method oluşturun.*/

    public static void tekSayiKareleriVeToplamlariniBul(List<Integer>sayi){
        int islemSonucu =sayi.stream().filter(t->t%2!=0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.print(islemSonucu);
    }
     /*3) Tekrarsiz Ardışık tek list elementlerinin karelerini ve birbirne carpimini bulun aynı satırda
    aralarında boşluk bırakarak yazdıran bir method oluşturun.*/
    public static void tekrarsizTeksayiKarelerininBolumunuBul(List<Integer>sayi){
        int islemSonucu=sayi.stream().distinct().filter(t->t%2!=0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println(islemSonucu);
    }


}
