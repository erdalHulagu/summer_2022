package day07_ifStatements;

import java.util.Scanner;

public class C05_ifElseStatement {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen bir karakter giriniz");
        char harf=scan.next().charAt(0);

        if((harf>='a'&&harf<='z')||(harf>='A' && harf<='Z')){
            System.out.println("girilen karakter bir harf");
        } else {
            System.out.println("girilen karakter bir harf degil");
        }

    }
}
