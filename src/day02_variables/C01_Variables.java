package day02_variables;

public class C01_Variables {
    public static void main(String[] args) {
           int              not                  =              60            ;
        //data turu    variable isim   assigment sign        variable      islem bitti isareti

        int not2    =        70;
        // variable        deger
        // java once degeri hesaplar sonra assign islemini yapar
        //not2'yi 80 yapalim tekrar int yazilmaz
        not2=80;
        /*variable degeri degistirilebilinir, lakin ilkinden sonra kacdefa deger verilirse
        verilsin tekrar int yapmak gerekmez
         */
        //yeni bir variable olusturalim, deger ilk iki variablenin ortalamasi olsun
        int ort = (not + not2)/2;
        System.out.println(ort);
        // cift tirnak icinde "" icinde yazilan hersey metindir



          }
}
