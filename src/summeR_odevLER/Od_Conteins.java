package summeR_odevLER;

import java.util.Scanner;

public class Od_Conteins {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle = scan.nextLine().toLowerCase();
        System.out.println("lutfen bir haf giriniz");
        String harf = scan.next().toLowerCase();

        if (cumle.contains(harf)) {
            System.out.println("harf cumlede geciyor");
        } else if (!cumle.contains(harf)) {
            System.out.println("Harf cumlede gecmiyor");
        }
    }
}
