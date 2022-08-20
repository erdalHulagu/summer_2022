package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkharf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ismin ilk harfini giriniz lutfen");

        char ilkharf=scan.next().toUpperCase().charAt(0);


        System.out.println("ismin ilk harfi = " +ilkharf);





    }
}
