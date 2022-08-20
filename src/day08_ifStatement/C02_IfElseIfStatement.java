package day08_ifStatement;

import java.util.Scanner;

public class C02_IfElseIfStatement {
    public static void main(String[] args) {
        // Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        // Not’u harf sistemine cevirip yazdirin.
        // 50’den kucukse “D”,
        // 50 ye esit veya buyuk -60 dan kucukse “C”,
        // 60'a esit veya buyuk-80 'den kucuk “B”,
        // 80'e esit  veya  uzerinde ise “A”
        // gecersiz not girildiginde uyari verelim

        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen  0'dan 100'e kadar bir notunuzu griniz");

        double note = scan.nextDouble();

        if (note < 0 || note > 100) {
            System.out.println("lutfen  gecerli bir not giriniz");
        } else if (note < 50) {
            System.out.println("Notunuz = D");
        } else if (note < 60) {
            System.out.println("Notunuz = C");
        } else if (note < 80) {
            System.out.println("Notunuz = B");
        } else {
            System.out.println("Notunuz = A");

        }


    }
}
