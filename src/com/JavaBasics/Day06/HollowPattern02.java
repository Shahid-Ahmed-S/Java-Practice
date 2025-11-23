package com.JavaBasics.Day06;
import java.util.Scanner;
public class HollowPattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to print HOLLOW PATTERN");
        System.out.println("--------------------------------\n");
        System.out.print("Enter the number of ROWS: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                System.out.println("*");
            } else if (i == n) {
                for (int j = 1; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                System.out.print("*");
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}



