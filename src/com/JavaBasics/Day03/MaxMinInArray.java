package com.JavaBasics.Day03;
import java.util.Scanner;
public class MaxMinInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nProgram to find MAX & MIN element of an Array");
        System.out.println("---------------------------------------------\n");

        System.out.println("Enter the size of an Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter "+n+" elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > min) {
                max = arr[i];
            }if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);

    }
}
