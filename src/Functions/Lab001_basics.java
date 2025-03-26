package Functions;

public class Lab001_basics {
    public static void main(String[] args) {
       f1();
       int a=f2();
       boolean b=f3();
        System.out.println(a);
        System.out.println(b);

    }
    static void f1()
    {
        System.out.println("f1 is called");
    }
    static int f2()
    {
        return 24;
    }
    static boolean f3()
    {
       return true;
    }
}
