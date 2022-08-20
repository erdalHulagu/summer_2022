package day36_inheretanceDataTypeKullanimi;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CMemur extends BMuhasebe {
    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;


    protected void maas() {
        System.out.println("Memurlar minimum : " + (30 * gunlukMesai * saatUcreti + " maas alir"));

    }

    protected void ozelSigorta() {
        System.out.println("memurlar %60 indirimli ozel sigorta yaptirabilirler");
    }

    public static void main(String[] args) {

        CMemur mmr1 = new CMemur();
        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12
        mmr1.ozelSigorta();//"memurlar %60 indirimli ozel sigorta yaptirabilirler
        mmr1.maas();//Memurlar : 3240 maas alir
        mmr1.sigorta();// Personelden sigorta bilgisini alacak
        System.out.println(mmr1.isim);//personelden alir
        System.out.println(mmr1.soyisim);//personelden alir
        System.out.println(mmr1.departman);//personelden alir

        BMuhasebe mhsb1=new BMuhasebe();
        /*,
        hernekadar memur classinin icinde olsamda
        olusturdugum obje Muhasebe class'indan
        cunku data turu ve constructoor BMuhasebe

        String str"murat";
        ArrayList<Integer>list=new ArrayList<>();
        Integer sayi=20;

        BMuhassebe clasida obje olusturulabilen bir class'dir yani Data turudur.
        */
        System.out.println(mhsb1.gunlukMesai);//8 MUhasebe clasinden aldi
        System.out.println(mhsb1.saatUcreti);//10 Muhasebe clasindan aldi
        mhsb1.ozelSigorta();//muhasebe clasindan alir
        mhsb1.maas();//Muhasebe       ''     ''
        mmr1.sigorta();//Tum peronelimiz sigorta yabilir
        System.out.println(mhsb1.isim);//personelden alir
        System.out.println(mhsb1.soyisim);//personelden alir
        System.out.println(mhsb1.departman);//personelden alir


    }


    }

