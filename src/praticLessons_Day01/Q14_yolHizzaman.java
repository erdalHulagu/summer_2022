package praticLessons_Day01;

import java.util.Scanner;

public class Q14_yolHizzaman {
    /*  Problem Tanımı
    Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
    Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
    120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

    Örnek Ekran Çıktısı
    Mesafeyi giriniz: 400
    Hızı giriniz: 100
    Süre 4 saattir.
 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("gideceginiz yol mesafesi yol=(km)");
        double yol= scan.nextDouble();

        System.out.println("lutfen hizinizi hirin hiz=(km)");
        double hiz= scan.nextDouble();

        double varisSuresi=yol/hiz;
        System.out.println("varis sureniz = "+ varisSuresi+" km/saat");
        scan.close();//==>bu  SCAN. CLOS()'u  girerseniz ustteki scanner scan objesini kapatmis olursunuz
                     // tekrar isterseniz yeni bir scanner scan kurmaniz gerekir
    }
}
