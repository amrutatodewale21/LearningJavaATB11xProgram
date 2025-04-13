package Oops_Abstract_class;

public class Lab001_Abstract_class {
    public static void main(String[] args) {
        car c1=new car();
        c1.drive();
    }
}

abstract class vehicle{  // abstract class should have at least single abstract method
    abstract void start_engine();
    abstract void stop_engine();
    void vehicle()
    {
        System.out.println("This is default constructor");
    }
    void simple_method()
    {
        System.out.println("This is simple method");
    }


}
class car extends vehicle{ // This is concrete class having implementation of abstract methods

    @Override
    void start_engine() {
        System.out.println("engine has started");
    }

    @Override
    void stop_engine() {
        System.out.println("engine has stopped");
    }

    void drive()
    {
        start_engine();
        stop_engine();



    }
}
