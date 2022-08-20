package summeR_odevLER;

import java.util.Scanner;

public class C015_StringManiplation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi method kullanarak birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        //    Scanner scan=new Scanner(System.in);
        //    System.out.println("Lutfen ilk kelimeyi giriniz");
        //    String ilkkelime= scan.next();
        //    System.out.println("Lutfen ikinci kelimeyi giriniz");
        //    String ikincikelime= scan.next();
        //    System.out.println("birlesim ="+ilkkelime.concat(ikincikelime));

        String str="AkarTavan";


        str=str.replace("A","");

        System.out.println(str);


    }

}



