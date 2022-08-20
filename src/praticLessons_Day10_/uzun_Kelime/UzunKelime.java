package praticLessons_Day10_.uzun_Kelime;

import java.util.Scanner;

public class UzunKelime {
    /*
    1-KULLANICIDAN GELEN CUMLEYI PARAMETRE OLARAK ALAN
    2-VE CUMLEDEKI EN UZUN KELIMEYI RETURN EDEN LONGESTWORD(SENTENCE) METHODU CREATE EDINIZ
    3-trick--- AYNI UZUNLUKTA IKI VEYA DAHA FAZLA KELIME VARSA,sTRINGDEKI EN UZUN ILK SOZCUGU RETURN EDIN
    4-NOKTALAMA ISARETLERIINI DIKKATE ALMAYIN VE CUMLENIN BOS OLMAYACAGINI VAR SAYIN
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("bir cumle giriniz");

        String cumle=scan.nextLine();

        enUzunKelime(cumle);

        // ben bugun javayi cok sevdim ama cok zorlandim.

        System.out.println("enUzunKelime :"+enUzunKelime(cumle));


    }

   public static String enUzunKelime(String cumle) {

        String arr[]=cumle.split(" ");
        int max=0;
        String longestWord="";

       for (int i = 0; i <arr.length; i++) {
           if(arr[i].length()>max){
               max=arr[i].length();

               longestWord=arr[i];



       }



       }
        return  longestWord;

    }
}
