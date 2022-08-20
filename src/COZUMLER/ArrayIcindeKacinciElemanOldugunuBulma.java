package COZUMLER;

import java.util.ArrayList;
import java.util.List;

public class ArrayIcindeKacinciElemanOldugunuBulma {
    public static void main(String[] args) {
        int[]arr={12,15,43,23,56,76,78,90,77,43};

        int arananDeger=77;
        int arananIndex=0;

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {
            sayilar.add(arr[i]);
        }
        arananIndex=sayilar.indexOf(arananDeger);
        System.out.println("56 sayisi Array'in "+arananIndex+". elemani");


    }
}
