package tasks;

import java.util.Scanner;

public class Lab001_Fizz_Buzz_Test {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        //  System.out.println("Enter the number");
        // int n = scanner.nextInt();
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");

            } else if (i % 5 == 0) {
                System.out.print(" BUZZ ");
            } else if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else
                System.out.print(" "+i + " ");
        }

    }
}


