package summeR_odevLER;

public class Od_TerstenYazdir2 {
    public static void main(String[] args) {
        /*8----
        Girilen String değerde tersten yazan Java kodunu yazınız.
        Test Data:
        java
        avaj
                */
        String kelime = "erdal";
        String tersKelime = kelime.substring(kelime.length());

        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.substring(i, i + 1);
        }
        System.out.println(tersKelime);
    }
}
