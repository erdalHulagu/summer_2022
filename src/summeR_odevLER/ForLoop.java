package summeR_odevLER;

public class ForLoop {
    public static void main(String[] args) {

        String str="Karavan";
        for (int i = str.length()-1; i >=0 ; i--) {

            System.out.print(str.substring(i,i+1));

        }

    }
}
