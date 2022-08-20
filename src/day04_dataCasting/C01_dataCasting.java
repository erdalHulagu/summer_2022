package day04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf=(char)(harf+1); //kod bu durumda once sagdaki islemi yapar
                                      //char yeniharf = 97+1--> 98
                                      //char variable 98 olmayacagi icin hata verir
        System.out.println(yeniHarf);
        /* bazen bir variable'a olusturuldugu data turu disindan deger atanabilir
        bunlardan bazisini java otomatik olarak kabul eder

        java eger bu deger atamasindan sorun olusacagini ( data kayiplarinin olabilcegi veya
        datanin baskalasabilecegi) gorurse bu durumda otomotik olarak bu atamayi kabul etmez,
        sizden bu atamayi istiyorsani sorumluluk almanizi bekler.*/

        int sayi1=(int)7.3;
        System.out.println("sayi1 =" +sayi1);// 7 verir fakat double olursa dogru verirdi ondalik

        double sayi2=10;
        System.out.println("sayi2 ="+sayi2);//10 verir

        int sayi3='c';
        System.out.println("sayi3 ="+sayi3);// 99 verir cunku C'nin karsiligi isci chartda 99dur

        char harf2= 98;
        System.out.println("harf2 ="+harf2);//b verir






    }
}
