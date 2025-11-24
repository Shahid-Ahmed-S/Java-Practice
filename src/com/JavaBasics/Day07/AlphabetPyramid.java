package com.JavaBasics.Day07;
import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch--;
            for (int j = 1; j < i; j++) {
                ch--;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

