package praticLessons_Day10_.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {
    /*
    1-ogretmen bilgilerini kullanicidan aliniz
    2-aldiginiz bilgilerden object ureterek yeni ogretmenler
    olusturun ve bu bilgileri yazdirin
     */
    static Scanner scan=new Scanner(System.in);
    static  List<OgretmenBilgileri>ogretmenList=new ArrayList<>();
    public static void main(String[] args) {

        System.out.println("Hos geldiniz okulumuza");

        System.out.println("isim giriniz :");


        String isim= scan.nextLine();

        System.out.println("Soyisim giriniz :");
        String soyisim= scan.nextLine();


        System.out.println("Yasinizi giriniz :");
        int yas= scan.nextInt();

        System.out.println("Bransinizi giriniz :");
        String brans= scan.next();

        scan.nextLine();

        System.out.println("Telefon numaranizi giriniz :");
        String tel= scan.nextLine();

        OgretmenBilgileri OgretmenAdayi=
                new OgretmenBilgileri(isim,soyisim,yas,brans,tel);
        ogretmenList.add(OgretmenAdayi);

        System.out.println("ogretmenList = " + ogretmenList);


    }
}
