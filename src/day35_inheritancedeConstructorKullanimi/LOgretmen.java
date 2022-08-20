package day35_inheritancedeConstructorKullanimi;

public class LOgretmen {
    LOgretmen(){

        System.out.println(" LOgretmen parametresiz cons.");

    }
    LOgretmen(String isim){
    this();
        System.out.println(" LOgretmen parametreli cons.");
    }

    public static void main(String[] args) {
        MMatematikciler obj1=new MMatematikciler("Tugba");
    }
}
