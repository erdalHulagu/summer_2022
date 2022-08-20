package summeR_odevLER;

public class C09_StringManipulation {
    public static void main(String[] args) {
        /* String metodlarini kullanarak "java ogrenmek123 Cok@" stringini
        "Java ogrenmekcok guzel" seklinde yazdirin
        */

        String str="java ogrenmek123 Cok@";
        System.out.println(str.replace("@","  guzel").
                replace("1","").replaceAll("2","").
                replace("3",""));





    }
}
