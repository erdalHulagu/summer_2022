package day17_nestedForLOop;

public class C02_NestedForLoop {
    /* vERILEN SAYIYA GORE CARPIM TABLOSU OLUSTURUN
    input 3se
    soyle olacak
    1 2 3
    2 4 6
    3 6 9
    */

    public static void main(String[] args) {

        int input=4;
        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <=input; j++) {
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }
    }
}
