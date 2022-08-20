package praticLessons_Day01;

import java.util.Scanner;

public class Q03_BMI {
    /*
		 Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		              Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23
		 	 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Ltfen kilonuzu giriniz(kg)");
        double kilo= scan.nextDouble();
        System.out.println("lutfen bouyunuzu giriniz(cm)");
        double boy= scan.nextDouble();
        //boy=boy/100; veya alttaki satirdaki gibi
        boy/=100;
        double vucutKitlesi= kilo/(boy*boy);
        System.out.println("vucutKItlesi = "+vucutKitlesi);
    }
}
