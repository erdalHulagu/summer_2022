package summeR_odevLER;

import java.util.Arrays;

public class Od_MultiDimensionalArrays {
    public static void main(String[] args) {
        /*Asagidaki Array'in ic Array'lerindeki elemanlarinin toplamini
        birer birer bulan ve bu araydeki herbir sonucu yeni bir Array'in elemani yapan
        ve yeni Arrayi ekrana yazdiran bir priogram yaziniz
        Array{{1,2,3},{4,5},{6,7}}
         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};

        int[] yeniArray = new int[arr.length];
        int toplam = 0;

        for (int i = 0; i <=arr.length-1; i++) {
            for (int j = 0; j<=arr[i].length-1; j++) {
               toplam+=arr[i][j];

            }
            yeniArray[i]=toplam;
        }
        System.out.println(Arrays.toString(yeniArray));
    }
}
