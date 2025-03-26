package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = scanner.next(); //madam
        String reversestring="";
       int strl = name.length();
       for(int i = strl-1;i>=0;i--)
       {
           reversestring = reversestring + name.charAt(i);


       }
       if(reversestring.toLowerCase().equals(name.toLowerCase()))
        {
            System.out.println( name + " is palindrome");
        }
        else
        System.out.println( name + " is not a palindrome");



    }
}
