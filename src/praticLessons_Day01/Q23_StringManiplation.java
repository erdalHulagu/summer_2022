package praticLessons_Day01;

import java.util.Scanner;

public class Q23_StringManiplation {
    //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
    // String manipulation method kullanarak birlestiriniz.
    // yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("string1 :");
        String str1= scan.nextLine();
        System.out.println("string2:");
        String str2= scan.nextLine();

        System.out.println("1. yontem :"+str1+" "+str2);

        System.out.println("2. yontem :"+str1.concat(" "+str2));

        String al1=str1.substring(1);
        String al2=str2.substring(1);
        System.out.println("maniplation'dan sonraki hali :"+al1+""+al2);
    }

}
