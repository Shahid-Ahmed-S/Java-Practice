package com.JavaBasics.Day04;

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num;

        while (result >= 10) {
            int sum = 0;
            int temp = result;

            while (temp > 0) {
                sum += temp % 10;
                temp = temp / 10;
            }

            result = sum;
        }

        System.out.println("Single digit sum: " + result);
    }
}

