package JUNIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.swing.text.html.HTML.Tag.INPUT;

public class Calculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number");
        String numberAsString = keyboard.nextLine();

        String line = numberAsString;
        String pattern = "(\\+|-)?\\s*\\d+\\s*(mm|cm|dm|m|km)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Unitatea de masura: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
        System.out.println("_________");
        String line2 = numberAsString;
        String pattern2 = "(\\+|-)?\\s*\\d+\\s*(mm|cm|dm|m|km)";
        Pattern r2 = Pattern.compile(pattern);
        Matcher m2 = r.matcher(line2);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Unitatea de masura: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
        System.out.println("_________");
        String line3 = numberAsString;
        String pattern3 = "(+|-)?\\s*\\d+\\s*(mm|cm|dm|m|km)";
        Pattern r3 = Pattern.compile(pattern);
        Matcher m3 = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Operandul: " + m.group(1));
            System.out.println("Unitatea de masura: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }
        String lineNumber = numberAsString;
        String patternNumber = "^\\s*(\\+|-)?\\s*\\d+";
        Pattern rNumber  = Pattern.compile(patternNumber);
        Matcher n = rNumber .matcher(lineNumber);
        if (n.find()) {
            System.out.println("Found value: " + n.group(0));

        } else {
            System.out.println("NO MATCH");
        }
        String lineNumber1 = numberAsString;
        String patternNumber1 = "^\\s*(\\+|-)?\\s*\\d+";
        Pattern rNumber1 = Pattern.compile(patternNumber1);
        Matcher n1 = rNumber1 .matcher(lineNumber1);
        if (n1.find()) {
            System.out.println("Found value: " + n1.group(0));
        } else {
            System.out.println("NO MATCH");
        }
        String lineNumber2 = numberAsString;
        String patternNumber2 = "^\\s*(\\+|-)?\\s*\\d+";
        Pattern rNumber2 = Pattern.compile(patternNumber2);
        Matcher n2 = rNumber2 .matcher(lineNumber2);
        if (n2.find()) {
            System.out.println("Found value: " + n2.group(0));
        } else {
            System.out.println("NO MATCH");
        }
    }}