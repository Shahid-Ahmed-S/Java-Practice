package com.JavaBasics.Day03;
import java.util.Scanner;
public class SecondLargestNumberinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to print the Second Largest Element iin the Array");
        System.out.println("---------------------------------------------------------\n");

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("The array must atleast have two numbers...");
        }
        int arr[] = new int[n];
        System.out.println("Enter " + n + " Elemnents in the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secLargest = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                secLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secLargest && arr[i] != largest) {
                secLargest = arr[i];
            }
        }
        System.out.println("Second Largest Element in the array: "+secLargest);
        sc.close();

    }
}


