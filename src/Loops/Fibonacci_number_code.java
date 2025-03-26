package Loops;

import java.util.Scanner;

public class Fibonacci_number_code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int a =0 , b=1; //1 , 2, 3,5
        System.out.print(a + " " + b);

        for(int i=2;i<=number;i++)
        {
            int next = a+b;
            System.out.print(" " + next); //next =a+b =0+1 = 1
            a=b;
            b=next;

        }

    }

}
