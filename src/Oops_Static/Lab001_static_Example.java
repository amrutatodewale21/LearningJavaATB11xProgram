package Oops_Static;

public class Lab001_static_Example {
    public static void main(String[] args) {
        static_example s1= new static_example();
        System.out.println(s1.b);
        System.out.println(static_example.a);
        static_example.method2();




    }
}

class static_example{
    static int a = 10;
    int b=20;
    void method1()
    {
        System.out.println("This is normal function");
    }

    static void method2()
    {
        System.out.println("This is static method");
    }
}
