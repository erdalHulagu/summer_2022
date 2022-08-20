package summeR_odevLER;

import java.util.Scanner;

public class C2_odevDikdortgeninHacmi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("dikdortgenin uzun kenarini giriniz");

        int uzunKenar = scan.nextInt();

        System.out.println("dikdortgenin kisa kenarini giriniz");

        int kisaKenar = scan.nextInt();

        System.out.println("dikdortgenin yuksek kenarini giriniz");

        int yuksekKenar = scan.nextInt();

        int cube = kisaKenar * uzunKenar * yuksekKenar;

        int m= cube*cube*cube;

        System.out.println("Dikdortgen hacim  =  " +cube+"m^   net "+m);


    }

}
