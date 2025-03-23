package Loops;

public class Fibonacci_number_code {
    public static void main(String[] args) {
        int a =0 , b=1; //1 , 2
        System.out.print(a + " " + b);
        for(int i=2;i<=10;i++)
        {
            int next = a+b;
            System.out.print(" " + next); //next =a+b =0+1 = 1
            a=b;
            b=next;

        }

    }

}
