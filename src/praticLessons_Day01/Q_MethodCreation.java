package praticLessons_Day01;

import java.util.Scanner;

public class Q_MethodCreation {
    /*
cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
 */
    public static void main(String[] args) {


        System.out.println("metre ve km ye donusturmek istediginiz cm degerini giriniz");

        Scanner scan=new Scanner(System.in);
        double santiMetreVolue=scan.nextDouble();
        convertSm(santiMetreVolue);
    }

    private static void convertSm(double santiMetreVolue) {
        double meter=santiMetreVolue/100;
        double kMeter=santiMetreVolue/100000;
        System.out.println("girdiginiz cm degeri :"+santiMetreVolue+" = "+meter+
                " m'dir , ve "+kMeter+" km'dir");
    }
}
