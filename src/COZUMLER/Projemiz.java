package COZUMLER;

import java.util.Scanner;

public class Projemiz {
    /*
====================PROJEMIZ===================================
     * ilk programa girildiginde bizi bir menu karsilasin bu secenekler
        1 manav,
        2 sarkuteri,
        3 market
        secime gore ,
        4-urunleri listele ve
        5-fiyatlari gelsin
     *
     * Basrili Market alış-veriş programı.
        1. Adım:* Ürünler ve fiyatları içeren listeleri oluşturunuz.

            No   Ürün    Fiyat
             ===== ======= ========
        00 Domates 2.10 TL ,
        01 Patates 3.20 TL ,
        02 Biber 1.50 TL ,
        03 Soğan 2.30 TL  ,
        04 Havuç 3.10 TL
        05 Elma 1.20 TL
        06 Muz 1.90 TL
        07 Çilek 6.10 TL
        08 Kavun 4.30 TL
        09 Üzüm 2.70 TL
        10 Limon 0.50 TL
     *
     * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
        * 3. Adım: Kaç kg satın almak istediğini sorunuz.
          4. Adım: Alınacak bu ürünü
     * sepete ekleyiniz ve Sepeti yazdırınız.
         5. Başka bir ürün alıp almak
     * istemediğini sorunuz.
         6. Eğer devam etmek istiyorsa yeniden ürün seçme
     * kısmına yönlendiriniz.
         7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve
     * ödeme sonrasında programı bitiriniz
     */
    public static void main(String[] args){
        giris();




    }

    public static void giris() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen alisveris yapmak istediginiz alani seciniz");

        System.out.println("00 Domates  : 2.10 tl"+
                "01 Patates  : 3.20 tl"+
                "02 Biber    : 1.50 tl"+
                "03 Sogan    : 2.30 tl" +
                "04 Havuc    : 3.10 tl" +
                "05 Elma     : 1.20 tl" +
                "06 Muz      : 1.90 tl" +
                "07 Cilek    : 6.10 tl" +
                "08 Kavun    : 4.30 tl" +
                "09 Uzum     : 2.70 tl" +
                "10 Limon    : 0.50 tl");


    }

}
