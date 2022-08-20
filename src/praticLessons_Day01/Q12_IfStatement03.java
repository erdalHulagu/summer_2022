package praticLessons_Day01;

import java.util.Scanner;

public class Q12_IfStatement03 {
    /*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */
    public static void main(String[] args) {
        System.out.println("Lutfen is unvaninizi giriniz");
        Scanner scan=new Scanner(System.in);
        String jobTitle=scan.nextLine().toLowerCase();
        System.out.println("job Title ="+jobTitle);
        if(jobTitle.equals("qa")){
            System.out.println("Qualty Analiyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");
        } else if (jobTitle.equals("ba")) {
            System.out.println("Bussines Manager");
        } else if (jobTitle.equals("pm")) {
            System.out.println("Project Manager");
        }
        switch (jobTitle){
            case"qa":
                System.out.println("Qualty Analiyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Bussines Manager");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlis job title girdiniz");
        }


    }
}
