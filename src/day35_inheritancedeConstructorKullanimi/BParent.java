package day35_inheritancedeConstructorKullanimi;

public class BParent extends AGrandParent{

    protected String isim = "isim belirtilmedi";
    protected String parentKulupAdi = "Parent kulubu";

    BParent() {
        System.out.println("Parent constructor calisti");


    }
}
