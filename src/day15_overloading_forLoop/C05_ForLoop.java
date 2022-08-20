package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {


        int toplam = 0;

        for (int i = 1; i <= 5; i++) {

            toplam += i;
        }
        System.out.println("toplam =" + toplam);// yazdirma loop parantezinin disinda olmalidir

        toplam = 0;
        for (int i = 10; i <= 20; i++) {
            toplam += i;
        }
        System.out.println("10 , 20 arasi sayilarin toplam =" + toplam);

        //Ciftler icin 1. yontem
        toplam = 0;

        for (int i = 30; i <= 50; i += 2) {
            toplam += i;
        }
        System.out.println("30 , 50 arasi cift sayilarin toplam =" + toplam);
        //ciftler icin 2. yontemin( 2. yontem daha avantajli
        toplam = 0;

        for (int i = 30; i <= 50; i++) {
            if (i % 2 == 0) {
                toplam += i;
            }
        }

        System.out.println("30 , 50 arasi cift sayilarin toplam =" + toplam);

        //1500 , 1600 arasi 7 ile bolunebilen sayilari toplayin

        toplam = 0;

        for (int i = 1500; i <= 1600; i++) {
            if (i % 7 == 0) {
                toplam += i;
            }

        }
        System.out.println("1500 , 1600 arasi 7 ile bolunebilen sayilari topla ="+toplam);

    }
}
