package day17_nestedForLOop;

public class C06_NestedForLoop {
    public static void main(String[] args) {
        /* verilen sthringi asagidaki gibi yazdiran bir program yazin
         input deniz
         d
         de
         den
         deni
         deniz
         */
        String input = "Deniz";

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(input.substring(j - 1, j));
            }
            System.out.println("");
        }

    }
}
