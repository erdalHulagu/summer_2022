package summeR_odevLER;

import java.util.Scanner;

public class C04_BoyUzunlugu {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen boy uzunlugunuzu giriniz");

        double boy=scan.nextDouble();

        if(boy>1.75|| boy==1.75){
            System.out.println("UZUN BOYLUSUN");
        }else{
            System.out.println("KISA BOYLUSUN");
        }
    }

}
