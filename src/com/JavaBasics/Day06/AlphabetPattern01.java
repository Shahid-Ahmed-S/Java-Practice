package com.JavaBasics.Day06;
import java.util.Scanner;
public class AlphabetPattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ROWS: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }
    }
}





