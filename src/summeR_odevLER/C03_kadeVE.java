package summeR_odevLER;

public class C03_kadeVE {
    public static void main(String[] args) {
        //Bir malın fiyatı 1500ytl dir.Bu mal,%18 i kadar KDVsi alınarak satılacaktır.Bu malın KDV
        //sini ve satılacağı fiyatı hesaplayıp ekrana yazdırınız.
        double fiyat,kdv;

         fiyat = 1750;
         kdv = (fiyat*0.18);


        System.out.println("KDV = " + kdv);
        System.out.println("Tamfiyat = " +(fiyat-kdv));


    }
}
