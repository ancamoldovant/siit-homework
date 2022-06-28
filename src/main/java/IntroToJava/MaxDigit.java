package IntroToJava;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        //3. Display the max digit from a number.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti un numar cel mult 4 caractre ");
        int x = keyboard.nextInt();
        int mii = x / 1000;//2
        int Delucru = x / 100; //27
        int sute = Delucru % 10;//7
        int f = x/10; //274
        int zeci = f % 10; // 4
        int unitati= x % 10; //6
        int[]mylist= {mii, sute, zeci, unitati};
        int max = Arrays.stream(mylist).reduce(Math::max).orElse(Integer.MAX_VALUE);
        System.out.println("Cifra maxima este: " + max);
    }
}
