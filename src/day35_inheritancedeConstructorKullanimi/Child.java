package day35_inheritancedeConstructorKullanimi;

public class Child extends BParent{
    String isim="Child isim belirtilmedi";
    protected String childKulupAdi="Child kulubu";
    Child(){

        System.out.println("Child contructor calistii");
    }

    public static void main(String[] args) {
       AGrandParent gp1=new AGrandParent();

        /* Bu objeyi olusturmak icin Grandpa Constructor calisir
        parent veya child cons calismaz
         */
        Child child1=new Child();
        child1.parentKulupAdi="Child1";
        child1.grandpaKulupAdi="Child2";
        // Child1 objesi icin Chikld cons calisir

        /*
        Java'da bir class'i kullanabilmek icin
        o class tan obje olusturur dolayisiyla
        class'in costructorunu kullanirdik

        Java inheretance de parent classlardaki ozellikleri kulllanabilmek icin
        o class'larin constructorlarini calistiran bir yapi olusturmustur

        ornegin biz child classinda bir obje olusturmak istedigimizde
        Child cons. kullaniriz

        java Child(){}  gordugunde once parent cons. calistirmam lazim der
        buradan parent cons'a gider
        Parenet clasinda parent(){} gorunce once bunun cons. calistirmam lazim der
        Boylece extens keyword olmayan class'a gidereek onu son baz alir ve biter.

         */



    }


}
