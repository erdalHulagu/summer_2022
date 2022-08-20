package day35_inheritancedeConstructorKullanimi;

public class GToyota {
    GToyota(){
        System.out.println("Toyota parametresiz cons");
    }

    GToyota(String isim){
        //super(isim); extends olmadigi icin cons. callu java kabul etmez
        System.out.println("Toyota parametreli cons");

    }
}
