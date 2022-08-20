package summeR_odevLER;

import java.util.Scanner;

public class C08_switch {
    public static void main(String[] args) {

        // Kullanicidan bir gun ismi isteyin hafta icinde veya hafta sonunda olup olmadigini yazdirin

        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gun= scanner.nextLine().toLowerCase();

        switch (gun){
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            default:
                System.out.println("Gecerli bir gun giriniz lutfen");
        }


    }
}
