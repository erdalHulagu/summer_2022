package day28_staticBlog;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFityati=100;

        System.out.println(indirimliFiyat(satisFityati));//90
        System.out.println(satisFityati);
        System.out.println(indirimliFiyat(satisFityati));
        /*Iki farkli methodda satis fiyati isminde variables olabilir
        java buna itiraz etmez cunku scope'lari farklidir
         */

    }

    public static double indirimliFiyat(double orjinalFiyat) {
        // Metodumuz %10 indirim yapip
        //yeni fiyatini main methoda dondursun
        double satisFiyati=orjinalFiyat*0.9;


        return satisFiyati;

    }
}
