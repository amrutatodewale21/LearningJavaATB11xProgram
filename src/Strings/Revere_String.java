package Strings;

import java.util.Scanner;

public class Revere_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String name = scanner.next(); //madam
        int strlength = name.length();
        String reverse = "";
        for(int i =strlength-1 ; i>=0;i--)
        {
            reverse = reverse + name.charAt(i);
        }
        System.out.println(reverse);
    }
}
