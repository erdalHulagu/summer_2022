package summeR_odevLER;

import java.util.Scanner;

public class AYLAADEM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
           System.out.println("Lutfen isminizi giriniz");
           String isim = scan.nextLine();
           isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
           System.out.println("lutfen soy isminiz girini");
           String soyisim = scan.nextLine();
           soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        System.out.println("lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas < 0 && yas > 120) {
            System.out.println("lutfen gecerli bir yas giriniz");
        } else if (yas < 10 && yas > 0){
            System.out.println(isim+"  "+soyisim+"  "+"0"+yas);
        }else{
            System.out.println(isim+"  "+soyisim+"  "+yas);


        }
    }
}

