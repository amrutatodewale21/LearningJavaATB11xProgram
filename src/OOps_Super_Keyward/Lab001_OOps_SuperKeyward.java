package OOps_Super_Keyward;

public class Lab001_OOps_SuperKeyward {
    public static void main(String[] args) {
       amruta a1=new amruta();
       a1.display();


    }

}

class human{
    String name;
    byte age;
    byte Year_of_survival;

    void eat()
    {
        System.out.println("Human is Eating");
    }


}

class amruta extends human{
    String name;
    byte age;
    byte Year_of_survival;

    void eat() {
        System.out.println("Amruta is eating");
    }

      void amruta()
        {
            System.out.println("This is default constructor of child class");
        }

       void display()
        {
            this.eat();
            super.eat(); // is used to access parent class methods and attributes

        }





    }



