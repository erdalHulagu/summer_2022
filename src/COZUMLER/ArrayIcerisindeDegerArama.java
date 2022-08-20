package COZUMLER;

import java.util.ArrayList;
import java.util.List;

public class ArrayIcerisindeDegerArama {
    public static void main(String[] args) {

        int[] arr={1551,1223,1443,1267,1789,1023,2020};

        int arananDeger1=2020;
        int arananDeger2=2010;

        List<Integer> sayilar=new ArrayList<>();

        for (int i = 0; i <arr.length; i++) {
            sayilar.add(arr[i]);
        }
        System.out.println(sayilar.contains(arananDeger1));
        System.out.println(sayilar.contains(arananDeger2));
    }
}
