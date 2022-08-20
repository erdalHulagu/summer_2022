package COZUMLER;

import java.util.Arrays;
import java.util.Scanner;

public class Od3_Cozumler {
    public static void main(String[] args) {
        /*Verilen bir Array'den istenen degere esit olan elemanlari kaldirip
        kalanlari yeni bir Array olarak yazdiran bir metod yaziniz.
        */
       int[]arr={1,2,5,4,7,9,0,1,4,3,2,1,1,1};
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir deger giriniz");
        int deger=scan.nextInt();

       kaldiripYazdirma(arr,deger);

    }

    private static void kaldiripYazdirma(int[] arr, int deger) {

        String[]yeniArr=new String[arr.length];
        for (int i =0; i < arr.length; i++) {
            if(!(arr[i]==deger)){
            yeniArr[i]+=arr[i];
            }
        }
        System.out.println(Arrays.toString(yeniArr));
    }
}


