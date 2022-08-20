package day32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java");
        StringBuilder sb2=new StringBuilder("Java");
        String str="java";

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true

        // StringBuilder'da equelse methodu ancak ayni obje ve ayni deger olursa true doner
        //Stringdeki gibi dusunmemek lazim.

        System.out.println(sb1.equals(str));
        System.out.println(sb1.compareTo(sb2));

        StringBuilder sb3=new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3));//-4

        //Compare to( ) methodu iki stringBuilderi bastan baslayarak harf harf karsilastirir
        // ilk harflere ayni ise 2. lere onlarda ayniise 3. lere taki farkli olan iki aralarindaki
        //aski farkini verir
    }
}
