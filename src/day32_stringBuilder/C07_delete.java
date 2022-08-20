package day32_stringBuilder;

public class C07_delete {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Java her zaman guzeldir");

        sb.delete(8,9);
        System.out.println(sb);//Java herzaman guzeldir

        sb.deleteCharAt(7);//Java hezaman guzeldir
        System.out.println(sb);

        //bastan her loop'ta ilk harfi silip kalani yazdiralim

        int son=sb.length();
        for (int i = 0; i <son; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);//ava hezaman guzeldir
            /*ava hezaman guzeldir
               va hezaman guzeldir
               a hezaman guzeldir
                hezaman guzeldir
               hezaman guzeldir
               ezaman guzeldir
               zaman guzeldir
               aman guzeldir
               man guzeldir
               an guzeldir
               n guzeldir
                guzeldir
               guzeldir
               uzeldir
               zeldir
               eldir
               ldir
               dir
               ir
               r
               */

    }
}
}