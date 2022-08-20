package day17_nestedForLOop;

public class C03_nestedForLoop {
    public static void main(String[] args) {
        /* verilen en ve boy degerine gore yildizlardan olusan bir dikdortgen
        olusturalim
        mesela yukselik=3
        boy=4
        * * * *
        * * * *
        * * * *

        */
        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik; i++) {
            for (int j = 1; j <=boy; j++) {

                System.out.print("* ");

            }
            System.out.println("");
        }
    }
}
