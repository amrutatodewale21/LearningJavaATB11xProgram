package Loops;

import java.util.Scanner;

public class Factorial_practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial=1;
        for(int i=1;i<=number;i++)
        {
            factorial = factorial*i;//120;
        }
        System.out.println(factorial);

    }
}
