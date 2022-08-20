package summeR_odevLER;

import java.util.Scanner;

public class Od_ForLoop2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle = scan.nextLine();
        terstenCevir(cumle);


    }

    private static void terstenCevir(String cumle) {
        String tersCumle = cumle.substring(cumle.length() - 1);

        for (int i = cumle.length() - 2; i >= 0; i--) {
            tersCumle += cumle.substring(i, i + 1);
        }
        System.out.print(tersCumle);
    }
}

