package day28_staticBlog;

public class C03_passByValue {
    public static void main(String[] args) {
        /* %25 indirimli fiyati hesaplatip bize donduren
        bir method olusturun
         */
        double satisFiyati=100;
        double indirimOrani=25;
        
        double indirimliFiyat=indirimliFiyatHesapla(satisFiyati);
        System.out.println("indirimliFiyat = " + indirimliFiyat);;
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
        System.out.println("indirimliFiyat = " + indirimliFiyat);
    }

    public static double indirimliFiyatHesapla(double satisFiyati) {
        double indirimliFiyat=satisFiyati*0.75;
        
        
        return indirimliFiyat;
    }
}
