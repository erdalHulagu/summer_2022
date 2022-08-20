package day03_scanner;

import java.util.Scanner;

public class C05_scanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayiyi girin");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayiyi girin");
        double sayi2 = scan.nextDouble();
        System.out.println(sayi1 * sayi2);
    }
}

