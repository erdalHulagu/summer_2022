package day06_Concatenation;

import java.util.Scanner;

public class C01_WrapperClass {
    public static void main(String[] args) {
        /*
        Wrapper class Javanin hazir metodlarini kullanabilmemiz icin
        primitive data turlerinin her biri icin actigi classlar'dir

       int--> Integer
       char--> Character
       digerleri sadece bas harfleri degistirilerek aynisi gibi yazilir
         */
        String str = "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase());  // JAVA ILE HAYAT NE GUZEL olur

        Boolean buGuzelmi = true;
        buGuzelmi.toString();

        System.out.println(buGuzelmi); // true

        System.out.println(Short.MIN_VALUE);// -32768
        System.out.println(Short.MAX_VALUE);// 32767

        String ogrNo = "123456";
        // Kullanicidan bir sifre isteyelim, sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan = new Scanner(System.in);

        System.out.println(" Luffen 5 basamakli bir sifre girin");

        String sifre=scan.nextLine();

        Integer sifreSayi = Integer.parseInt(sifre);

        System.out.println("Girilen sifrenin 3 fazlasi  = "+(sifre+3));
        System.out.println("Integer sifrenin 3 fazlasi  = "+(sifreSayi+3));

        //Wraper classlar ilerde kullanabilecegimiz
        // pek cok hazir metod icerir


    }
}
