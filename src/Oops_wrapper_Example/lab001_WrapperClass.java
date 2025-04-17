package Oops_wrapper_Example;

public class lab001_WrapperClass {
    public static void main(String[] args) {

        Mobile iphone = new Mobile(120000,"iphone16", 11.0);
        System.out.println(iphone.getPrice());
        iphone.setPrice(300000);
        System.out.println(iphone.getPrice());
        iphone.calling();



    }
}

class Mobile extends cellular{
    private Integer price;
    private String name;
    private Double Version;

    void Mobile()
    {
        System.out.println("This is default constructor");
    }

    public Mobile(Integer price, String name, Double version) {
        this.price = price;
        this.name = name;
        Version = version;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getVersion() {
        return Version;
    }

    public void setVersion(Double version) {
        Version = version;
    }

    @Override
    void calling() {
        System.out.println("Calling enhanced");
    }

   void change_price(int change_price)
   {
       System.out.println("change_price");
   }
 void change_price(double change_price)
 {
     System.out.println("This is double change price");
 }



}

class cellular implements connection{
    void calling(){
        System.out.println("Calling function");

    }

    @Override
    public void connect() {
        System.out.println("connection is in progress");
    }
}
interface connection{
    void connect();


}

abstract class a{
    abstract void method1();
    void method2()
    {
        System.out.println("This is normal method in abstarct class");
    }


}

