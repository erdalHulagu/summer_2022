package summeR_odevLER;

public class Od_IkiStringiBirlestirin {
    public static void main(String[] args) {
       /* 9----2 farklı String'i  ucuca ekleyen Java Kodunu yazınız.

        Test Data:
        str1: Java is
        str2: fun

        Beklenen Çıktı:
        java is fun
        */
        String str1="Benim cocuklarimin isimleri";
        String str2=" Ayla ve Adem";

        System.out.println(str1+" "+str2);
        System.out.println(str1.concat(str2));
    }
}
