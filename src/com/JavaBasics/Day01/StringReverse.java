package com.JavaBasics.Day01;
import java.util.Scanner;

public class StringReverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to find the Reverse of a String");
        System.out.println("----------------------------------------\n");
        System.out.println("Enter a string to reverse: ");
        String word = sc.nextLine();
        String revWord = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        System.out.println("The word when Reversed is '"+revWord+"'");
    }
}
