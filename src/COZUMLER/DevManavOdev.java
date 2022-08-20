package COZUMLER;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevManavOdev {
    static List<String>sepet=new ArrayList<>();

    public static List<String> manavUrunlerList(){
        List<String> urunlerList=new ArrayList<>();
        urunlerList.add("Domates");
         urunlerList.add("Patates");
         urunlerList.add("Biber");
         urunlerList.add("Soğan");
         urunlerList.add("Havuc");
         urunlerList.add("Elma");
         urunlerList.add("Muz");
         urunlerList.add("Cilek");
         urunlerList.add("Kavun");
         urunlerList.add("Uzum");
         urunlerList.add("Limon");

         return urunlerList;
    }
    public static List<Double> manavUrunlerFiyat(){
         List<Double> urunlerFiyat=new ArrayList<>();
         urunlerFiyat.add(20.10);
         urunlerFiyat.add(30.20);
         urunlerFiyat.add(30.50);
         urunlerFiyat.add(20.30);
         urunlerFiyat.add(30.10);
         urunlerFiyat.add(50.20);
         urunlerFiyat.add(100.90);
         urunlerFiyat.add(60.10);
         urunlerFiyat.add(40.30);
         urunlerFiyat.add(20.70);
         urunlerFiyat.add(10.50);

         return urunlerFiyat;
    }


    public static void giris(){
        System.out.println("========HOS GELDINIZ========");
        System.out.println("");
        System.out.println("====Lutfen urun seciniz====");
        System.out.println("");
        System.out.println("No    Urun         Fiyat");
        System.out.println("=========================");
        System.out.println("00    Domates     20.10 TL");
        System.out.println("01    Patates     30.20 TL");
        System.out.println("02    Biber       30.50 TL");
        System.out.println("03    Soğan       20.30 TL");
        System.out.println("04    Havuc       30.10 TL");
        System.out.println("05    Elma        50.20 TL");
        System.out.println("06    Muz         100.90 TL");
        System.out.println("07    Cilek       60.10 TL");
        System.out.println("08    Kavun       40.30 TL");
        System.out.println("09    Uzum        20.70 TL");
        System.out.println("10    Limon       10.50 TL");
        Scanner scan=new Scanner(System.in);
        scan.nextLine();
        System.out.println(islem());
    }
    static String islem(){
        String toplam="";
        Scanner scan=new Scanner(System.in);

        for (int i = 0; i <manavUrunlerList().size(); i++) {
            scan.nextLine();
            sepet.get(i);



        }
        return islem();
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       giris();




    }



}

