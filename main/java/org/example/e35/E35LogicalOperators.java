package org.example.e35;

import java.util.Scanner;

public class E35LogicalOperators {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);


        // Print prompt for user to answer if they need a loan
        System.out.println("Do you need a loan (true/false)");
        // Capture the loan requirement input
        boolean needsLoan = input.nextBoolean();


        // Check if the user needs a loan
        if (needsLoan) {
            System.out.println("What is your credit score");
            int creditScore = input.nextInt();
            String eligibility;
            if (creditScore < 600) {
                System.out.println("The eligibility is Not eligible");
            } else if (creditScore >= 600 && creditScore <= 700) {
                System.out.println("The eligibility is Maybe eligible");

            } else if (creditScore >= 701 && creditScore <= 800) {
                System.out.println("The eligibility is Eligible");
            } else if (creditScore > 800) {
                System.out.println("The eligibility is Definitely eligible");
            }


        } else {
            System.out.println("The eligibility is Unknown");
        }

    }
}

