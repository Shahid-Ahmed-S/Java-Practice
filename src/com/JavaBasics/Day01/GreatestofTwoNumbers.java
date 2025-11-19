package com.JavaBasics.Day01;
import java.util.Scanner;

public class GreatestofTwoNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nProgram to find the largest if two numbers\n");
        System.out.print("--------------------------------------------\n");
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1+" > "+num2);
            System.out.println(num1+" is the largest number.");
        } else if (num1 == num2) {
            System.out.println(num1+" = "+num2);


        } else{
            System.out.println(num2+ " > "+num1);
            System.out.println(num2+" is the largest number.");
        }
        sc.close();
    }
}
