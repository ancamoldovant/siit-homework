package IntroToJava;


import javax.management.MBeanAttributeInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallestNrFromArray {
    public static void main(String[] args) {
        //2. Display the smallest number from an array of number
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduceti un numar ");
        int x = keyboard.nextInt();
        int y = keyboard.nextInt();
        int z = keyboard.nextInt();
        int h = keyboard.nextInt();
        int[]mylist= {x, y, z, h};
        int min = Arrays.stream(mylist).reduce(Math::min).orElse(Integer.MIN_VALUE);
        System.out.println("numarul minim este: " + min);
    }
}

