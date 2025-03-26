package Strings;

public class Lab003_String_Functions {
    public static void main(String[] args) {
        String name = "amruta";
        String name1 = "amruta";
        String name3 = new String("hello"); // stores in object area
        String name4 = new String ("hello");
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.concat(" Todewale"));
        System.out.println(name.contains("krts"));//return true or false
        System.out.println(name1 == name);// true // '==' this operator tells its location
        System.out.println(name3==name4);// false
        System.out.println(name == name4);//false
        System.out.println(name.equals("Amruta"));// false
        System.out.println(name.equalsIgnoreCase("AmRuTa"));
        System.out.println(name.indexOf("a"));
        // tells first occurance
        System.out.println(name.replace('a', 'N')); // replace all occurances
        String split1 = "tejaran#old675#yhun";
        String[] split = split1.split("#");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);
        System.out.println(name.substring(0,4)); //amru, skips 4th char
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.startsWith("s")); // true or false
        System.out.println(name.endsWith("A"));
        String str1 = "   Krishna  ";
        System.out.println(str1.trim()); // removes spaces
        System.out.println(name.compareTo("amruta")); // returns 0 for true and negative for false
        String str22 = "Rohit";
        String str33 = " rana";
        String result = str22 + str33;
        System.out.println(result);
        String l1 = "tarkarrlii";
        System.out.println(l1.lastIndexOf("r"));
        System.out.println(l1.charAt(7));























    }
}
