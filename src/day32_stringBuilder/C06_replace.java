package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder("calm down");

        sb.replace(5,10,"up");//calm up
        System.out.println(sb);

        sb.replace(4,5,"---");//calm---up
        System.out.println(sb);
        sb.replace(4,7,"");//calm up
        sb.replace(4,7," dawn");
        System.out.println(sb);//calm dawn
    }
}
