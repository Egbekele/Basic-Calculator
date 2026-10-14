package com.pluralsight;

import java.util.Scanner;


public class Calculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Possible calculations: ");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");

        System.out.print("Please select an option: ");
        String choose = scanner.nextLine();

        int total = num1 * num2;

        System.out.println(num1 + " * " + num2  + " = " + total);











    }
}
