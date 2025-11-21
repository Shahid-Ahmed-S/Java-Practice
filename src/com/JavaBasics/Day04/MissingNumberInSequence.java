package com.JavaBasics.Day04;
import java.util.Scanner;

import java.util.Scanner;

public class MissingNumberInSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+" elements: ");


        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = findMissing(arr);
        System.out.println("The missing number in this sequence is: "+missing);
    }

    public static int findMissing(int[] arr) {
        int min = arr[0], max = arr[0], sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        int expectedSum = (max - min + 1) * (min + max) / 2;
        return expectedSum - sum;
        //System.out.println("The missing number in this sequence is: " + expectedSum);
    }


}






/*public class MissingNumberInSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (isArithmetic(arr)) {
            System.out.println("Sequence Type: Arithmetic");
            System.out.println("Missing Number = " + findMissingArithmetic(arr));
        }
        else if (isFibonacci(arr)) {
            System.out.println("Sequence Type: Fibonacci");
            System.out.println("Missing Number = " + findMissingFibonacci(arr));
        }
        else {
            System.out.println("Unknown sequence. Cannot find missing number.");
        }
    }

    // ---------- ARITHMETIC CHECK ----------
    static boolean isArithmetic(int[] arr) {
        int d = arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return false;
            }
        }
        return true;
    }

    static int findMissingArithmetic(int[] arr) {
        int d = arr[1] - arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] != d) {
                return arr[i - 1] + d;
            }
        }
        return -1;
    }

    // ---------- SMART FIBONACCI CHECK ----------
    static boolean isFibonacci(int[] arr) {
        // Second number MUST be >= first number (except negative cases)
        if (arr.length < 3) return false;

        // Detect based only on first 3 elements
        return (arr[2] == arr[1] + arr[0]);
    }

    static int findMissingFibonacci(int[] arr) {
        for (int i = 2; i < arr.length; i++) {
            int expected = arr[i - 1] + arr[i - 2];
            if (arr[i] != expected) {
                return expected; // Missing number FOUND
            }
        }
        return -1;  // No missing
    }
}*/



