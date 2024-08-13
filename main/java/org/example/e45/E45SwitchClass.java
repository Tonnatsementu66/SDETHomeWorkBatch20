package org.example.e45;

import java.util.Scanner;

public class E45SwitchClass {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Print prompt for user to enter the type of coffee (1 for Espresso, 2 for Latte, 3 for Cappuccino, 4 for Mocha)
        // Capture the coffee type input
        System.out.println("Enter the type of coffee (1 espresso, 2 for latte, 3 for cappuccino, 4 for mocha");
        int coffeeType = input.nextInt();

        // Calculate price using switch statement
        // Case 1
        //    Set price to $3.00
        switch (coffeeType) {
            // Case 2
            //    Set price to $4.00
            case 1:
                System.out.println("The price for your coffee is $3.00");
                break;
            case 2:
                System.out.println("The price for your coffee is $4.00");
                break;
            case 3:
                System.out.println("The price for your coffee is $4.50");
                break;
            case 4:
                System.out.println("The price for yor coffee is $5.00");
                break;
            default:
                System.out.println("Invalid coffee type entered");

            // Case 3
            //    Set price to $4.50
            // Case 4
            //    Set price to $5.00
            // Default
            //    Print "Invalid coffee type entered"

            // Print the price
            // Output: The price of your coffee is $____

        }

    }
}
