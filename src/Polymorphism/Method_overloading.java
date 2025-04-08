package Polymorphism;

public class Method_overloading {
    public static void main(String[] args) {
        parent p = new parent();
        p.add("Bharat","Mahan");
        p.add(5,7);
        p.add(3.15,3.44,9.78);

    }


}
class parent{
    int add(int a, int b)
    {
        System.out.println(a+b);
        return a+b;
    }
    double add(double a,double b,double c)
    {
        System.out.println(a+b+c);
        return a+b+c;

    }
    String add(String a , String b)
    {
        System.out.println(a+b);
        return a+b;

    }
}

