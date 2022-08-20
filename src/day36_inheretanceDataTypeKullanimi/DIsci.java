package day36_inheretanceDataTypeKullanimi;

import java.util.*;

public class DIsci extends BMuhasebe{
    protected int saatUcreti = 11;
    protected int gunlukMesai = 7;
    protected void maasIsci() {
        System.out.println("Isciler : " + (30 * gunlukMesai * saatUcreti + " maas alir"));
    }
    protected void ozelSigortaIsci() {

        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilirler");
    }

    public static void main(String[] args) {
        BMuhasebe isc1=new DIsci();
        /*
        Bir obje olusturulurken Data turu ve Const. ayni class'dan ise
        direk o class'a gideriz

        Eger Data turu ve Const. farkli ise
        obje const.'in oldugu class'in objesidir
        ancak bizden istenen
        Bir iscinin muhasebe classindaki
        tum calisanlarla beraber sahip oldugu genel ozellikleri yazdirir

         */
        System.out.println(isc1.gunlukMesai);//M-->8
        System.out.println(isc1.saatUcreti);//M-->10
        isc1.ozelSigorta();//M
        isc1.maas();//M
        isc1.sigorta();//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isc1.isim);//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isc1.soyisim);//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isc1.departman);//Personelden yapacak muhasebede olmadigi icin


        APersonel isci2=new DIsci();

        //System.out.println(isci2.gunlukMesai);//M-->8
       // System.out.println(isci2.saatUcreti);//M-->10
        //isci2.ozelSigorta();//M
        isci2.maas();//M
        isci2.sigorta();//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isci2.isim);//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isci2.soyisim);//Personelden yapacak muhasebede olmadigi icin
        System.out.println(isci2.departman);//Personelden yapacak muhasebede olmadigi icin
   /*
     Eger Data turu olan  class'da aradigimiz ozellik yoksa
     onun parent'ina gidebilir, ama child'a donus olmaz
     aradigi ozelligi bulamazsa CTE verir

     */
        List<String>list=new LinkedList<>();
        Deque<String>list2=new LinkedList<>();
        Queue<String>list3=new LinkedList<>();
        /*
        Hepsi Linklist  olsada
        list1 List gibi davranir
        list2 Deque gibi davranir
        list3 Queve gibi davranir
         */




    }
}
