package com.JavaBasics.Day03;
import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;

        while (num>0){
            int digits = num % 10;
            sum = sum + digits;
            num = num / 10;
        }
        System.out.println("Sum of digits = "+sum);

    }
}
