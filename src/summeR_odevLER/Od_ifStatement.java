package summeR_odevLER;

import java.util.Scanner;

public class Od_ifStatement {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen S,D,T,E harflerinden birini girin");
        int harf=scan.next().toLowerCase().charAt(0);

        //1.  if ile cozum

        if(harf=='s'){
            System.out.println(" software");
        } else if (harf=='d') {
            System.out.println(" developer");
        } else if (harf=='e') {
            System.out.println("engineer");
        } else if (harf=='t') {
            System.out.println("tester");
        }else{
            System.out.println("Lutfen dogru bir karakter giriniz ");
        }
        // 2.Switch ile cozum

        switch (harf){
            case 'd':
                System.out.println("developer");break;
            case 's':
                System.out.println("softwere");break;
            case 'e':
                System.out.println("enginier");break;
            case 't':
                System.out.println("tester");break;
            default:
                System.out.println("lutfen dogru bir karakter giriniz");

        }


    }
}
