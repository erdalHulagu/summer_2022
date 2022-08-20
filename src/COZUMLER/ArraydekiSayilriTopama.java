package COZUMLER;

import java.util.Arrays;

public class ArraydekiSayilriTopama {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,10};

        int toplama=0;
        int sonuc=0;
        for (int i = 0; i <=arr.length; i++) {
            toplama+=i;
        }
        System.out.println((toplama));
    }
}
