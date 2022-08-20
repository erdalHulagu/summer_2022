package praticLessons_Day01;

import java.util.Scanner;

public class Q18_KanBagisiYasAraligi {
    /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen yasiniz giriniz kg");
        int yas = scan.nextInt();
        System.out.println("lutfen kilonuzu giriniz cm");
        int kilo = scan.nextInt();
        if (yas < 18 && yas < 0) {
            System.out.println("Yasi 18den kucuk olanlar kan bagisi yapamaz");
        } else if (yas >= 18) {
            if (kilo < 50) {
                System.out.println("kan bagisi yapamazsiniz");
            } else if (kilo >= 50) {
                System.out.println("kan bagisi yapabilirsiniz");
            }

        } else {
            System.out.println(" yanlis bir deger girdiniz Lutfen dogru bir deger giriniz");
        }
    }
}