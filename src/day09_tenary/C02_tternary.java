package day09_tenary;

import java.util.Scanner;

public class C02_tternary {
    public static void main(String[] args) {


        //bir sayi alin sayi pozitif ise "sayi pozitif" yazdirin
        // negatif ise sayinin karesini yazdirin


        // kullanicidan bir sayi isteyin
        // sayi poztifse sayiyi yazdirin
        // sayi sifir veya negatifse, bir sayi daha isteyin ve ikisinin carpimini yazdirin
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi= scan.nextDouble();
        if (sayi>0){
            System.out.println(sayi);
        } else {
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);
        }
        /*
          Eger if else icerisinde yeni kodlar varsa
          ternary ile yapmamiz mumkun olmaz
         */
    }
}
