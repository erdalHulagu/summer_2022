package summeR_odevLER;

import java.util.Scanner;

public class C06_switchSorusu{
    public static void main(String[]args){

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen (S,D,E,T) harflerinden birini girin");
        int harf= scan.next().toUpperCase().charAt(0);



        switch (harf){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Devoliper");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("Testing");
        }





        }





    }

