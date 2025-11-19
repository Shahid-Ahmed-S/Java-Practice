package com.JavaBasics.Day03;
import java.util.Scanner;
public class CountVowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to count the number of VOWELS in the given word");
        System.out.println("--------------------------------------------------------\n");
        System.out.println("Enter a word: ");
        String word = sc.nextLine();

        int count = 0;

        word = word.toLowerCase();

        for (int i = 0; i < word.length(); i++){
            char letters = word.charAt(i);

            if (letters == 'a' || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u') {
                count++;
            }
        }
        System.out.println("Number of vowels in the word '"+word+"' is/are: "+count);

    }
}
