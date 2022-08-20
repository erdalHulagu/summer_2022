package day35_inheritancedeConstructorKullanimi;

public class FMemur extends EMuhasebe{
    /*
    Exstends Keyword kullanilan classlarda
    ister default cons. bulunsun istersek yeni conslar olusturalim
    Java cons'in ilk satirina
    super(); constructor call yazar

    super(); cons. call, default cons'a benzer
    gorunmesede orada vardir ve calisir
    ancak biz ilk satira farkli bir cons. call yazarsak
    java super(); cons'i siler.

    eger biz mudahale edip kendi cons. callumusu olusturmazssak
    javanin default olarak olusturdugu cons. herzaman parametresizdir
     super();
     */

    FMemur(){
        System.out.println("Memur parametresiz cons");
    }
    FMemur(String isim){
        System.out.println("Memur parametreli cons");
    }

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("Ali");
    }
}
