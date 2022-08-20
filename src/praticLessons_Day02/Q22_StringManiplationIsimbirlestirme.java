package praticLessons_Day02;

import java.util.Scanner;

public class Q22_StringManiplationIsimbirlestirme {
    //Kullanicidan ismini ve soyisimi girmesini isteyin,
    // sonrasinda konsola tam ismini buyuk harfler ile yazdirin
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soy isminizi girin");
        String firstName=scan.nextLine(),
                lastName= scan.nextLine();
        String fulName=firstName.concat(" "+lastName).toUpperCase();
        System.out.println("Full Name :"+fulName);
    }


}
