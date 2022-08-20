package praticLessons_Day01;

import java.util.Scanner;

public class Q08_Scanner02 {

    // Kullanicidan 2 tam sayi alin ve bunlarin toplamini ekranda gosterin

    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen birinci tamsayi giriniz");

        int sayi1= scan.nextInt();

        System.out.println("lufen ikinci tam sayi giriniz");

        int sayi= scan.nextInt();

        System.out.println("toplam =" +(sayi1+sayi));


    }
}
