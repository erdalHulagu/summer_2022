package summeR_odevLER;

import java.util.Scanner;

public class C10_ornEk_indexOf {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim soy isim girin lutfen");
        String isim = scan.nextLine();


        if (isim.indexOf("a") > -1) {
            System.out.println("Girdiginiz isim a harfi iceriyor");
        } else if (isim.indexOf("a")==-1) {
            if (isim.indexOf("Z")>-1)
            System.out.println("Girdiginiz isim Z harfi iceriyor");
        }else{
            System.out.println(" Girdiginiz isim a ve Z harfleri icermiyor");
        }
    }
}




