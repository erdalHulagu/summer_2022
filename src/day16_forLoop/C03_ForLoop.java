package day16_forLoop;

public class C03_ForLoop {
    public static void main(String[] args) {
        //10 ve 30 arasindaki sayilari(10 ve 30 dayil
        //aralarinda virgul olarak yazdirir
        int bas = 10;
        int son = 30;

        for (int i = bas; i <=son ; i++) {

            if(i<son){
                System.out.print(i+",");
            }else{
                System.out.println(i);

            }
        }
    }
}
