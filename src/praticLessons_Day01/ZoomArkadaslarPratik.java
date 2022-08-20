package praticLessons_Day01;

public class ZoomArkadaslarPratik {
    public static void main(String[] args) {
       /* Girilen sayıların toplamı 100'ü geçince daha sayı istemeyecek ve
        o ana kadar kaç sayı girildiği ekrana yazdırılacak.
        bu soruyu hem for-loop hemde while -do döngüsü ile yapınız.*/
        int sayi = 100, sayilar = 0;
        for (int i = 0; i <= sayi; i++) {
            sayilar=i;
            if (i < sayi) {
                System.out.print(sayilar + ", ");

            } else {
                System.out.println(sayilar);
            }

        }

    }
}

