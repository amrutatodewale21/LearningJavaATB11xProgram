import java.util.Scanner;


public class Lab0011_WhileLoop_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        int factorial=1;
        if(number<=1)
        {
            System.out.println(factorial);
        }
        for (int i=1;i<=number;i++)
        {
            factorial = factorial*i;
        }
        System.out.println(factorial);


    }
}
