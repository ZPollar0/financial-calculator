package com.pluralsight;
import java.util.Scanner;


public class Calculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How much are you depositing?");
        double deposit = input.nextDouble();
        System.out.println("Please enter the interest rate.");
        double InterestRate = input.nextDouble();
        System.out.println("How many years will you compound?");
        int years = input.nextInt();

        double compound = deposit * (Math.pow(InterestRate , years));
        System.out.println("Your compound after " + years + " years is: " + compound);

        double interestAmount = compound - deposit;
        System.out.println("You built up " + interestAmount + " in interest over " + years + " years." );




    }
}
