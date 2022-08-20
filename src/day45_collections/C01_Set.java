package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        // Verilen bie Array'daki tekrar eden elementleri silip
        //tekrarsiz halini Array'e atayan bir code yaziniz

        int[]arr={4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsizSet=new HashSet<>();
        for (int each:arr) {
            tekrarsizSet.add(each);

        }
        System.out.println("Set: " +tekrarsizSet);
        int[]tekrarsizArry=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsizArry));
        int i=0;
        for (Integer each:tekrarsizSet) {
            tekrarsizArry[i]=each;
            i++;

        }
        arr=tekrarsizArry;
        System.out.println("Bizim Arrayin son hali :"+Arrays.toString(arr));
    }
}
