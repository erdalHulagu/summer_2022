package day18_while_doWhile;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        //9 dan 190a kadar 7 kat olan tum tam sayilari yazdirin
        int bas=9;
        int bitis=190;

        int temp=bas;

        while (temp<bitis){
            if(temp%7==0){
                System.out.print(temp+ "  ");
            }
        temp++;
        }

        //do wkille loop ile yapalim
        do{
            if(temp%7==0){
                System.out.println(temp+"  ");

            }
            temp++;
        }while (temp<bitis);


    }
}
