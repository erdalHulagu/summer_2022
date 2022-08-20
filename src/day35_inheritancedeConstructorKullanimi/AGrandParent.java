package day35_inheritancedeConstructorKullanimi;

public class AGrandParent {
    protected String isim = "Grandpa ismi belirtilmedi";
    protected String grandpaKulupAdi = "Grantpa kulubu";

    /*
    her class'da gorunmese bile bir consructor vardir
    bu clas'dan obje olusturmak istedigimizde
    default consructor devreye girecektir

    Default consructor'u gozlemleyemeyecegimic icin onun yerine
    yerine kullanabilecek parametresiz constructor kullanalim
     */


    AGrandParent() {
        System.out.println("Grantpa constructor calisti");

    }
}
