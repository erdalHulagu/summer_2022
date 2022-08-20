package day03_scanner;

import java.util.Scanner;

public class C06_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen kullanici ismi giriniz");
        String isim = scan.nextLine();
        System.out.println("lutfen soyisminizi giriniz");
        String soyisim = scan.nextLine();
        System.out.println("lutfen yasi giriniz");
        int yas=scan.nextInt();
        System.out.println("girilen bilgiler="+isim+" "+soyisim+" "+yas);

     



    }
}
