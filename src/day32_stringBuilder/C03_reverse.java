package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {
        //VERILEN BIR IN PUTU TERSINE CEVIRIP BIZE DONDUREN
        //BIR METHOD OLUSTURUN

        String input="Hey gidi forloop gunleri";
        String tersInput=tersineCevir(input);

        System.out.println(tersInput);
    }

    private static String tersineCevir(String input) {

        StringBuilder sb=new StringBuilder(input);

        return  sb.reverse().toString();



    }
}
