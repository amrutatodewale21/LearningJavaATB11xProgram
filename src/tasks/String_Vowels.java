package tasks;
import java.util.Scanner;

public class String_Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int vowels=0;
                int consonents =0;
        input = input.toLowerCase();

        for(int i=0;i<input.length();i++) {
            char character = input.charAt(i);
            if (Character.isLetter(character)) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                    vowels++;

                } else
                    consonents++;


            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonents);

        scanner.close();




    }

}
