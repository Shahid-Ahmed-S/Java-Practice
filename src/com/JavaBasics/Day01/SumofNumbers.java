package com.JavaBasics.Day01;
import java.util.Scanner;

public class SumofNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to print sum of N natural numbers");
        System.out.println("------------------------------------------\n");
        System.out.println("Enter the value of N: ");
        int N = sc.nextInt();
        int sum = N*(N+1)/2;
        System.out.println(sum);
    }
}
