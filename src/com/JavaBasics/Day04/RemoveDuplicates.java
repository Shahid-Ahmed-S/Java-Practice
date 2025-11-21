package com.JavaBasics.Day04;
import java.util.Scanner;
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] result = removeDuplicates(arr);
        System.out.println("After removing Duplicates: ");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]+" ");
        }
    }
    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < k; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[k] = arr[i];
                k++;
            }
        }

        int[] unique = new int[k];
        for (int i = 0; i < k; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }
}
