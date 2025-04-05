package OOps_Inheritance;

public class Lab001_single_inheritance {

    public static void main(String[] args) {
        child c1=new child();
        c1.f1();
        c1.f2();
        System.out.println(c1.a);

        c1.f11();

        superclass s1 = new child(); // Dynamic dispatch
        s1.f2(); // function will be called from child class , if not present in child class will be called from parent class else from superclass itself

        superclass s2= new parent();
        parent p1= new child();











    }


}

