package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {
        topla(5,7);
        topla(5.2,3);
        topla(3.4,6.1);

    }

public static void topla(int sayi1, int sayi2){
    System.out.println("iki integer'in toplami ="+(sayi1+sayi2));}
     /*
    Bir class'da parametre sayisi ve parametre data turleri ayni olan 2 method OLUSTURAMAYIZ
    public static void topla(int sayi3, int sayi4){
        System.out.println("Iki integer'in toplami : " + (sayi3+sayi4));
        */
     public static void topla(double sayi1, int sayi2){
         System.out.println("iki integer'in toplami ="+(sayi1+sayi2));}

    public static void topla(int sayi1, double sayi2){
        System.out.println("iki integer'in toplami ="+(sayi1+sayi2));}

    public static void topla(double sayi1, double sayi2){
        System.out.println("iki integer'in toplami ="+(sayi1+sayi2));}

    /* gorukldugu gibi yukarda data turlerini degistisince ayni topla medodundan data type i
    degisik olanlarida kabul etti*/


}

