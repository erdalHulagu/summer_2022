package day07_ifStatements;

import java.util.Scanner;

public class C07_ifElseIfStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Yasinizi girin lutfen");
        int yas= scan.nextInt();
        if(yas<0){
            System.out.println("lutfen gecerli bir yas girini");
            System.out.println("lutfen bir yas giriniz");
        }else if (yas<65){
            System.out.println("emekli olamazsin "+(65-yas)+"yil daha calismalisin");
        }else{
            System.out.println("emekli olabilirsin");
        }


    }
}
