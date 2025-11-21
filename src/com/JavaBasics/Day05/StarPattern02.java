package com.JavaBasics.Day05;
import java.util.Scanner;
 class StarPattern02 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("\nEnter number of ROWS: ");
            int n = sc.nextInt();

            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            sc.close();
        }
    }


