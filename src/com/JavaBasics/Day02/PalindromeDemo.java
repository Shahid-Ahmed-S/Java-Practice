package com.JavaBasics.Day02;
import java.util.Scanner;
public class PalindromeDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the Palindrome of a given String");
        System.out.println("------------------------------------------------\n");

        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        String revWord = "";

        for(int i = word.length() - 1; i >= 0; i--) {
            revWord += word.charAt(i);
        }
        if(word.equals(revWord)) {
            System.out.println("The word '"+word+"' is Palindrome.");
        }
        else{
            System.out.println("The word '"+word+" is not Palindrome");
        }
    }
}
