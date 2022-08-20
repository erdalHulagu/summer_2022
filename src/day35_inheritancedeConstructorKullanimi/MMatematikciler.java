package day35_inheritancedeConstructorKullanimi;

public class MMatematikciler extends LOgretmen{
    MMatematikciler(){
        System.out.println(" MMatematikciler parametresiz cons.");

    }
    MMatematikciler(String isim){
        this();

        System.out.println(" MMatematikciler parametreli cons.");
    }
    /*
    This(); cons. call icinde bulunan class'daki cons.'lari
    super(); cons. iseparent classda bulunan cons.lari cagirir.

    This(); veya super(); parametre yapisina uygun bir cons. bulamayinca
    hata yani CTE verir.

    Cons. konusunda gordugumuz This. o classdaki instance variablaleri refere ediyordu

    inheritance'dede super(); cons. vardir.
    super. paretn classdaki instance'leri refere eder

     */
}
