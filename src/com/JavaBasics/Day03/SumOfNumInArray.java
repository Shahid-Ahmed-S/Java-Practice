package com.JavaBasics.Day03;
import java.util.Scanner;
public class SumOfNumInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to get the sum of the Array elements");
        System.out.println("--------------------------------------------\n");

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum of "+n+" elements of the Array: "+sum);
    }
}
