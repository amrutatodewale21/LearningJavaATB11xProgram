public class Lab001_typecasting {
    public static void main(String[] args) {
        byte a=100;
        //int b=a; //implicit widening type casting
        //int b = (int)a;//explicit widening type casting
        //System.out.println(b);

        short s = 2000;
        byte a1=(byte)s; // Narrowing can be done explicitely only
        System.out.println(a1);

        long l1=2345789L;
        int i1=(int)l1;
        System.out.println(i1);

        int cost=300;
        float GST=23.89f;
        float total=GST+cost;
        System.out.println(total);
    }
}
