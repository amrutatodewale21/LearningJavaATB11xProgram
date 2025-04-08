package Polymorphism;

public class Method_overriding {
    public static void main(String[] args) {
        testase1 t1 = new testase1();
        t1.openbrowser();
        commontoall c1=new commontoall();
        c1.openbrowser();
    }

}

class commontoall {
    void openbrowser()
    {
        System.out.println("Open edge browser");
    }

}

class testase1 extends commontoall{
    void openbrowser()
    {
        System.out.println("Open chrome browser");
    }

}
