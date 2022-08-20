package day07_ifStatements;

import java.util.Scanner;

public class C04_basit_ifStatement {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir gun ismi giriniz");
        String girilenGun = scan.next().toLowerCase();

        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")) {
            System.out.println("Girilen gun HAFTASONU");
        }


        if (girilenGun.equals("pazartesi")
                || girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("sali") ||girilenGun.equals("cuma")) {

        System.out.println("girilen gun HAFTAICI");
        }
    }

}
