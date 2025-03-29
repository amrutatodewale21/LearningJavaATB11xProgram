package Strings;

public class Stringbuffer_examples {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println(sb);
        System.out.println(sb.append("world"));
        System.out.println(sb.insert(5, "java"));
        System.out.println(sb.replace(0,5,"hiiii"));
        System.out.println(sb.delete(0,3));
        System.out.println(sb.reverse());
//        System.out.println(sb.setCharAt(1,'e'));




    }

}
