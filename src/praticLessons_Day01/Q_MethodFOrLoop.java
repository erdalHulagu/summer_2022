package praticLessons_Day01;

public class Q_MethodFOrLoop {

    /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */
    public static void main(String[] args) {
        birkereYazdir("abbbaaacccddddeee");

    }

    private static void birkereYazdir(String str) {

        String output="";//String defoult degeri hiclik oldugu icin isleme etki etmesin
                            //diye bu sekilde atama yaptik
        for (int i = 0; i <str.length(); i++) {//int i = 0; i <=str.length()-1; i++ buda olur
            if (!output.contains(str.substring(i, i + 1))) { //tekrariz karakterleri dondurecegimiz icin sonucumuz strden
                output += str.substring(i, i + 1);   // aldigimiz herhangi bir karakteri icermesin
                                                        //icermiyorsa sonuca eklesin
            }
        }
        System.out.println(output);
    }
}
