package com.JavaBasics.Day06;
import java.util.Scanner;
public class HollowPatern01 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number of ROWS: ");
         int n = sc.nextInt();
                if (n <= 0)
                    return;
                if (n == 1) {
                    System.out.println("*");
                    return;
                }

                for (int i = 0; i < n; i++) System.out.print("*");
                System.out.println();
                for (int r = 0; r < n - 2; r++) {
                    System.out.print("*");
                    for (int s = 0; s < n - 2; s++) System.out.print(" ");
                    System.out.println("*");
                }
                for (int i = 0; i < n; i++) System.out.print("*");

                System.out.println();
            }
        }




