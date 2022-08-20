package summeR_odevLER;

public class Od_WhileLoop {
    public static void main(String[] args) {

        int sayi = 5, carp = 0, sayi2 = 1;

        while (sayi2 < 11) {
            carp = sayi * sayi2;
            System.out.println(sayi + " * " + sayi2 + " = " + carp);
            sayi2++;
        }

    }
}