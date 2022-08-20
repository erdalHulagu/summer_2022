package day16_forLoop;

public class C07_NestedForLoop {
    public static void main(String[] args) {
        /*Bazen tek degisken sorunu cozmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
       */
        // yanyana 3 tane * yaz.
        for (int i = 1; i <=3; i++) {
            System.out.print("*"+" ");

        }
        //Bu tur durumlarda ic ice (nested) kullanmak gerekir

        System.out.println(" ");

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }
}
