package praticLessons_Day01;

import java.util.Scanner;

public class Q15_NotHesaplama {

    /*
     * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
     * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int vize1,vize2,finalNot;
        System.out.println("birinci vize :");
        vize1= scan.nextInt();
        System.out.println("ikinci vize:");
        vize2= scan.nextInt();
        System.out.println("finalNotu:");
        finalNot= scan.nextInt();

        double sonuc=(vize1+vize2/2*0.3)+finalNot*0.7;
        System.out.println("sonuc = "+ sonuc);


    }
}
