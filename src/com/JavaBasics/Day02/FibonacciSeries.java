package com.JavaBasics.Day02;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        System.out.println("FIBONACCI SERIES:");

        if (n >= 1) {
            System.out.println(first+" ");
        }
        if(n>=2){
            System.out.println(second+" ");
        }
        for(int i = 3; i<=n; i++){
            int next = first + second;
            System.out.println(next+" ");

            first = second;
            second = next;
        }

    }
}
