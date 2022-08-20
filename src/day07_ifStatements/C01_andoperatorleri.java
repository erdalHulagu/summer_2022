package day07_ifStatements;

public class C01_andoperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        System.out.println(a > 0 && b < 20 && c >= b); // 1,1,1   true

        System.out.println(a < 0 && b < 20 && c >= b);//0,1,1   false bu yanlis gordumu digerlerine bakmaz

        System.out.println(a < 0 & b < 20 & c >= b); // 0,1,1 false bu yanlista digerlerini inceler
                                                     // bu hepsini calistirdigi icin yavas calisir
        /*
        Java and & operatoru bize iki secenek sunar

         */



    }
}
