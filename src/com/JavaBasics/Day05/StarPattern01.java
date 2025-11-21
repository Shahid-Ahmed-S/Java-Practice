package com.JavaBasics.Day05;
import java.util.Scanner;
import java.util.Scanner;

class StarPattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of ROWS: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {        // Outer loop → rows
            for (int j = 1; j <= i; j++) {    // Inner loop → stars
                System.out.print("*");
            }
            System.out.println();  // New line after each row
        }
        sc.close();
    }
}
