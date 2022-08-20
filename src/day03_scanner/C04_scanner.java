package day03_scanner;

import java.util.Scanner;

public class C04_scanner {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen ismi giriniz");

        String kullanici = scan.next();

        System.out.println("isim= " + kullanici);


    }

}
