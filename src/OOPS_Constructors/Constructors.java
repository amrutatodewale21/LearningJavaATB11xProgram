package OOPS_Constructors;

public class Constructors {
    public static void main(String[] args) {
        person p1=new person();
        person p2=new person("John","London",45,34567890,true);
        p2.eat();
        p2.sleep();
        p2.walk();


    }

}

class person{



    String name;
    String address;
    int age;
    long phone_number;
    boolean is_male;

    void eat()
    {
        System.out.println(name + " is eating");
    }
    void sleep()
    {
        System.out.println(name + " is sleeping");
    }
    void walk()
    {
        System.out.println(name + " is walking");
    }

    person()
    {
        System.out.println("default constructor");
    }
    person(String name_arg,String address_arg, int age_arg, long phone_arg, boolean is_male_arg)
    {
        this.name = name_arg;
        this.address = address_arg;
        this.age = age_arg;
        this.phone_number=phone_arg;
        this.is_male = is_male_arg;


    }

}
