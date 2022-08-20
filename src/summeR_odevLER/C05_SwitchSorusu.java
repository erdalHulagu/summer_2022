package summeR_odevLER;

import java.util.Scanner;

public class C05_SwitchSorusu {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi= scan.nextInt();

        switch (sayi){
            case 10 :
                System.out.println("En kucuk cift rakamli sayi ");
                break;
            case 100 :
                System.out.println("En kucuk uc rakamli sayi");
                break;
            case 1000:
                System.out.println("En kucuk dort rakamli sayi");
                break;
            default:
                System.out.println("Lufen gecerli bir sayi giriniz");




        }
    }
}
