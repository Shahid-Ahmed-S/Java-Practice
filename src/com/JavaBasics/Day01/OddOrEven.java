package com.JavaBasics.Day01;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nProgram to find whether the number is Even or Odd");
        System.out.println("-------------------------------------------------\n");
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();
        if (num % 2 == 0 ) {
            System.out.println(num+" is Even");
        }//else if () {
        else {
            System.out.println(num+" is Odd");
        }
    }
}
