package praticLessons_Day01;

public class Q18_NestedTernary {

/*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */
    public static void main(String[] args) {
       char finalNotu= 'B';

       String result=finalNotu=='A'?"Gayet basarili": finalNotu=='B'?"basarili"
               :finalNotu=='C'?"ha gayret":"digerleri";
        System.out.println("result = " + result);


    }
}
