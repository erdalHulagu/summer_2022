package day04_dataCasting;

public class C02_dataCasting {
    public static void main(String[] args) {
        int sayi1 = 23;
        int sayi2 = 5;

        System.out.println(sayi1 / sayi2);// degeri 4.6 degil 4 olarak verir. cunku ikiside inttir

        System.out.println(sayi1 * sayi2 / 3);// 38 verir cunku data int'tir. normalde kusurat veririr bu.

        double sayi3 = 5;
        System.out.println(sayi1 / sayi3);/* burda sayi1 int, sayi 3 double'dir. boyle bir durumda
                                        daha kapsamli olan datta'yi ele alir. sonu doubledir yani 4.6*/
    }
}
