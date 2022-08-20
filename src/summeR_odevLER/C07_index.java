package summeR_odevLER;

import java.util.Scanner;

public class C07_index {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println( "Lutfen bir cumle ve bir harf giriniz");

        String cumle= scan.nextLine();

        System.out.println("bir harf girin lutfen");

        String harf= scan.next();

        if(cumle.indexOf(harf)==-1){
            System.out.println("harf kullanilmamis");

        }else{
            System.out.println("harf kullanilmis");

        }










        }
    }

