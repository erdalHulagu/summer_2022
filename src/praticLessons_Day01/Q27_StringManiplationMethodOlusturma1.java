package praticLessons_Day01;

import java.util.Scanner;

public class Q27_StringManiplationMethodOlusturma1 {
    /*
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir string giriniz :");
        String str= scan.nextLine().toLowerCase();


        System.out.println(xyzVarmix(str));
    }

    private static boolean xyzVarmix(String str) {
        if(str.contains("xyz")){
            return true;
        }else{
            return false;
        }
    }
}
