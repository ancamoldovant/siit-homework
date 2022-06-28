package IntroToJava;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        //4. Check if a number is palindrom( e.g palindrom 1221, 34143
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti un numar ");
        int x= keyboard.nextInt();
        StringBuilder sb = new StringBuilder();
        sb.append(x);
        sb.reverse();
        if (sb.toString().equals(String.valueOf(x))) {
            System.out.println(x + " is a palindrome number");
        }
        else{
            System.out.println(x + " is not a palindrome number");
        }
    }
}