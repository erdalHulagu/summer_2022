package COZUMLER;

public class Od1_Cozumler {
    public static void main(String[] args) {

        //Alttaki multi dimesinoal Array'in butun elemanlarinin carpimini bulun

        int[][]arr={{1,2,3},{4,5,6}};

        int carp=1;
        int sonuc=0;

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i].length; j++) {
                carp*=arr[i][j];

            }
            sonuc=carp;

        }
        System.out.println(sonuc);
    }
}
