package COZUMLER;

import java.util.Arrays;

public class ArraySayilarininOrtalamasiniHesaplama {
    public static void main(String[] args) {

        double []arr={20,30,25,35,-16,60,-100};

        double toplam=0;
        double ortalama=0;

       for (double i =0; i <arr.length;i++) {
          toplam+=i+i;
          ortalama=toplam/i;
       }
        System.out.println("toplam :"+toplam+"    ortalama :"+ortalama);
    }
}
