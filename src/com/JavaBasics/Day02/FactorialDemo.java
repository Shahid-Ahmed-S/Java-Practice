package com.JavaBasics.Day02;
import java.util.Scanner;
public class FactorialDemo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find the factorial of a Number");
        System.out.println("------------------------------------------");

        System.out.println("Enter a number to find its Factorial: ");
        int num = sc.nextInt();
        int factorial = 1;

        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("Factorial of "+num+" is " +factorial);
        }
        else{
            System.out.println("Factorial not defined for Negative Numbers.");
        }

    }
}
