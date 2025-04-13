package Oops_Inerface;

public class Lab001_Oops_Interface {
    public static void main(String[] args) {
        child c1 = new child();
        c1.money();

    }
}

interface mother{
    void money();


}

interface father{
    void money();
}

class child implements mother,father{


    @Override
    public void money() {
        System.out.println("This is child money");
    }
}

