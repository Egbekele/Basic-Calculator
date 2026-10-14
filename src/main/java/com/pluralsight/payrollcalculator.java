package com.pluralsight;

import java.util.Scanner;

public class payrollcalculator {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);

        // input your name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        //input your hours
        System.out.print("Enter the hours worked: ");
        float hours = scanner.nextFloat();

        // input your pay rate
        System.out.print("Enter your pay rate: $");
        float payRate = scanner.nextFloat();


        if (hours > 40) {
            float regularpay = 40 * payRate;
            float overtime = (hours - 40) * 1.5f * payRate;
            float total = regularpay + overtime;

            System.out.println("Your gross pay with your overtime pay is: $" + total);
        }
        else
        {
            float grossPay = hours * payRate;
            System.out.println("Your gross pay is: $" + grossPay);
        }


    }

}
