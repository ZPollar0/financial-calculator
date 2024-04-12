package com.pluralsight;

import java.util.Scanner;

public class Calculators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your principle?");
        double principle = input.nextDouble();
        System.out.println("What is your interest rate?");
        double interestRate = input.nextDouble();
        System.out.println("How long is the length of the loan?");
        int loanLength = input.nextInt();

        double amount = interestRate * principle / (1 - Math.pow((1 + interestRate), (-1 * (loanLength *12))));
        System.out.println("Your loan total is " + amount);

        double interestPaid = amount - principle;
        System.out.println("Your remaining balance on your loan is: " + interestPaid);


    }
}
