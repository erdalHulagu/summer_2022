package day36_inheretanceDataTypeKullanimi;

public class APersonel {
    String isim="Isim belirtilmedi";
    String soyisim="Soyisim belirtilmedi";
    String departman="Departman belirtillmedi";

    protected void maas(){
        System.out.println("Tum peronelimiz maas alabilir");

    }
    protected void sigorta(){
        System.out.println("Tum peronelimiz sigorta yabilir");

    }
}
